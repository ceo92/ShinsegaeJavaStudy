package assignment.board_project.tx;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.sql.SQLException;
import java.time.LocalDate;

public class BoardExample {


  private static final BoardService boardService = new BoardService();

  public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      //메뉴 판 및 Board 리스트 출력
      boardService.printMenuAndBoards();

      int menuNum = Integer.parseInt(br.readLine());

      System.out.println();
      switch (menuNum) {
        //저장
        case 1:
          doSave(br);
          break;
        //단 건 조회
        case 2:
          int readBno = inputBno(br);
          Board board;
          try {
            board = findBoard(readBno);
          }catch (IllegalStateException e) {
            System.out.println("=======================ERROR=======================");
            System.out.println(e.getMessage());
            System.out.println("처음부터 다시 해주세요");
            System.out.println("===================================================");
            System.out.println();
            break;
          }

          int readSubMenuNum = Integer.parseInt(br.readLine());

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
    if (Integer.parseInt(br.readLine()) == 1) {
      boardService.removeAllBoard();
    }
    else {
      System.out.println("취소하였습니다.");
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
    if (Integer.parseInt(br.readLine()) == 1) {
      boardService.saveBoard(board);
    }
    else {
      System.out.println("취소하였습니다.");
    }
    System.out.println();
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
    if (Integer.parseInt(br.readLine()) == 1) {
      boardService.updateBoard(new BoardUpdateDto(findBoard.getBno(), updateTitle , updateContent , updateWriter));
    }
    else {
      System.out.println("취소하였습니다.");
    }
  }

}

