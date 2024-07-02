package _0702_interface.prob02;

public class TVFactory extends Factory implements IWorkingTogether{


  public TVFactory(String name , int openHour, int closeHour) {
    super(name , openHour , closeHour);
  }


  /**
   * 추상클래스 Factory 메서드
   */
  @Override
  int makeProducts(char skill) {
    if (skill == 'A'){
      return 8*getWorkingTime();
    }

    else if (skill == 'B'){
      return 5*getWorkingTime();
    }

    else if (skill == 'C'){
      return 3*getWorkingTime();
    }
    else{
      return getWorkingTime();
    }



  }

  @Override
  public String toString() {
    return name;
  }

  /**
   * 인터페이스 IWorkingTogether 메서드
   */
  @Override
  public int workTogether(IWorkingTogether partner) {
    return makeProducts('C');

  }
}
