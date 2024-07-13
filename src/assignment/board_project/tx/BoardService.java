package assignment.board_project.tx;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public class BoardService {

  private static final BoardRepository boardRepository = new BoardRepository();
  //CRUD 된 게 바로 반영이 되어야하니 각 메서드(쿼리) 마다 커밋 및 롤백이 일어나야함

  // 조회는 트랜잭션 시작할 필요 없으니 수동 커밋 모드 X 즉 수동으로 커밋 롤백할일도 없으니try-catch도 안써도 됨그냥 커넥션만 생성해서 주입시켜주면됨 리포에 ㅇㅇ
  public void printMenuAndBoards() throws SQLException {
    Connection con = getConnection();
    con.setReadOnly(true);
    System.out.println("[게시물 목록]");
    System.out.println("-".repeat(50));
    System.out.println("no\t\twriter\t\t\tdate\t\t\t\t\ttitle");

    System.out.println("-".repeat(50));
    List<Board> list = boardRepository.findAll(con);
    for (int i = list.size() - 1; i >= 0; i--) {
      System.out.println(list.get(i));
    }

    System.out.println("-".repeat(50));
    System.out.println("메인 메뉴: 1.Create | 2.Read | 3. Clear | 4.Exit");
    System.out.print("메뉴 선택: ");
    con.setReadOnly(false); //히카리 커넥션 풀을 사용할 경우 다시 false로 반환해야됨 나중에 또 쓸 때 readOnly가 되지 않게끔
    close(con);

  }


  public void saveBoard(Board board) throws SQLException { //위임
    Connection con = null;
    try {
      con = getConnection();
      con.setAutoCommit(false);
      boardRepository.save(con , board);
      con.commit();
    }catch (SQLException e){
      con.rollback();
      System.out.println("error = " + e.getMessage());
    }
    finally {
      close(con); //롤백이든 커밋이든 일단 커넥션은 종료해야하므로 finally에 ㅇㅇ
    }
  }


  // 단순 조회는 트랜잭션 X ,수동커밋모드 필요없음
  public Board findOne(int bno) throws SQLException {
    Connection con = getConnection();
    con.setReadOnly(true);
    Board findBoard = boardRepository.findByBno(con, bno)
        .orElseThrow(() -> new IllegalStateException("지정한 bno에 해당되는 Board 값은 존재하지 않습니다!"));
    con.setReadOnly(false);
    close(con);
    return findBoard; //예외는 어차피 리포지토리에서 던져줌
  }

  //일단 위임하자
  public void updateBoard(BoardUpdateDto boardUpdateDto) throws SQLException{ // 1
    Connection con = null;
    try {
      con = getConnection();
      con.setAutoCommit(false);
      boardRepository.update(con , boardUpdateDto);
      con.commit();
    }catch (SQLException e){
      con.rollback();
      System.out.println("error = " + e.getMessage());
    }
    finally {
      close(con); //롤백이든 커밋이든 일단 커넥션은 종료해야하므로 finally에 ㅇㅇ
    }
  }


  public void removeBoard(int bno) throws SQLException {
    Connection con = null;
    try {
      con = getConnection();
      con.setAutoCommit(false);
      boardRepository.remove(con , bno);
      con.commit();
    }catch (SQLException e){
      con.rollback();
      System.out.println("error = " + e.getMessage());
    }
    finally {
      close(con); //롤백이든 커밋이든 일단 커넥션은 종료해야하므로 finally에 ㅇㅇ
    }

  }

  public void removeAllBoard() throws SQLException {
    Connection con = null;
    try {
      con = getConnection();
      con.setAutoCommit(false);
      boardRepository.removeAll(con);
      con.commit();
    }catch (SQLException e){
      con.rollback();
      System.out.println("error = " + e.getMessage());
    }
    finally {
      close(con); //롤백이든 커밋이든 일단 커넥션은 종료해야하므로 finally에 ㅇㅇ
    }

  }

  private static Connection getConnection() {
    return DBConnectionUtil.getConnection();
  }

  private static void close(Connection con){
    if (con != null) {
      try {
        con.setAutoCommit(true);
        con.close(); //Connection 닫기
      } catch (SQLException e) {
        System.out.println("error = " + e.getMessage());
      }
    }
  }
}
