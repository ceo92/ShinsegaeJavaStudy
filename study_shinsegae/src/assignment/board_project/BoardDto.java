package board_project;

import lombok.Data;

@Data
public class BoardDto {
  private int bno;
  private String btitle;
  private String bcontent;
  private String bwriter;


  public BoardDto(int bno, String btitle, String bcontent, String bwriter) {
    this.bno = bno;
    this.btitle = btitle;
    this.bcontent = bcontent;
    this.bwriter = bwriter;
  }

  public BoardDto(String btitle, String bcontent, String bwriter) {
    this.btitle = btitle;
    this.bcontent = bcontent;
    this.bwriter = bwriter;
  }
}
