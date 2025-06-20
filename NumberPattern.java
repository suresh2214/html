import java.util.Scanner;
public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size (n): ");
        int n = scanner.nextInt();

        int num = 1;
for (int i = 1; i <= n; i++) {   
            for (int j = 1; j <= n; j++) {     
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }

        scanner.close();
    }
}
