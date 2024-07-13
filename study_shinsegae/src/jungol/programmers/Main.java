package jungol.programmers;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        q1();
        q2();
    }

    /**
     * 1번 문제
     */

    public static void q1() {
        //이 부분을 주석처리 해서 프로그램이 정상적으로 실행되도록 만들어 보세요.
        System.out.println("HelloWorld");
    }

    /**
     * 2번 문제
     */
    public static void q2() {
        // 정수형 변수, number를 선언하고 3을 저장해보세요.

        int number=3;

        System.out.println(number);
    }


    /**
     * 3번 문제
     */
    public static void q3(){
        // 상수 PI를 만들어보세요.

        final double PI = 3.14159;

        int radius = 5;
        double result = radius * 2 * PI;
        System.out.println(result);
    }


    /**
     * 4번 문제
     */
    public static void q4() {
        boolean isFun = false;

        char charValue = 'a';

        int intValue = 20;

        long longValue = 2147483648L;

        System.out.println(isFun);
        System.out.println(charValue);
        System.out.println(intValue);
        System.out.println(longValue);
    }

    /**
     * 5번 문제
     */
    public static void q5(){
        int intValue = 200;
        //빈칸에 long타입 변수 longValue를 선언하고 변수를 intValue를 이용해 초기화해보세요.

        long longValue=intValue;

        System.out.println(longValue);
    }

    /**
     * 6번 문제
     */

    public static void q6(){
        long longValue = 20;
        //이 아래줄에 int형 변수 intValue를 선언하고 longValue에 들어있는 값을 담아보세요.

        int intValue = (int) longValue;

        System.out.println(intValue);
    }

    /**
     * 7번 문제
     */
    public static void q7(){
        q7Calculate();
    }

    public static int[] q7Calculate() {
        int a = 7;
        int b = 3;

        //c는 a와 b의 합
        int c = a+b;

        //d는 a와 b의 차
        int d = a-b;

        //e는 a와 b의 곱
        int e = a*b;

        //f는 a를 b로 나눈 나머지
        int f = a%b;


        System.out.printf("c는: %d\n", c);
        System.out.printf("d는: %d\n", d);
        System.out.printf("e는: %d\n", e);
        System.out.printf("f는: %d\n", f);

        int ret[] = {c, d, e, f};
        return ret;
    }


    /**
     * 8번 문제
     */
    public static void q8(){
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        q8Calculate(a, b);
    }

    public static boolean[] q8Calculate(int a, int b) {
        //변수 a와 b는 int형 변수입니다. 각각 어떤 값을 가지고 있는지는 비교해 보기 전에는 모릅니다.
        //a와 b가 주어져 있다고 가정하고 아래 지시에 따라 문제를 풀어 보세요.

        //a가 b보다 큰 지 비교한 결과(true 또는 false)를 c에 저장하세요.
        boolean c = a>b;

        //a와 b가 같은지 비교한 결과를 d에 저장하세요.
        boolean d = a==b;


        //a와 b가 다른지 비교한 결과를 e에 저장하세요.
        boolean e = a!=b;


        //이 아래 코드는 결과 테스트를 위한 코드입니다.
        boolean ret[] = {c, d, e};
        return ret;
    }

    /**
     * 9번 문제
     */
    public static int q9(int value){
        // 변수 value가 선언되어 있다고 가정하고 아래에 코드를 작성하세요.
        int ret = 0;
        if( value % 3 == 0 ){
            ret = 3;
        }// 이 아래 줄에 else 구문을 추가해서 코드를 완성하세요.
        else if(value % 4 ==0){
            ret = 4;
        }
        // 결과 체크를 위한 코드입니다.
        return ret;
    }

    /**
     * 10번 문제
     */
    public static void q10(){
        int value = 10;
        if (value % 3 == 0) {
            System.out.println("value는 3의 배수입니다.");
        }
    }

    /**
     * 11번 문제
     */
    public static void q11(){
        conditionTest(6);
        conditionTest(8);
    }



    public static int conditionTest(int value){
        // 변수 value가 선언되어 있다고 가정하고 아래에 코드를 작성하세요.
        int ret = 0;
        if( value % 3 == 0 ){
            ret = 3;
        }// 이 아래 줄에 else 구문을 추가해서 코드를 완성하세요.
        else if(value % 4 ==0){
            ret = 4;
        }
        // 결과 체크를 위한 코드입니다.
        return ret;
    }

    /**
     * 12번 문제
     */

    public static void q12(){
        isAgeDiscountable(15);
        isAgeDiscountable(27);
    }

    public static boolean isAgeDiscountable(int age) {
        boolean isDiscount = false;
        // 아래 빈칸을 채워 코드를 완성하세요.
        if(age<=19 || age>=60) {
            isDiscount = true;
        }
        else {
            isDiscount = false;
        }
        return isDiscount;
    }


    /**
     * 13번 문제
     */
    public static void q13(){
        isAgeTwenties(19);
        isAgeTwenties(25);
    }

    public static boolean isAgeTwenties(int age) {
        boolean isTwenties = false;
        //아래 빈칸을 채워 코드를 완성하세요.
        if(
                age>=20 && age<30
        ) {
            isTwenties = true;
        }
        else {
            isTwenties = false;
        }
        return isTwenties;
    }


    /**
     * 14번 문제
     */
    public static void q14(){
        // hour에는 현재 시간이 24시간 단위로 들어 있습니다.
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        String ampm;
        // 삼항연산자를 이용해서 ampm의 값을 "오전" 또는 "오후"로 만들어보세요.
        ampm = hour<12 ? "오전" : "오후";
        System.out.println("지금시간은 " + hour + "시이고, " + ampm + "입니다.");
    }






}
