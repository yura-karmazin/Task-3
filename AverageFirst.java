import java.util.Scanner;
public class AverageFirst {
   static Scanner scanner  = new Scanner(System.in);

    public static void main (String[] args){
     double num1 =getDouble();
     double num2 =getDouble();
     double result = (num1+num2)/2;
System.out.println("Result: "+result);
    }
    public static double getDouble(){
        System.out.println("Enter number: ");
        double num;
        if(scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
System.out.println("Pleas enter number again: ");
scanner.next();
num= getDouble();
            }
            return num;

    }
}
