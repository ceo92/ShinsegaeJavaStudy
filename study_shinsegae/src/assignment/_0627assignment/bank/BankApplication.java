package _0627assignment.bank;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class BankApplication {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Account[] accounts = new Account[100];
    int index=0;

    while (true){
      System.out.println("-------------------------------------------------");
      System.out.println("1. 계좌생성 | 2.계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
      System.out.println("-------------------------------------------------");
      System.out.print("선택> ");
      int num = in.nextInt();
      switch (num){
        case 1:
          System.out.println("--------");
          System.out.println("계좌생성");
          System.out.println("--------");
          System.out.print("계좌번호 : ");
          String accountNum = in.next();
          System.out.print("계좌주: ");
          String name  = in.next();
          System.out.print("초기입금액 : ");
          int money = in.nextInt();
          accounts[index++] = new Account(accountNum , name , money);
          System.out.println("결과 계좌가 생성되었습니다.");
          continue;
        case 2:
          System.out.println("--------");
          System.out.println("계좌목록");
          System.out.println("--------");
          Arrays.stream(accounts).filter(Objects::nonNull).forEach(System.out::println);
          continue;
        case 3:
          System.out.println("--------");
          System.out.println("예금");
          System.out.println("--------");
          System.out.print("계좌번호: ");
          String saveAccountNum = in.next();
          System.out.print("예금액 : ");
          int saveMoney = in.nextInt();
          Arrays.stream(accounts).filter(a -> a.getAccountNum().equals(saveAccountNum)).findAny().orElseThrow().addMoney(saveMoney);
          continue;

        case 4:
          System.out.println("--------");
          System.out.println("출금");
          System.out.println("--------");
          System.out.print("계좌번호 : ");
          String removeAccountNum = in.next();
          System.out.print("출금액 : ");
          int removeMoney = in.nextInt();
          Arrays.stream(accounts).filter(a -> a.getAccountNum().equals(removeAccountNum)).findAny().orElseThrow().removeMoney(removeMoney);
          System.out.println("결과 : 출금이 성공하였습니다.");
          continue;

        case 5:
          System.out.println("프로그램 종료");
          return;
      }

    }


  }
  }
