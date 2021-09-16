package day01;

import java.util.Scanner;

public class TestPrint7 {
    public static void main(String[] args) {
        System.out.println("请输入第一个整数：");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个整数：");
        int b = new Scanner(System.in).nextInt();
        System.out.println("请输入第三个整数：");
        int c = new Scanner(System.in).nextInt();
        int max= a>b ?a:b;
        max =max>c ?max :c;
        System.out.println("三个数最大值是："+max);
    }
}
