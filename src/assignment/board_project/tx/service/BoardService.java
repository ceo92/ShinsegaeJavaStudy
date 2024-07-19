package assignment.board_project.tx.service;

import assignment.board_project.tx.domain.Board;
import assignment.board_project.tx.dto.BoardUpdateDto;
import java.sql.SQLException;

public interface BoardService {

  void printMenuAndBoards() throws SQLException;

  void saveBoard(Board board) throws SQLException;


  Board findOne(int bno) throws SQLException;

  void updateBoard(BoardUpdateDto boardUpdateDto) throws SQLException;

  void removeBoard(int bno) throws SQLException;

  void removeAllBoard() throws SQLException;



}
