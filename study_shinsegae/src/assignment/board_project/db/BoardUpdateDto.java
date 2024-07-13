package board_project.db;

import lombok.Data;

@Data
public class BoardUpdateDto {
  private int bno;
  private String btitle;
  private String bcontent;
  private String bwriter;


  public BoardUpdateDto(int bno, String btitle, String bcontent, String bwriter) {
    this.bno = bno;
    this.btitle = btitle;
    this.bcontent = bcontent;
    this.bwriter = bwriter;
  }



}
