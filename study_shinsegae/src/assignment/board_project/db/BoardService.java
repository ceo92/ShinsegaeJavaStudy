package board_project.db;

import java.sql.SQLException;
import java.util.List;


public class BoardService {

  private static final BoardRepository boardRepository = new BoardRepository();


  public void printMenu() throws SQLException {
    System.out.println("[게시물 목록]");
    System.out.println("-".repeat(50));
    System.out.println("no\t\twriter\t\t\tdate\t\t\t\t\ttitle");

    System.out.println("-".repeat(50));
    List<Board> list = boardRepository.findAll();
    for (int i=list.size()-1 ; i>=0 ; i--){
      System.out.println(list.get(i));
    }

    System.out.println("-".repeat(50));
    System.out.println("메인 메뉴: 1.Create | 2.Read | 3. Clear | 4.Exit");
    System.out.print("메뉴 선택: ");

  }


  public void saveBoard(Board board) throws SQLException { //위임
    boardRepository.save(board);
  }

  public Board findOne(int bno) throws SQLException {
    return boardRepository.findByBno(bno).orElseThrow(()->new IllegalStateException("지정한 bno에 해당되는 Board 값은 존재하지 않습니다!")); //예외는 어차피 리포지토리에서 던져줌
  }

  //일단 위임하자
  public void updateBoard(BoardUpdateDto boardUpdateDto) throws SQLException{ // 1
    boardRepository.update(boardUpdateDto);
  }


  public void removeBoard(int bno) {
    boardRepository.remove(bno);
  }

  public void removeAllBoard()  {
    boardRepository.removeAll();
  }
}
