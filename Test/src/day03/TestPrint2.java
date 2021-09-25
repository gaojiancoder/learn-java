package day03;


import java.util.Scanner;

public class TestPrint2 {
    public static void main(String[] args) {
        System.out.print("请输入要判断的自然数：");
        int n = new Scanner(System.in).nextInt();
        //调用getPrimeNumber()方法，判断n是否为质数
        getPrimeNumber(n);
    }
    public static void getPrimeNumber(int n) {
        if(n<2) {//此范围内的数均不为质数
            System.out.println(n+"不是质数");
            return;//结束程序
        }
        if(n == 2) {
            System.out.println("2是质数");
            return;
        }
        //在 2到 1+n开方范围(数学理论)，找能把n整除的值(这个值也称作因子)
        //如果找到可以把n整除的第三个数，那n就不是质数,反之,n为质数
        double max = 1+ Math.sqrt(n);//max保存的是查找因子的范围

        //依次遍历范围内的所有数,验证是否存在n的因子
        for(int i=2; i<max; i++) {
            //判断n能不能被i整除,如果有,说明不是质数
            if(n%i == 0) {
                System.out.println(n+"不是质数");
                return;
            }
        }
        //如果判断了范围内的所有值，没有能整除的,则说明n是质数
        System.out.println(n+"是质数");
    }
}
