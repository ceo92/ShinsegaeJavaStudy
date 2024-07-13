package assignment._0703_jdbc;


import static assignment._0703_jdbc.ConnectionConst.PASSWORD;
import static assignment._0703_jdbc.ConnectionConst.URL;
import static assignment._0703_jdbc.ConnectionConst.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx extends MemberDB{

  public static void main(String[] args) {
    System.out.println("==회원 정보 입력 후 조회===");
    //회원의 정보를 사용자 받는 기능  (static 메소드로)
    //Member 클래스(VO)
    memberInsert(); //Member member
    memberSearch();
    System.out.println("==회원 정보수정 후 조회===");
    memberUpdate();
    memberSearch();
    System.out.println("==회원 정보삭제 후 조회===");
    memberDelete();
    memberSearch();

  }

  private static void memberDelete() {
    //쿼리
    String query = "DELETE FROM member where id = ? ";

    //중복 1 : con , pstmt 초기화
    Connection con = null;
    PreparedStatement pstmt = null;
    int result = 0;

    try {
      //중복 2 : con , pstmt 값 할당
      con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
      System.out.println(con);
      pstmt = con.prepareStatement(query);


      pstmt.setInt(2, 1);

      result = pstmt.executeUpdate();
      //중복 3 : 반영된 row 수에 따른 실패여부
      if (result == 1) {
        System.out.println("회원 정보가 완전 잘 수정 되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 수정이 실패하였습니다.");
      }

      //중복 4 : pstmt , con 닫기
      pstmt.close();
      con.close();
      //중복 5 : 예외 던지기
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  private static void memberUpdate() {

    String query = "UPDATE member SET job = ? where id = ? ";

    Connection con = null;
    PreparedStatement pstmt = null;
    int result = 0;

    try {
      con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

      System.out.println(con);
      pstmt = con.prepareStatement(query);

      pstmt.setString(1, "engineer");
      pstmt.setInt(2, 1);

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 완전 잘 수정 되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 수정이 실패하였습니다.");
      }

      pstmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

  }

  private static void memberInsert() {

    String query = "INSERT INTO member VALUES(?,?,?)";

    Connection con = null;
    PreparedStatement pstmt = null;
    int result = 0;

    try {
      con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

      System.out.println(con);
      pstmt = con.prepareStatement(query);
      pstmt.setInt(1, 4);
      pstmt.setString(2, "kss");
      pstmt.setString(3, "professor");

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 입력되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 입력이 실패하였습니다.");
      }

      close(null , pstmt , con);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }


  }


  public static void memberSearch() {

    String query = "SELECT * FROM member";

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
      con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

      System.out.println(con);
      stmt = con.createStatement();
      rs = stmt.executeQuery(query);
      while (rs.next()) {
        int id = rs.getInt("id");

        String name = rs.getString("name");
        String job = rs.getString("job");
        System.out.printf("id : %d name : %s  job : %s", id, name, job);
      }
      close(rs, stmt, con);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

  }

  private static void close(ResultSet rs, Statement stmt, Connection con) throws SQLException {
    rs.close();
    stmt.close();
    con.close();
  }

}