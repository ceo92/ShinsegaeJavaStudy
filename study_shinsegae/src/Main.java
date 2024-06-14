public class Main {
    public static void main(String[] args) {
        int v;
        v=20;

        System.out.println("v = " + v);

        //Q2
        int a = 10;
        int b = a;
        int c = b * 10;

        //Q3
        int sum=1;
        sum+=2;
        sum+=3;
        sum+=4;
        sum+=5;

        System.out.println("sum = " + sum);


        //Q4
        int x=10 , y=20;
        System.out.printf("before swap : x = %s , y = %s\n" , x,y);
        int temp;
        temp = x;
        x= y;
        y = temp;
        System.out.printf("after swap : x = %s , y = %s\n" , x,y);



    }
}
