public class Program {
    static public void main(String str[]) {
        // int r = 100;
        // for (int i = 0; i < r; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("z ");
        // }
        // System.out.println();
        // }
        // UpperPyramid(20);
        // LowerPyramid(19);

        // Diamond(20);
        // UpperTriangle(20);
        // LowerTriangle(10);
        // OutlineDiamond(10);
        // SolidDiamond(10);

        // OutlineDiamond(10);
        // SolidDiamond(10);

        // OutlineDiamond(10);
        // SolidDiamond(10);

        AlternateDiamondPattern(10, 30);

        // AlternateDiamondPatternDecreasingOrder(30);
    }

    public static void UpperPyramid(int r) {
        for (int i = 1; i <= r; i++) {
            for (int sp = r - i; sp > 0; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = i - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static public void LowerPyramid(int r) {

        for (int i = r; i > 0; i--) {
            for (int sp = r - i; sp > 0; sp--) {
                System.out.print(" ");
            }

            // Print Stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            for (int k = 0; k < (i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    static public void SolidDiamond(int r) {
        UpperPyramid(r / 2);
        LowerPyramid(r / 2);
    }

    public static void UpperTriangle(int r) {

        for (int i = 1; i <= r; i++) {
            for (int sp = r - i; sp > 0; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                // System.out.print("*");
            }
            for (int k = i - 1; k > 0; k--) {
                if (k == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                // System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void LowerTriangle(int r) {

        for (int i = r; i > 0; i--) {
            for (int sp = r - i; sp > 0; sp--) {
                System.out.print(" ");
            }

            // Print Stars
            for (int j = 0; j < i; j++) {
                // System.out.print("*");
                if (j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int k = 0; k < (i - 1); k++) {
                // System.out.print("*");
                if (k == (i - 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

    public static void OutlineDiamond(int r) {
        UpperTriangle(r / 2);
        LowerTriangle(r / 2);
    }

    public static void AlternateDiamondPattern(int iter, int r) {
        for (int i = 0; i < iter; i++) {
            SolidDiamond(r / 2);
            OutlineDiamond(r / 2);
        }
    }

    public static void AlternateDiamondPatternDecreasingOrder(int r) {
        for (int i = 0; i < r; i++) {
            if (i != (r - 5)) {
                SolidDiamond(r - i);
                OutlineDiamond(r - i - 1);
            }

        }
    }
}