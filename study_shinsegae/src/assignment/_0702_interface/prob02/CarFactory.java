package _0702_interface.prob02;

public class CarFactory extends Factory implements IWorkingTogether{

  public CarFactory(String name , int openHour , int closeHour) {
    super(name , openHour , closeHour);
  }


  /**
   * Factory 추상클래스 메서드
   */
  @Override
  int makeProducts(char skill) {
    if (skill == 'A'){
      return 3*getWorkingTime();
    }

    else if (skill == 'B'){
      return 2*getWorkingTime();
    }

    else if (skill == 'C'){
      return getWorkingTime();
    }
    else{
      return 0;
    }

  }

  @Override
  public String toString() {
    return name;
  }

  /**
   * IWorking 인터페이스 메서드
   */
  @Override
  public int workTogether(IWorkingTogether partner) {
    return makeProducts('B');
  }
}
