public class ExpressionPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Expression, Statement & Block
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * perbedaan antara expressions, statements, dan blocks.
         */

        // ===== EXPRESSIONS =====
        System.out.println("=== EXPRESSIONS ===");

        int a = 10;
        int b = 5;

        // Expression untuk menjumlahkan a dan b
        int sum = a + b;

        // Expression untuk mengalikan a dan b
        int product = a * b;

        // Boolean expression apakah a lebih besar dari b
        boolean isAGreaterThanB = a > b;

        // String expression penggabungan "Hello" dan "World"
        String greeting = "Hello" + " World";

        // Method call expression menggunakan Math.pow(2, 3)
        double power = Math.pow(2, 3);

        // Print hasil expression dengan label deskriptif
        System.out.println("Sum (a + b): " + sum);
        System.out.println("Product (a * b): " + product);
        System.out.println("Is a greater than b? " + isAGreaterThanB);
        System.out.println("Greeting (\"Hello\" + \" World\"): " + greeting);
        System.out.println("Math.pow(2, 3): " + power);


        // ===== STATEMENTS =====
        System.out.println("\n=== STATEMENTS ===");

        // Declaration statement
        int score;

        // Assignment statement
        score = 85;

        // Conditional statement
        if (score >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Loop statement
        for (int i = 1; i <= 3; i++) {
            System.out.println("Loop iteration: " + i);
        }


        // ===== BLOCKS =====
        System.out.println("\n=== BLOCKS ===");

        int x = 15;

        // If block
        if (x > 10) {
            String category = "High";
            System.out.println("x = " + x + ", category = " + category);
        }

        // For loop block
        for (int i = 1; i <= 3; i++) {
            int iteration = i;
            System.out.println("Iteration number: " + iteration);
        }

        // ===== VARIABLE SCOPE =====
        System.out.println("\n=== VARIABLE SCOPE ===");

        int outerVariable = 100;

        {
            int innerVariable = 50;
            System.out.println("Inside block - outerVariable: " + outerVariable);
            System.out.println("Inside block - innerVariable: " + innerVariable);
            outerVariable += 25;  // Modifikasi outerVariable
        }

        System.out.println("Outside block - outerVariable: " + outerVariable);

        // Berikut ini error karena innerVariable scope hanya di dalam block
        // System.out.println("Outside block - innerVariable: " + innerVariable); // ERROR: cannot find symbol
    }
}
