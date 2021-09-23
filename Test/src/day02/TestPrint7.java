package day02;

public class TestPrint7 {
    public static void main(String[] args) {
        //循环变量j,控制小鸡的个数: 0到35递增
        //循环变量t,控制兔子的个数: 35到0递减
        for(int j=0,t=35; j<=35; j++,t--) {//如果有多个小条件,用逗号隔开
            //保证脚的数量是94
            if(j*2 + t*4 == 94) {
                System.out.println("鸡："+j+"， 兔："+t);
            }
        }
    }
}
