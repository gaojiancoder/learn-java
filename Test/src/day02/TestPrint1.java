package day02;

import java.util.Scanner;

public class TestPrint1 {
    public static void main(String[] args) {
        System.out.println("请输入两个整数：");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int d = zdgys(a,b);
        long x= zxgys(a,b);
        System.out.println("最大公约数："+d);
        System.out.println("最小公倍数："+x);
    }
    private static int zdgys(int a ,int b){
        int min =a<b ?a:b;
        for (int i = min; i<=1 ; i--) {
            if (a%i==0 &&b%i==0){
                return i;
            }

        }
        return 0;
    }
    private static long zxgys(int a ,int b){
        int max =a>b?a:b;
        for (long i =max; ;i+=max) {
            if (i%a==0&&i%b==0){
                return i;
            }

        }
    }

}
