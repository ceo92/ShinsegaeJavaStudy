package board_project.local;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class BoardExample {


  private static final BoardService boardService = new BoardService();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      boardService.printMenu(); // 메인 메뉴: 1.Create | 2.Read | 3. Clear | 4.Exit
      int menuNum = Integer.parseInt(br.readLine());
      System.out.println();
      switch (menuNum) {
        case 1:
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
          System.out.println();
          break;
        case 2:
          System.out.println("[새 게시물 읽기]");
          System.out.print("bno: ");
          int readBno = Integer.parseInt(br.readLine());
          System.out.println("###########");
          try {
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
            int readSubMenuNum = Integer.parseInt(br.readLine());
            switch (readSubMenuNum) {
              case 1:
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
                  boardService.updateBoard(new BoardDto(findBoard.getBno(), updateTitle , updateContent , updateWriter));
                }

                break;
              case 2:
                boardService.removeBoard(findBoard.getBno());
                break;
              case 3:
                boardService.printMenu();
                break;
            }

          }catch (IllegalStateException e) {
            System.out.println("*****Exception********");
            System.out.println(e.getMessage());
            System.out.println("***********************");
            break;
          }

          break;

        case 3:
          System.out.println("[게시물 전체 삭제]");
          System.out.println("-".repeat(50));
          System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
          System.out.print("메뉴 선택: ");
          if (Integer.parseInt(br.readLine()) == 1) {
            boardService.removeAllBoard();
          }
          break;

        case 4:
          System.out.println("**게시판 종료**");
          return;
        default:
          System.out.println("잘못된 입력입니다 다시 입력해주십쇼 ??");
          break;
      }
    }


    }

}

