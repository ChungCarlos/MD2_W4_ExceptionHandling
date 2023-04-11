package trycatch;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter edge a: ");
            int a = scanner.nextInt();
            System.out.print("Enter edge b: ");
            int b = scanner.nextInt();
            System.out.print("Enter edge c: ");
            int c = scanner.nextInt();

            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalTriangleException("The sides of the triangle must be positive...");
            }
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalTriangleException("Sum of 2 sides must be greater than the other side...");
            }
            System.out.println(" Valid triangle...");

        } catch (IllegalTriangleException e) {
            System.out.println("Error ->> " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


// Tạo lớp kế thừa của Exception vì hàm IllegalTriangleException ko có sẵn...
class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String m) {
        super(m);
    }
}

