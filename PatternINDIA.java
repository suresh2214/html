public class PatternINDIA {
    public static void main(String[] args) {
        int n = 7; // height of the pattern

        for (int i = 0; i < n; i++) {

            // I Pattern (Vertical Line)
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  "); 
}
}
}
