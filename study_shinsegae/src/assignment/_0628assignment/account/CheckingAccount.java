package _0628assignment.account;

public class CheckingAccount extends Account{

  private String cardNo;

  public CheckingAccount(String accId,  String ownerName,long balance, String cardNo) {
    super(accId, balance, ownerName);
    this.cardNo = cardNo;
  }

  @Override
  public void calcRate() {

  }
  //어차피 getter로접근해주면 굳이 protected로 선언 안 해줘더 되겠네 ㅇㅇ
  public void pay(String cardNo, long amount) {
    if (!this.cardNo.equals(cardNo)){
      throw new InsufficientException("카드 번호가 불일치합니다 !! ");
    }
    if (getBalance() < amount) {
      throw new InsufficientException("잔고가 부족합니다 !! ");
    }
    withdraw(amount);

}


}
