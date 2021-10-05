package JavaCoursewoek;

import java.util.Scanner;

public class qwe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入0-9中的数字，对此次服务进行评价：" + "\n");
        System.out.println("*****************" + "\n");
        System.out.println("0:十分满意" + "\n");
        System.out.println("1:满意" + "\n");
        System.out.println("2:基本满意" + "\n");
        System.out.println("3:不满意" + "\n");
        System.out.println("输入其他值:投诉" + "\n");
        System.out.println("*****************" + "\n");
        int i = scanner.nextInt();
        switch (i) {
            case 0:
                System.out.println("你对这次的服务十分满意，谢谢");
                break;
            case 1:
                System.out.println("你对这次的服务满意，谢谢");
                break;
            case 2:
                System.out.println("你对这次的服务基本满意，谢谢");
                break;
            case 3:
                System.out.println("你对这次的服务不满意，谢谢");
                break;
            default:
                System.out.println("你想投诉，请你拨打77777777777");

        }
        System.out.println("我是19401028赵国明");
    }
}
