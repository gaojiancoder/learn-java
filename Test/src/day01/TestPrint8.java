package day01;

import java.util.Scanner;

public class TestPrint8 {
    public static void main(String[] args) {
        System.out.println("请输入您的身高");
        double height =new Scanner(System.in).nextDouble();
        System.out.println("请输入体重");
        double weight = new Scanner(System.in).nextDouble();

        //2.调用getBMI()方法，根据身高和体重信息，输出结果
        getBMI(height,weight);
    }

    public static void getBMI(double h,double w) {
        //求出BMI指数
        double bmi =w /(h*h);
        //定义一个变量r来保存最终结果
        String r = "";
        //根据bmi指数范围，来给r重新赋值
        if (bmi<18.5){
            r="过轻";
        }else if (bmi<=22.9){
            r="正常";
        }else if (bmi<=29.9){
            r="肥胖";
        }else {
            r="极度肥胖";
        }

        System.out.println("您的BMI指数："+bmi);

        System.out.println("您的体重属于："+r);

    }
}
