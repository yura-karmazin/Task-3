/*
4. Вывести на консоль графику (ширину и высоту задает пользователь) вида:
        а. Обычный прямоугольник
*/


import java.util.Scanner;

public class Graphic_arts {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("Enter height: ");
        int height = scanner.nextInt();
        String [][] sqr = new String[width][height];
        for (int i = 0; i < width; i++){
            for (int j = 0; j < height ; j++){
                sqr[i][j] = "*  ";
            }
        }
        for (int i = 1; i < width-1; i++){
            for (int j = 1; j < height-1 ; j++){
                sqr[i][j] = "   ";
            }
        }
        for (int i = 0; i < width; i++){
            for (int j = 0; j < height ; j++){
                System.out.print(sqr[i][j]);
            }
             System.out.println();
        }
    }
}




