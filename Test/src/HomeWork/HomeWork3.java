package HomeWork;

public class HomeWork3
{
    public static void main(String[] args)
    {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println("result = " + result);
        System.out.println();

        int a = 5;
        int b = 8;
        int c,d;
        c = a-- - --a + ++a + a++ + a;
        d = ++b - b++ + ++b - --b;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}