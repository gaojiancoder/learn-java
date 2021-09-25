package day02;



public class TestPrint10 {
    public static void main(String[] args) {
        // Math.random()可以产生[0,1)的随机浮点数
        // >0.999
        //写一个死循环, i变量用来计次
        for(int i=1; ;i++) {
            double d = Math.random();
            if(d>0.999) {
                System.out.println("第"+i+"次产生了目标值,值为:"+d);
                break;
            }
        }
    }
}
