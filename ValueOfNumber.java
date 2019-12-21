import java.util.Scanner;

public class ValueOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to determine if it is even or not: ");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("not even");
        }

        System.out.println("enter a number to determine if it is prime");
        int b = scanner.nextInt();
        if (b%b == 0 && b%2 != 0) {
            System.out.println("prime number");
        } else {
            System.out.println("composite number");
        }

        System.out.println("enter a number to find out why it is a multiple");
        int c = scanner.nextInt();
        for (int i = 1; i < c; i++) {
            if(c%i == 0) {
                System.out.println(c/i);
            }
        }
    }
}
