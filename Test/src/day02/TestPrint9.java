package day02;



import java.util.Scanner;

public class TestPrint9 {
    public static void main(String[] args) {
        System.out.print("输入整数，求阶乘：");
        int n = new Scanner(System.in).nextInt();
        //调用f()方法，把n的值传递到f()方法，求阶乘
        f(n);
    }

    public static void f(int n) {
        if(n<0) {
            System.out.println("负数不可以求阶乘");
            return;//方法结束，返回到调用位置继续执行
        }
        if(n == 0) {
            System.out.println("0的阶乘是1");
            return;
        }
        /*
         * r = 5
         * i
         * 4, r=r*i
         * 3, r=r*i
         * 2, r=r*i
         * 1, r=r*i
         */
        long r = n;
        for(int i=n-1; i>=1; i--) {
            r *= i;
        }
        System.out.println(n+"的阶乘："+r);
    }
}
/**其实我们还可以通过递归思想解决这个问题,感兴趣的可以研究一下~*/
