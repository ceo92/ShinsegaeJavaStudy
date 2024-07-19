package assignment.board_project.tx.server;

import assignment.board_project.tx.domain.Board;
import assignment.board_project.tx.dto.BoardUpdateDto;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface BoardRepository {

  void save(Connection con, Board board) throws SQLException;


  Optional<Board> findByBno(Connection con , int bno) throws SQLException;


  void update(Connection con, BoardUpdateDto boardUpdateDto) throws SQLException;


  List<Board> findAll(Connection con) throws SQLException;

  void remove(Connection con, int bno);

  void removeAll(Connection con);



}
