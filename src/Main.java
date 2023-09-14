import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 2 числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d - %d = %d", a, b, Math.Diff(a, b));
        System.out.println();
        System.out.printf("%d * %d = %d", a, b, Math.prod(a, b));
        System.out.println();
        System.out.printf("%d / %d = %f", a, b, Math.qout(a, b));
    }
}

class Math {

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


