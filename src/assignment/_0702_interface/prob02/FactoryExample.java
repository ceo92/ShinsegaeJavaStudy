package assignment._0702_interface.prob02;


public class FactoryExample {

  public static void main(String[] args) {
    // ===== 1st Car Factory Information
    // Factory Name: CarABC
    // openHour: 7 AM, closeHour: 9 PM
    CarFactory carABC = new CarFactory("CarABC", 7, 21);

    // ===== 2nd Car Factory Information
    // Factory Name: CarXYZ
    // openHour: 8 AM, closeHour: 7 PM
    CarFactory carXYZ = new CarFactory("CarXYZ", 8, 19);

    // ===== 1st TV Factory Information
    // Factory Name: TVABC
    // openHour: 8 AM, closeHour: 5 PM
    TVFactory tvABC = new TVFactory("TVABC", 8, 17);


    // ===== 2nd TV Factory Information
    // Factory Name: TVXYZ
    // openHour: 9 AM, closeHour: 6 PM
    TVFactory tvXYZ = new TVFactory("TVXYZ", 9, 18);

    FactoryExample ex = new FactoryExample();
    // 각 공장 별로기술력값에 따른 하루 생산량과 파트너 사 협력 시 추가 생산량을 알아본다
    ex.getResult(carABC, 'A', carXYZ);
    ex.getResult(carXYZ, 'B', carABC);
    ex.getResult(tvABC, 'A', tvXYZ);
    ex.getResult(tvXYZ, 'B', tvABC);

  }

  public void getResult(Factory mainFactory, char mainFactorySkill, IWorkingTogether partner) {

    System.out.println("* " + mainFactory.getFactoryName() + " 공장의 하루 생산량과 파트너 공장 협력 시 추가 생산량은 다음과 같다.");
    System.out.println("1. 하루 생산량 = "+mainFactory.makeProducts(mainFactorySkill));
    System.out.printf("2. 파트너 공장 [%s] 협력 시 추가 생산량 = %d\n" ,partner , partner.workTogether(partner));
    // TODO
    System.out.println("--------------------------------------------------------------");
  }

}