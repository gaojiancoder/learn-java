package day01;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TestPrint10 {
    public static void main(String[] args) {
        System.out.println("请输入你要判断的数字");
        double input =new Scanner(System.in).nextDouble();
        double result =getAbsNum(input);
        System.out.println(input+"的绝对值是："+result);

    }
    private static double getAbsNum(double input){
        if (input>=0){
            return input;
        }else {
            return -input;
        }
    }
}
