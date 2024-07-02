package _0701_inheritance_assignment.prob03;

public abstract class Content {
  private String title;
  private int price;

  public Content(String title) {
    this.title = title;
  }

  public Content() {
  }

  abstract void totalPrice();

  void show(){
    System.out.println(getTitle()+" 비디오의 가격은 "+getPrice()+"원 입니다.");
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}

class Video extends Content{
  private String genre;

  public Video(String title, String genre) {
    super(title);
    this.genre = genre;
  }



  @Override
  void totalPrice() {
    if (genre.equals("new")){
      setPrice(2000);
    }
    else if (genre.equals("comic")){
      setPrice(1500);
    }
    else if (genre.equals("child")){
      setPrice(1000);
    }
    else{
      setPrice(500);
    }
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }
}
