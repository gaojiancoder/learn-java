package JavaCoursewoek;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个需要判断的月份");
        int month = scanner.nextInt();
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "winter";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "summer";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "spring";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "autumn";
        } else {
            season = "Bogus Month";
        }
        System.out.println("April is in the " + season + ".");
    }

}
