import java.util.*;

class Methodoverloading {
    void add(int a, int b) {
        int c = a + b;
        System.out.println("Sum of two ints: " + c);
    }

    void add(double a, double b) {
        double c = a + b;
        System.out.println("Sum of two doubles: " + c);
    }

    void add(int a, int b, int c) {
        int d = a + b + c;
        System.out.println("Sum of three ints: " + d);
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Methodoverloading obj = new Methodoverloading();

        System.out.println("Choose method to call:");
        System.out.println("1: add(int, int)");
        System.out.println("2: add(double, double)");
        System.out.println("3: add(int, int, int)");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter two integers:");
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                obj.add(a1, b1);
                break;

            case 2:
                System.out.println("Enter two doubles:");
                double a2 = sc.nextDouble();
                double b2 = sc.nextDouble();
                obj.add(a2, b2);
                break;

            case 3:
                System.out.println("Enter three integers:");
                int a3 = sc.nextInt();
                int b3 = sc.nextInt();
                int c3 = sc.nextInt();
                obj.add(a3, b3, c3);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
