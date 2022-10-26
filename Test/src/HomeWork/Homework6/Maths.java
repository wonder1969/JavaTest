package HomeWork.Homework6;

public class Maths {
    void summa() {
        System.out.println("Result: " + 0);
    }
    void summa(int a) {
        System.out.println("Result: " + a);
    }

    void summa(int a, int b) {
        System.out.println("Result: " + (a+b));
    }

    void summa(int a, int b, int c) {
        System.out.println("Result: " + (a+b+c));
    }

    void summa(int a, int b, int c, int d) {
        System.out.println("Result: " + (a+b+c+d));
    }
}

class MathsTest{
    public static void main(String[] args) {
        Maths m = new Maths();
        m.summa();
        int a = 100;
        m.summa(a);
        int b = 200;
        m.summa(a, b);
        int c = 300;
        m.summa(a, b, c);
        int d = 400;
        m.summa(a, b, c, d);
    }
}