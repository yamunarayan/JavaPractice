package patternPrograms;
public class PatternOne {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n); j++) {
                // Left part of pattern
                if (i > (n - j + 1))
                    System.out.print(" ");
                else
                    System.out.print("*");
               // Right part of pattern
                if ((i + n) > j)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println("");
        }

        // This is lower half of pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n); j++) {

                // Right Part of pattern
                if (i < j)
                    System.out.print(" ");
                else
                    System.out.print("*");

                // Left Part of pattern
                if (i <= ((2 * n) - j))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }

            System.out.println("");
        }

    }

}




