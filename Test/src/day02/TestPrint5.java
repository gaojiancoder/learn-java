package day02;

import java.util.Scanner;

public class TestPrint5 {
    public static void main(String[] args) {
        System.out.println("输入email:");
        String e = new Scanner(System.in).nextLine();
        //email地址e，传递到该方法，
        //并得到方法返回的名字，保存到变量n
        String n = getName(e);
        System.out.println(n);
    }

    static String getName(String email) {
        /*
         * "sdfwerw@rewerwe.com"
         *         |
         *         index
         *
         * 1. 定位 "@" 的下标位置 index
         * 2. 截取 [0, index)，直接返回
         * email.indexOf("@")
         *        查找指定子串的位置
         *        找不到，得到特殊值 -1
         * email.substring(0, index)
         *        截取 [0, index)
         */
        //找@的位置
        int index = email.indexOf("@");
        if(index == -1) {//找不到
            return "邮箱格式错误";
        }
        //截取，直接返回截取的结果
        return email.substring(0, index);
    }
}