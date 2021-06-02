import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a -");
        double a = scanner.nextDouble();
        System.out.print("b -");
        double b = scanner.nextDouble();
        System.out.print("c -");
        double c = scanner.nextDouble();

        System.out.println(Arrays.toString(arrayRoots(a, b, c)));

    }

    public static double[] arrayRoots(double a, double b, double c) {
        if (a != 0) {
            if (a != 0 && b != 0 & c != 0) {
                return allNumbers(a, b, c);
            }
            if (b == 0 && c == 0) {
                return new double[]{0};
            }
            if (b != 0 && c == 0) {
                return notNumberC(a, b);
            }
            if (b == 0 && c != 0) {
                return notNumberB(a, c);
            }
        } else {
            System.out.println("Переменная А, в уравнении, не должна равняться 0");
        }
        return new double[0];
    }

    public static double[] notNumberB(double a, double c) {         //не все переменные есть
        double num = -(c / a);
        if (num > 0) {
            double root1 = Math.sqrt(num);
            double root2 = -(Math.sqrt(num));
            return new double[]{root1, root2};
        } else {
            return new double[]{0};
        }
    }

    public static double[] notNumberC(double a, double b) {
        double root1 = 0;
        double root2 = -(b / a);
        return new double[]{root1, root2};
    }

    public static double[] allNumbers(double a, double b, double c) {   //все переменные есть
        if (discriminant(a, b, c) > 0) {
            return twoRoots(a, b, c);
        }
        if (discriminant(a, b, c) < 0) {
            return noRoots();
        }
        if (discriminant(a, b, c) == 0) {
            return oneRoot(a, b, c);
        }
        return new double[0];
    }

    public static double discriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static double[] twoRoots(double a, double b, double c) {
        double roots1 = (-b + Math.sqrt(discriminant(a, b, c))) / 2 * a;
        double roots2 = (-b - Math.sqrt(discriminant(a, b, c))) / 2 * a;

        return new double[]{roots1, roots2};
    }

    public static double[] noRoots() {
        return new double[]{0};
    }

    public static double[] oneRoot(double a, double b, double c) {
        double root1 = (-b + Math.sqrt(discriminant(a, b, c))) / 2 * a;

        return new double[]{root1};
    }
}
