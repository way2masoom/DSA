class Patterns {
    public static void main(String[] args) {
        System.out.println("---- Patterns Program ----\n");
        Pattern1();
        System.out.println();
        Pattern2();
        System.out.println();
        Pattern3();
    }

    // Pattern1 Right Half Pyramid
    public static void Pattern1() {
        System.out.println("Right Half Pyramid");
        int num = 5;
        // OuterLoop for Rows  I=5;
        for (int i = 1; i <= num; i++) {        // i= rows
            // InnerLoop for columns J=5
            for (int j = 1; j <= num; j++) {    // j= columns
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Pattern2 LeftHalf Pyramid
    public static void Pattern2() {
        System.out.println("Left Half Pyramid");
        int num = 5;
        // Outer loop for Rows
        for (int i = 1; i <=num; i++) {
            // Inner Loop for Columns
            for (int j = 1; j <=num; j++) {
                if (j>=i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Pattern1 Reverse Right Half Pyramid
    public static void Pattern3() {
        System.out.println("Reverse Right Half Pyramid");
        int num = 5;
        // OuterLoop for Rows  I=5;
        for (int i = 1; i <= num; i++) {        // i= rows
            // InnerLoop for columns J=5
            for (int j = 1; j <= num; j++) {    // j= columns
                if (j<=(num-i+1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
