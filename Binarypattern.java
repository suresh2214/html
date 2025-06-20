public class Binarypattern {
    public static void main(String[] args) {
        int n = 5; 
        int rows = 5; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(j % 2 == 0 ? "1" : "0");
            }
            System.out.println(); 
        }
    }
}
