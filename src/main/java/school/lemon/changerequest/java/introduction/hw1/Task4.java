package school.lemon.changerequest.java.introduction.hw1;


public class Task4 {

    public static double getSumOfGreatest(double a, double b, double c) {

        if (a < b && a < c) {
            return b + c;
        }
        if (b < a && b < c) {
            return a + c;
        } else return a + b;

    }

    public static void main(String[] args) {
        System.out.println(getSumOfGreatest(-1, -2, 0));
    }
}
