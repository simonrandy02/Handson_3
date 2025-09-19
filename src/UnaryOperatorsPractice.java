public class UnaryOperatorsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Unary Operators
         */

        // ===== OPERATOR INCREMENT DAN DECREMENT =====
        System.out.println("=== OPERATOR INCREMENT DAN DECREMENT ===");

        int counter = 5;
        System.out.println("Pre-increment (++counter): " + ++counter); // counter jadi 6, lalu dicetak
        System.out.println("Post-increment (counter++): " + counter++); // cetak 6, lalu jadi 7

        counter = 5;
        System.out.println("Pre-decrement (--counter): " + --counter); // counter jadi 4, lalu dicetak
        System.out.println("Post-decrement (counter--): " + counter--); // cetak 4, lalu jadi 3

        // ===== PERILAKU PRE vs POST INCREMENT =====
        System.out.println("\n=== PERILAKU PRE vs POST INCREMENT ===");

        int a = 10;
        int b = 10;

        int result1 = ++a; // a ditambah dulu, lalu assign ke result1 => a=11, result1=11
        System.out.println("a: " + a + ", result1 (pre-increment): " + result1);

        int result2 = b++; // result2 = b (10), lalu b jadi 11
        System.out.println("b: " + b + ", result2 (post-increment): " + result2);

        // Perbedaan:
        // Pre-increment menaikkan nilai sebelum assignment.
        // Post-increment menaikkan nilai setelah assignment.

        // ===== PERILAKU PRE vs POST DECREMENT =====
        System.out.println("\n=== PERILAKU PRE vs POST DECREMENT ===");

        int x = 8;
        int y = 8;

        System.out.println("Pre-decrement (--x): " + --x); // x jadi 7, cetak 7
        System.out.println("Nilai x setelah pre-decrement: " + x); // x tetap 7

        System.out.println("Post-decrement (y--): " + y--); // cetak 8, lalu y jadi 7
        System.out.println("Nilai y setelah post-decrement: " + y); // y = 7

        // Decrement terjadi sebelum dan sesudah pemakaian tergantung jenisnya.

        // ===== UNARY PLUS DAN MINUS =====
        System.out.println("\n=== UNARY PLUS DAN MINUS ===");

        int positive = 42;
        int negative = -positive;
        int backToPositive = -negative;
        int stillPositive = +positive;

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Back to Positive: " + backToPositive);
        System.out.println("Unary plus (no change): " + stillPositive);

        // Unary plus tidak mengubah nilai

        // ===== OPERATOR BOOLEAN NOT =====
        System.out.println("\n=== OPERATOR BOOLEAN NOT ===");

        boolean isReady = true;
        boolean isNotReady = !isReady;

        System.out.println("isReady: " + isReady);
        System.out.println("isNotReady: " + isNotReady);

        int someNumber = 7;
        boolean notZero = !(someNumber == 0);
        System.out.println("someNumber != 0: " + notZero);

        boolean doubleNot = !!isReady;
        System.out.println("!!isReady: " + doubleNot); // kembali ke true

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        int attempts = 0;

        System.out.println("Attempt: " + ++attempts);
        System.out.println("Attempt: " + ++attempts);
        System.out.println("Attempt: " + ++attempts);

        int lives = 3;

        System.out.println("Lives remaining: " + --lives);
        System.out.println("Lives remaining: " + --lives);
        System.out.println("Lives remaining: " + --lives);

        // Loop dengan increment
        int i = 1;
        while (i <= 5) {
            System.out.println("Loop counter (increment): " + i++);
        }

        // Loop countdown
        int countdown = 3;
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown--);
        }

        // ===== SKENARIO MENANTANG =====
        System.out.println("\n=== SKENARIO MENANTANG ===");

        int value = 5;
        int hasil1 = value++ + ++value; // value++ = 5, ++value (sekarang value = 7), jadi 5 + 7 = 12
        System.out.println("Hasil1 (value++ + ++value): " + hasil1);
        System.out.println("Nilai akhir value: " + value); // value sekarang 7

        value = 5;
        int hasil2 = --value + value--; // --value = 4, value-- = 4, jadi 4 + 4 = 8, value akhirnya 3
        System.out.println("Hasil2 (--value + value--): " + hasil2);
        System.out.println("Nilai akhir value: " + value);

        // Prediksi:
        // hasil1 = 5 + 7 = 12
        // hasil2 = 4 + 4 = 8

        // Latihan 9: Increment/Decrement dalam method call
        int score = 10;
        System.out.println("Math.max(++score, 12): " + Math.max(++score, 12)); // ++score = 11, max = 12
        System.out.println("Score sekarang: " + score); // 11

        score = 10;
        System.out.println("Math.max(score++, 12): " + Math.max(score++, 12)); // score++ = 10, max = 12
        System.out.println("Score sekarang: " + score); // 11

        // Perbedaan:
        // Pre-increment meningkatkan nilai sebelum digunakan dalam method
        // Post-increment menggunakannya dulu, lalu naik
    }
}
