/*
4. Вывести на консоль графику (ширину и высоту задает пользователь) вида:
       б. Конверт (рекомендую сначала нарисовать одну диагональ, а потом вторую)
*/
import java.util.Scanner;
public class Envelope {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("Enter height: ");
        int height = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width || i == j  || j == width + 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}