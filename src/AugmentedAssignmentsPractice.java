public class AugmentedAssignmentsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Augmented Assignments
         */

        // ===== AUGMENTED ASSIGNMENTS DASAR =====
        System.out.println("=== AUGMENTED ASSIGNMENTS DASAR ===");

        int score = 100;

        score += 25; // score = 125
        System.out.println("Setelah += 25: " + score);

        score -= 15; // score = 110
        System.out.println("Setelah -= 15: " + score);

        score *= 2; // score = 220
        System.out.println("Setelah *= 2: " + score);

        score /= 4; // score = 55
        System.out.println("Setelah /= 4: " + score);

        score %= 10; // score = 5
        System.out.println("Setelah %= 10: " + score);

        // ===== PERBANDINGAN DENGAN REGULAR ASSIGNMENTS =====
        System.out.println("\n=== PERBANDINGAN: AUGMENTED vs REGULAR ===");

        int value1 = 50;
        int value2 = 50;

        value1 = value1 + 30;
        value2 += 30;

        System.out.println("value1 setelah regular assignment: " + value1);
        System.out.println("value2 setelah augmented assignment: " + value2);

        value1 = 80;
        value2 = 80;

        value1 = value1 * 3;
        value2 *= 3;

        System.out.println("value1 setelah dikali 3: " + value1);
        System.out.println("value2 setelah dikali 3: " + value2);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        double bankBalance = 1000;

        bankBalance += 250; // deposit
        bankBalance -= 75;  // withdrawal
        bankBalance *= 1.05; // interest

        System.out.println("Saldo akhir: $" + String.format("%.2f", bankBalance));

        int totalSales = 0;

        totalSales += 150; // Hari 1
        totalSales += 200; // Hari 2
        totalSales += 175; // Hari 3

        int productionCount = 1000;

        productionCount -= 25; // barang cacat
        productionCount *= 1.1; // bonus produksi

        System.out.println("Total Sales: " + totalSales);
        System.out.println("Production Count akhir: " + productionCount);

        // ===== BEKERJA DENGAN TIPE DATA BERBEDA =====
        System.out.println("\n=== TIPE DATA BERBEDA ===");

        double temperature = 20.5;

        temperature += 5.7;       // 26.2
        temperature *= 1.8;       // 47.16
        temperature += 32;        // 79.16

        System.out.println("Suhu dalam Fahrenheit: " + String.format("%.2f", temperature));

        String message = "Hello";
        message += " World";
        message += "!";

        System.out.println("Pesan akhir: " + message);

        // ===== TANTANGAN: NILAI MAJEMUK =====
        System.out.println("\n=== NILAI MAJEMUK ===");

        double investment = 5000;

        investment *= 1.07; // Tahun 1
        investment *= 1.07; // Tahun 2
        investment *= 1.07; // Tahun 3

        System.out.println("Nilai investasi akhir: $" + String.format("%.2f", investment));

        double profit = investment - 5000;
        System.out.println("Keuntungan: $" + String.format("%.2f", profit));
    }
}
