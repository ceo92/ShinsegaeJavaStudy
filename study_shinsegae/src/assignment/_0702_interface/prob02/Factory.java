package _0702_interface.prob02;

public abstract class Factory {
    int openHour;
    int closeHour;

    String name;

  public int getOpenHour() {
    return openHour;
  }

  public void setOpenHour(int openHour) {
    this.openHour = openHour;
  }

  public int getCloseHour() {
    return closeHour;
  }

  public void setCloseHour(int closeHour) {
    this.closeHour = closeHour;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Factory(String name , int openHour, int closeHour) {
    this.name = name;
    this.openHour = openHour;
    this.closeHour = closeHour;
  }

  public String getFactoryName(){
    return name;
  }

  public int getWorkingTime(){
    return closeHour - openHour;
  }

  abstract int makeProducts(char skill);

}
