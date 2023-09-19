import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 2 числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Введите число для вычисления факториала: ");
        int n = scanner.nextInt();
        System.out.print("Введите число для возведения в степень: ");
        double number = scanner.nextDouble();
        System.out.print("Введите степень: ");
        int degree = scanner.nextInt();
        System.out.printf("%d + %d = %d", a, b, Math.summ(a, b));
        System.out.println();
        System.out.printf("%d - %d = %d", a, b, Math.Diff(a, b));
        System.out.println();
        System.out.printf("%d * %d = %d", a, b, Math.prod(a, b));
        System.out.println();
        System.out.printf("%d / %d = %.4f", a, b, Math.qout(a, b));
        System.out.println();
        System.out.println("%d! = %d".formatted(n,Math.factorial(n)));
        System.out.println("%.0f^%d = %f".formatted(number,degree,Math.power(number, degree)));
    }
}

class Math {
    static int factorial (int n) {
        int fact = n;
        if (fact == 0) {
            return 1;
        }
        if (fact == 1) {
            return n;
        } else
        fact = n*factorial(n-1);
        return fact;
    }
    static double power (double number, int degree) {

        if (degree == 1) {
            return number;
        } else if (degree == 0) {
            return 1;
        } else if (degree > 0) {
            number = number * power(number, degree - 1);
            return number;
        } else if (degree < 0)
            number = 1 / power(number, (-1 * degree));
            return number;
        }


    static int summ(int a, int b) {
        return a + b;
    }

    static int Diff(int a, int b) {
        return a - b;
    }

    static int prod(int a, int b) {
        return a * b;
    }

    static double qout(int a, int b) {
        return (double) a / b;
    }
}


