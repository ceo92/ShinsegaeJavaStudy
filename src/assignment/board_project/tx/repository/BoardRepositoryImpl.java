package assignment.board_project.tx.repository;

import assignment.board_project.tx.dto.BoardUpdateDto;
import assignment.board_project.tx.domain.Board;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BoardRepositoryImpl implements BoardRepository {


  public void save(Connection con, Board board) throws SQLException {
    String sql = "insert into Board(title , content , writer , date) values(? , ? , ? , ?)";
    PreparedStatement pstmt = null;

    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, board.getBtitle()); //인덱스 1로 해서 1번필드에는 memberid 지정
      pstmt.setString(2, board.getBcontent()); //인덱스 1로 해서 1번필드에는 memberid 지정
      pstmt.setString(3, board.getBwriter()); //인덱스 1로 해서 1번필드에는 memberid 지정
      pstmt.setTimestamp(4,
          Timestamp.valueOf(board.getBdate().atStartOfDay())); //인덱스 1로 해서 1번필드에는 memberid 지정
      pstmt.executeUpdate();

    } catch (SQLException e) {
      throw e;
    }finally {
      //커넥션 연결 => 쿼리 요청 역순으로 close
      close(pstmt, null);
    }
  }


  public Optional<Board> findByBno(Connection con , int bno) throws SQLException {
    String sql = "SELECT * FROM Board WHERE bno = ?";
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setInt(1, bno);
      rs = pstmt.executeQuery();

      if (rs.next()) {
        Board board = new Board(rs.getInt("bno"),
            rs.getString("title"),
            rs.getString("content"),
            rs.getString("writer"),
            rs.getDate("date").toLocalDate());
        return Optional.of(board);
      } else {
        return Optional.empty();
      }

    } catch (SQLException e) {
      throw e;
    }finally {
      //커넥션 연결 => 쿼리 요청 역순으로 close
      close(pstmt, rs);
    }
  }

  public void update(Connection con, BoardUpdateDto boardUpdateDto) throws SQLException {
    String sql = "update Board set title = ? , content = ? , writer = ? where bno = ?";
    PreparedStatement pstmt = null;
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, boardUpdateDto.getBtitle());
      pstmt.setString(2, boardUpdateDto.getBcontent());
      pstmt.setString(3, boardUpdateDto.getBwriter());
      pstmt.setInt(4, boardUpdateDto.getBno());
      pstmt.executeUpdate();
    } catch (SQLException e) {
      throw e;
    } finally {
      //커넥션 연결 => 쿼리 요청 역순으로 close
      close(pstmt, null);
    }
  }


  public List<Board> findAll(Connection con) throws SQLException {
    List<Board> list = new ArrayList<>();
    String sql = "select * from Board";

    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
      pstmt = con.prepareStatement(sql);
      rs = pstmt.executeQuery();
      while (rs.next()) {
        list.add(new Board(rs.getInt("bno"),
            rs.getString("title"),
            rs.getString("content"),
            rs.getString("writer"),
            rs.getDate("date").toLocalDate()));
      }
      return list;
    } catch (SQLException e) {
      throw e;
    }finally {
      //커넥션 연결 => 쿼리 요청 역순으로 close
      close(pstmt, rs);
    }
  }

  //단건 수정 , 삭제 : executeQuery()에 sql 지정 x ,
  public void remove(Connection con, int bno) {
    String sql = "delete from Board where bno=?";
    PreparedStatement pstmt = null;

    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setInt(1, bno);

      pstmt.executeUpdate();

    } catch (SQLException ex) {
      throw new RuntimeException(ex);
    } finally {
      //커넥션 연결 => 쿼리 요청 역순으로 close
      close(pstmt, null);
    }
  }

  public void removeAll(Connection con) {
    String sql = "delete from Board";
    PreparedStatement pstmt = null;

    try {

      pstmt = con.prepareStatement(sql);
      pstmt.executeUpdate(sql);

    } catch (SQLException ex) {
      throw new RuntimeException(ex);
    } finally {
      //커넥션 연결 => 쿼리 요청 역순으로 close
      close(pstmt, null);
    }
  }

  private void close(Statement stmt, ResultSet rs) {

    if (rs != null) {
      try {
        rs.close(); //ResultSet 닫기
      } catch (SQLException e) {
        System.out.println("error = " + e.getMessage());
      }
    }

    if (stmt != null) {
      try {
        stmt.close(); //PreparedStatement 닫기
      } catch (SQLException e) {
        System.out.println("error = " + e.getMessage());
      }
    }
    //이렇게 로직을 구성하면 쿼리 날리는 요청 stmt 닫을때 예외 터져도 결국 catch로 잡으니 con도 정상적으로 닫힘
    //안 닫으면 커넥션 계속 유지가 되니 메모리 터짐 ㅇㅇ

    // 이미 닫을때 예외가 터지는 거니 특별히 할 수 있는거 없음 , 로그로 찍는거밖에.
  }




}