package assignment._0627assignment.shop;

public class ShopService {

  private static final ShopService instance = new ShopService();//최초 객체 한번 생성
  private ShopService(){} //생성자 못쓰게

  public static ShopService getInstance(){ //최초 생성한 객체 getter 역할을 하는 static으로 모두 접근 가능하게끔
    return instance;
  }

}
