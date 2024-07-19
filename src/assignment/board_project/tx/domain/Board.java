package assignment.board_project.tx.domain;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Board implements Comparable<Board> {

  private int bno;
  private String btitle;
  private String bcontent;
  private String bwriter;
  private LocalDate bdate;

  public Board() {
  }


  public Board(String btitle, String bcontent, String bwriter, LocalDate bdate) {
    this.btitle = btitle;
    this.bcontent = bcontent;
    this.bwriter = bwriter;
    this.bdate = bdate;
  }


  public Board(int bno, String btitle, String bcontent, String bwriter, LocalDate bdate) {
    this.bno = bno;
    this.btitle = btitle;
    this.bcontent = bcontent;
    this.bwriter = bwriter;
    this.bdate = bdate;
  }

  @Override
  public String toString() {
    return bno + "\t\t" + bwriter + "\t\t\t" + bdate + "\t\t\t\t\t" + btitle;
  }

  @Override
  public int compareTo(Board o) {
    return o.getBno() - this.getBno();
  }
}
