import java.util.Scanner;

public class Calc {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        double num1 = getDouble();
        double num2 = getDouble();
        char operation = getChar();
        double result = calc(num1,num2,operation);
        System.out.println("Operation results: "+result);
    }
    public static double getDouble(){
        System.out.println("Enter number: ");
        double num;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        } else {
            System.out.println("Pleas enter number again: ");
            scanner.next();//рекурсия
            num = getDouble();
        }
        return num;
    }
public static char getChar(){
    System.out.println("Enter operation:");
    char operation;
    if(scanner.hasNext()){
        operation = scanner.next().charAt(0);
    } else {
        System.out.println("Pleas enter operation");
        scanner.next();//рекурсия
        operation = getChar();
    }
    return operation;
}
    public static double calc(double num1, double num2, char operation){
        double result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Operation not detected ");
                result = calc(num1, num2, getChar());//рекурсия
        }
        return result;
    }

}
