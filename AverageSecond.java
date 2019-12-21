import java.util.Scanner;

public class AverageSecond {
   static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Enter the quantity numbers: ");
        int quantity;
        quantity = scanner.nextInt();
        double[] numbers = new double[quantity];
        for (int i = 1; i <= quantity; i++) {

            System.out.println(numbers.length);
        }
    }
public static double getNumber(){
        System.out.println("Enter number: ");
    double num;
    if(scanner.hasNextDouble()){
        num = scanner.nextDouble();
    } else {
        System.out.println("Pleas enter number again: ");
        scanner.next();//рекурсия
        num = getNumber();
    }
    return num;
}
}