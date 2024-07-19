package assignment.board_project.tx.client;


import assignment.board_project.tx.server.BoardService;
import assignment.board_project.tx.server.BoardServiceImpl;
import assignment.board_project.tx.dto.BoardUpdateDto;
import assignment.board_project.tx.domain.Board;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.time.LocalDate;

public class BoardExample {


  private static final BoardService boardService = new BoardServiceImpl(); //DI

  public static void main(String[] args) throws IOException, SQLException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      //메뉴 판 및 Board 리스트 출력
      boardService.printMenuAndBoards();
      int menuNum;
      try {
        menuNum = Integer.parseInt(br.readLine());
      } catch (NumberFormatException e) {
        System.out.println("숫자를 입력해주세요");
        continue;
      }

      System.out.println();
      switch (menuNum) {
        //저장
        case 1:
          doSave(br);
          break;
        //단 건 조회
        case 2:
          Board board;
          try {
            int readBno = inputBno(br);
            board = findBoard(readBno);
          } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            break;
          } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해주세요");
            break;
          }

          int readSubMenuNum = 0;
          try {
            readSubMenuNum = Integer.parseInt(br.readLine());
          } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해주세요");
          }
          //메뉴 선택 , OK Cancel
          switch (readSubMenuNum) {
            //수정
            case 1:
              doUpdate(br, board);
              break;
            //단 건 삭제
            case 2:
              doRemove(board);
              break;
            //메뉴판으로
            case 3:
              break;
            default:
              System.out.println("잘못된 입력입니다.");
              break;
          }
          break;
        //전부 삭제
        case 3:
          doRemoveAll(br);
          break;
        //종료
        case 4:
          System.out.println("**게시판 종료**");
          return;
        default:
          System.out.println("잘못된 입력입니다.");
          break;
      }
    }


  }

  private static Board findBoard(int readBno) throws SQLException {
    Board findBoard = boardService.findOne(readBno);
    System.out.println("번호: " + findBoard.getBno());
    System.out.println("제목: " + findBoard.getBtitle());
    System.out.println("내용: " + findBoard.getBcontent());
    System.out.println("작성자: " + findBoard.getBwriter());
    System.out.println("날짜: " + findBoard.getBdate());
    System.out.println("###########");
    System.out.println("-".repeat(50));
    System.out.println("보조 메뉴: 1. Update | 2.Delete | 3. List");
    System.out.print("메뉴 선택: ");
    return findBoard;
  }

  private static int inputBno(BufferedReader br) throws IOException {
    System.out.println("[새 게시물 읽기]");
    System.out.print("bno: ");
    int readBno = Integer.parseInt(br.readLine());
    System.out.println("###########");
    return readBno;
  }

  private static void doRemoveAll(BufferedReader br) throws IOException, SQLException {
    System.out.println("[게시물 전체 삭제]");
    System.out.println("-".repeat(50));
    System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
    System.out.print("메뉴 선택: ");
    int subMenuNum = 0;
    while (true) {
      try {
        subMenuNum = Integer.parseInt(br.readLine());
      } catch (NumberFormatException e) {
        System.out.println("숫자를 입력해주세요");
        continue;
      }
      if (subMenuNum == 1) {
        boardService.removeAllBoard();
        break;
      }
      else if(subMenuNum == 2){
        System.out.println("취소하였습니다.");
        break;
      }
      else{
        System.out.println("1과 2 중 하나를 입력해주세요");
      }
    }

  }

  private static void doSave(BufferedReader br) throws IOException, SQLException {
    System.out.println("[새 게시물 입력]");
    System.out.print("제목: ");
    String title = br.readLine();
    System.out.print("내용: ");
    String content = br.readLine();
    System.out.print("작성자: ");
    String writer = br.readLine();
    LocalDate date = LocalDate.now();
    Board board = new Board(title, content, writer, date);
    System.out.println("-".repeat(50));
    System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
    System.out.print("메뉴 선택: ");
    int subMenuNum = 0;
    while (true) {
      try {
        subMenuNum = Integer.parseInt(br.readLine());
      } catch (NumberFormatException e) {
        System.out.println("숫자를 입력해주세요");
        continue;
      }
      if (subMenuNum == 1) {
        boardService.saveBoard(board);
        break;
      }
      else if(subMenuNum == 2){
        System.out.println("취소하였습니다.");
        break;
      }
      else{
        System.out.println("1과 2 중 하나를 입력해주세요");
      }
    }
  }

  private static void doRemove(Board findBoard) throws SQLException {
    boardService.removeBoard(findBoard.getBno());
  }

  private static void doUpdate(BufferedReader br, Board findBoard)
      throws IOException, SQLException {
    System.out.println("[수정 내용 입력]");
    System.out.print("제목: ");
    String updateTitle = br.readLine();
    System.out.print("내용: ");
    String updateContent = br.readLine();
    System.out.print("작성자: ");
    String updateWriter = br.readLine();
    System.out.println("-".repeat(50));
    System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
    System.out.print("메뉴 선택: ");
    int subMenuNum = 0;
    while (true) {
      try {
        subMenuNum = Integer.parseInt(br.readLine());
      } catch (NumberFormatException e) {
        System.out.println("숫자를 입력해주세요");
        continue;
      }
      if (subMenuNum == 1) {
        boardService.updateBoard(new BoardUpdateDto(findBoard.getBno() , updateTitle , updateContent , updateWriter));
        break;
      }
      else if(subMenuNum == 2){
        System.out.println("취소하였습니다.");
        break;
      }
      else{
        System.out.println("1과 2 중 하나를 입력해주세요");
      }
    }

  }

  private static void selectSubMenuNum(BufferedReader br , Board board) throws IOException, SQLException {

  }
}

