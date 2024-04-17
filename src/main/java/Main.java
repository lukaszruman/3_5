import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokość trójkąta prostokątnego : ");
        int height = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Podaj pierwszy znak: ");
        char fillChar1 = scanner.nextLine().charAt(0);
        System.out.println("Podaj drugi znak : ");
        char fillChar2 = scanner.nextLine().charAt(0);
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == height) {
                    System.out.print(fillChar1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}