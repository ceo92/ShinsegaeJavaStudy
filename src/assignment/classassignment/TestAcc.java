package assignment.classassignment;

public class TestAcc {
    public static void main(String[] args) throws Exception {

        String accNo = null;
        int balance = 0;

        Account accObj = new Account();
        accObj.setAccNo("078-3762-293");
        accNo = accObj.getAccNo();
        balance = accObj.getBalance();
        System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");

        accObj.save(100);
        balance = accObj.getBalance();
        System.out.println(accObj.getAccNo() + " 계좌의 잔고는 " + balance + "만원입니다.");

        accObj.deposit(30);
        balance = accObj.getBalance();
        System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");
    }

}

class Account{
    private String accNo;
    private int balance;


    public void setAccNo(String accNo) {
        this.accNo = accNo;
        System.out.println(accNo+" 계좌가 개설되었습니다.");
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //command
    public void save(int money){
        this.balance += money;
        System.out.println(accNo+" 계좌에 "+money+"만원이 입금되었습니다.");
    }
    //query
    public int deposit(int money){
        int difference = this.balance - money;
        if (difference<0){
            throw new IllegalStateException("잔고가 부족합니다");
        }
        this.balance = difference;
        System.out.println(accNo+" 계좌에 "+money+"만원이 출금되었습니다.");
        return money;
    }



    public String getAccNo() {
        return accNo;
    }

    public int getBalance() {
        return balance;
    }



}
