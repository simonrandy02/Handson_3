public class MathOperationsPractice {
    public static void main(String[] args) {

        System.out.println("=== OPERATOR ARITMATIKA DASAR ===");

        int num1 = 25;
        int num2 = 4;

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Penjumlahan: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Pengurangan: " + num1 + " - " + num2 + " = " + diff);
        System.out.println("Perkalian: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Pembagian (integer): " + num1 + " / " + num2 + " = " + quotient);
        System.out.println("Modulus: " + num1 + " % " + num2 + " = " + remainder);

        System.out.println("\n=== PEMBAGIAN INTEGER VS FLOATING-POINT ===");

        int intDivision = 17 / 5;
        double floatDivision1 = 17.0 / 5;
        double floatDivision2 = (double) 17 / 5;

        System.out.println("Pembagian integer (17 / 5): " + intDivision);
        System.out.println("Pembagian floating-point (17.0 / 5): " + floatDivision1);
        System.out.println("Pembagian dengan casting ((double)17 / 5): " + floatDivision2);

        // ===== KALKULASI PRAKTIS =====
        System.out.println("\n=== KALKULASI PRAKTIS ===");

        double panjang = 12.5;
        double lebar = 8.3;
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);

        double hargaBarang = 15.99;
        int jumlahBarang = 3;
        double pajak = 0.08;
        double totalHarga = jumlahBarang * hargaBarang * (1 + pajak);

        System.out.println("Total harga (termasuk pajak 8%): $" + String.format("%.2f", totalHarga));

        double celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("25 derajat Celsius dalam Fahrenheit: " + fahrenheit + "°F");

        int totalHari = 50;
        int minggu = totalHari / 7;
        int sisaHari = totalHari % 7;

        System.out.println("50 hari = " + minggu + " minggu dan " + sisaHari + " hari");

        System.out.println("\n=== KALKULASI KOMPLEKS ===");

        double kecepatan = 65.5;
        double waktu = 2.75;
        double jarak = kecepatan * waktu;

        System.out.println("Jarak tempuh: " + kecepatan + " km/jam * " + waktu + " jam = " + jarak + " km");

        double pokok = 1000;
        double sukuBunga = 0.05;
        int waktuTahun = 3;
        double jumlahAkhir = pokok * Math.pow((1 + sukuBunga), waktuTahun);

        System.out.println("Jumlah akhir (bunga majemuk): $" + String.format("%.2f", jumlahAkhir));

        int nilai1 = 85, nilai2 = 92, nilai3 = 78, nilai4 = 96, nilai5 = 88;
        double rataRata = (nilai1 + nilai2 + nilai3 + nilai4 + nilai5) / 5.0;

        System.out.println("Rata-rata nilai ujian: " + String.format("%.2f", rataRata));
    }
}
