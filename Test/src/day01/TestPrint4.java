package day01;

public class TestPrint4 {
    public static void main(String[] args) {
        double fatherHeight =183;
        double motherHeight =166;
        double sonHeight =(fatherHeight+motherHeight)*1.08/2;
        double daughterHeight=(fatherHeight*0.923+motherHeight)/2;
        System.out.println("儿子预计的身高"+sonHeight+"cm");
        System.out.println("女儿预计的身高"+daughterHeight+"cm");
    }

}
