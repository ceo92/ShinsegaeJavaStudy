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

public abstract class MemberDB {

  public static void printSuccess(int result){
    if (result == 1) {
      System.out.println("회원 정보가 입력되었습니다.");
    } else if (result == 0) {
      System.out.println("회원 정보 입력이 실패하였습니다.");
    }

  }

  public static Connection getConnection(){
    try {
      Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
      System.out.println("connection = " + connection+"class = "+connection.getClass());
      return connection;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }


  public void close(ResultSet rs , Connection con , Statement stmt){
    if (rs != null) {
      try {
        rs.close();
      } catch (SQLException e) {
        System.out.println("errorcode : "+e.getErrorCode());
      }
    }

    if (stmt != null) {
      try {
        stmt.close();
      } catch (SQLException e) {
        System.out.println("errorcode : "+e.getErrorCode());

      }
    }

    if (con != null){
      try {
        con.close();
      } catch (SQLException e) {
        System.out.println("errorcode : "+e.getErrorCode());

      }
    }
  }






}
