import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите 2 числа: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.printf("%d - %d = %d", a, b, Diff(a, b));
                System.out.println();
                System.out.printf("%d * %d = %d", a, b, prod(a, b));
                System.out.println();
                System.out.printf("%d / %d = %f", a, b, qout(a, b));
            }
                static int Diff(int a, int b){
                    return a-b;
                }
                static int prod (int a, int b) {
                return a*b;
                }
                static double qout (int a, int b) {
                return (double) a/b;
                }


}