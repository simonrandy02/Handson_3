public class ComparisonOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Perbandingan
         */

        // ===== PERBANDINGAN NUMERIK DASAR =====
        System.out.println("=== PERBANDINGAN NUMERIK DASAR ===");

        int firstNum = 25, secondNum = 18;

        System.out.println("firstNum > secondNum: " + (firstNum > secondNum));
        System.out.println("firstNum < secondNum: " + (firstNum < secondNum));
        System.out.println("firstNum >= secondNum: " + (firstNum >= secondNum));
        System.out.println("firstNum <= secondNum: " + (firstNum <= secondNum));
        System.out.println("firstNum == secondNum: " + (firstNum == secondNum));
        System.out.println("firstNum != secondNum: " + (firstNum != secondNum));

        // ===== PERBANDINGAN FLOATING-POINT =====
        System.out.println("\n=== PERBANDINGAN FLOATING-POINT ===");

        double price1 = 19.99, price2 = 20.0;

        System.out.println("Apakah price1 < price2? " + (price1 < price2));
        System.out.println("Selisih harga < 1.0? " + ((price2 - price1) < 1.0));

        double sum = 0.1 + 0.2;
        System.out.println("Apakah 0.1 + 0.2 == 0.3? " + (sum == 0.3));  // false karena presisi floating-point
        System.out.println("Hasil 0.1 + 0.2: " + sum);  // biasanya 0.30000000000000004

        // ===== PERBANDINGAN KARAKTER =====
        System.out.println("\n=== PERBANDINGAN KARAKTER ===");

        char letter1 = 'A', letter2 = 'B';

        System.out.println("letter1 < letter2: " + (letter1 < letter2));  // true (65 < 66)

        char lower = 'a', upper = 'A';
        System.out.println("lower > upper: " + (lower > upper));  // true karena 'a' = 97 > 'A' = 65

        char ch = '7';
        System.out.println("Apakah ch adalah digit? " + (ch >= '0' && ch <= '9')); // true jika '0' sampai '9'

        // ===== PERBANDINGAN STRING =====
        System.out.println("\n=== PERBANDINGAN STRING ===");

        String name1 = "Java";
        String name2 = "Java";

        System.out.println("name1 == name2: " + (name1 == name2));  // true (di-pool string)

        String name3 = new String("Java");

        System.out.println("name1 == name3: " + (name1 == name3));  // false (objek berbeda)
        System.out.println("name1.equals(name3): " + name1.equals(name3)); // true (nilai sama)

        System.out.println("\"Java\".equals(\"java\"): " + name1.equals("java")); // false
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + name1.equalsIgnoreCase("java")); // true

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        int grade = 85, passingGrade = 60, honorRoll = 90;

        System.out.println("Apakah siswa lulus? " + (grade >= passingGrade));
        System.out.println("Apakah siswa masuk honor roll? " + (grade >= honorRoll));

        int age = 17, drivingAge = 16, votingAge = 18, drinkingAge = 21;

        System.out.println("Boleh mengemudi? " + (age >= drivingAge));
        System.out.println("Boleh memilih? " + (age >= votingAge));
        System.out.println("Boleh minum? " + (age >= drinkingAge));

        int originalPrice = 100, discountThreshold = 50, customerAge = 65, seniorAge = 60;

        boolean eligibleBulk = originalPrice > discountThreshold;
        boolean eligibleSenior = customerAge >= seniorAge;
        boolean finalEligibility = eligibleBulk || eligibleSenior;

        System.out.println("Diskon bulk? " + eligibleBulk);
        System.out.println("Diskon senior? " + eligibleSenior);
        System.out.println("Diskon akhir tersedia? " + finalEligibility);

        // ===== PENGUJIAN BATAS =====
        System.out.println("\n=== PENGUJIAN BATAS ===");

        int score = 100;

        System.out.println("Score valid (0 - 100)? " + (score >= 0 && score <= 100));

        score = 0;
        System.out.println("Score = 0, valid? " + (score >= 0 && score <= 100));

        score = 100;
        System.out.println("Score = 100, valid? " + (score >= 0 && score <= 100));

        score = -1;
        System.out.println("Score = -1, valid? " + (score >= 0 && score <= 100));

        score = 101;
        System.out.println("Score = 101, valid? " + (score >= 0 && score <= 100));

        int temperature = 25;
        boolean tempValid = (temperature >= -10 && temperature <= 40);
        System.out.println("Suhu valid (-10 s/d 40)? " + tempValid);

        // ===== RANTAI PERBANDINGAN & KONDISI KOMPLEKS =====
        System.out.println("\n=== KONDISI KOMPLEKS ===");

        int height = 175, minHeight = 160, maxHeight = 200;

        System.out.println("Tinggi dalam rentang? " + (height >= minHeight && height <= maxHeight));

        score = 73;

        if (score >= 90) {
            System.out.println("Nilai: A");
        } else if (score >= 80) {
            System.out.println("Nilai: B");
        } else if (score >= 70) {
            System.out.println("Nilai: C");
        } else if (score >= 60) {
            System.out.println("Nilai: D");
        } else {
            System.out.println("Nilai: F");
        }
    }
}
