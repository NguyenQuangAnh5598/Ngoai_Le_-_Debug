import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHập cạnh a");
        int a = scanner.nextInt();
        System.out.println("NHập cạnh b");
        int b = scanner.nextInt();
        System.out.println("NHập cạnh c");
        int c = scanner.nextInt();
        try {
            Triangle test = new Triangle(a,b,c);
        }catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
