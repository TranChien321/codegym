package Lesson_2;

import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1. Hình Chữ Nhật");
            System.out.println("2. Tam Giác Vuông Botton");
            System.out.println("3. Tam Giác Vuông Top");
            System.out.println("4. Tam Giác Cân");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hình Chữ Nhật");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    break;
                case 2:
                    System.out.println("Tam Giác Vuông Botton");
                    System.out.println("*");
                    System.out.println("* *");
                    System.out.println("* * * ");
                    System.out.println("* * * * ");
                    System.out.println("* * * * * ");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Tam Giác Vuông Top");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * ");
                    System.out.println("* * * * ");
                    System.out.println("* * * ");
                    System.out.println("* *");
                    System.out.println("*");
                    break;
                case 4:
                    System.out.println("Tam Giác Cân");
                    System.out.println("      *      ");
                    System.out.println("     * *     ");
                    System.out.println("    * * *    ");
                    System.out.println("   * * * *   ");
                    System.out.println("  * * * * *  ");
                    System.out.println(" * * * * * * ");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
