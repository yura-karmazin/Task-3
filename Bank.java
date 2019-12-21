/*Программа, которая предлагает пользователю ввести сумму денежного вклада в гривнах, процент годовых,
        которые выплачивает банк, длительность вклада (лет). Вывести накопленную сумму денег за каждый
        год и начисленные проценты.*/
import java.util.Scanner;

public class Bank {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the amount of cash deposit in UAH: ");
        double cashIn = scanner.nextDouble();
        System.out.println("Enter the percentage per annum that the bank pays: ");
        double percentBank = scanner.nextDouble();
        System.out.println("deposit duration (days): ");
        double numberOfYears = scanner.nextDouble();
        double cashOutPercent = (cashIn * percentBank * numberOfYears/365)/100;
        double cashOutOll = cashIn + (cashIn * percentBank * numberOfYears/365)/100;
        System.out.println("accumulated amount of money for each year "+ cashOutOll +" UAH");
        System.out.println("interest charges "+ cashOutPercent + " UAH");
    }
}
