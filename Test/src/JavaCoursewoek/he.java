package JavaCoursewoek;

import java.util.Scanner;
public class he{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入数字");
        int input=scanner.nextInt(  );
        int remain=input% 2;
        if(remain==1)
            System.out.println(input+"为奇数");
        else
            System.out.println(input+"为偶数");
        System.out.println("我是19401003高健");

    }
}