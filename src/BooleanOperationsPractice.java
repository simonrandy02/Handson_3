public class BooleanOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Boolean
         */

        // ===== OPERATOR BOOLEAN DASAR =====
        System.out.println("=== OPERATOR BOOLEAN DASAR ===");

        // Latihan 1: AND (&&)
        boolean isLoggedIn = true;
        boolean hasPermission = false;

        boolean canAccessAdmin = isLoggedIn && hasPermission;
        System.out.println("User bisa akses admin panel: " + canAccessAdmin);

        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));

        // Latihan 2: OR (||)
        boolean isWeekend = false;
        boolean isHoliday = true;

        boolean isDayOff = isWeekend || isHoliday;
        System.out.println("Hari libur? " + isDayOff);

        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        // Latihan 3: NOT (!)
        boolean isRaining = true;
        boolean isSunny = !isRaining;
        System.out.println("isSunny: " + isSunny);

        System.out.println("!!isRaining: " + !!isRaining); // hasilnya sama dengan isRaining

        System.out.println("!(5 > 3): " + !(5 > 3)); // 5 > 3 adalah true, !true = false

        // ===== EKSPRESI BOOLEAN GABUNGAN =====
        System.out.println("\n=== EKSPRESI BOOLEAN GABUNGAN ===");

        boolean attendanceGood = true;
        boolean gradesHigh = false;
        boolean behaviorGood = true;

        boolean isOutstanding = attendanceGood && gradesHigh && behaviorGood;
        System.out.println("Siswa outstanding? " + isOutstanding);

        boolean isSatisfactory = attendanceGood && (gradesHigh || behaviorGood);
        System.out.println("Siswa memuaskan? " + isSatisfactory);

        boolean needsImprovement = !attendanceGood || !behaviorGood;
        System.out.println("Perlu perbaikan? " + needsImprovement);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Sistem kontrol akses
        boolean hasKeyCard = true;
        boolean knowsPassword = false;
        boolean isAuthorizedTime = true;
        boolean isEmergency = false;

        boolean normalAccess = hasKeyCard && knowsPassword && isAuthorizedTime;
        boolean emergencyAccess = isEmergency || (hasKeyCard && isAuthorizedTime);
        boolean accessDenied = !(normalAccess || emergencyAccess);

        System.out.println("Akses normal: " + normalAccess);
        System.out.println("Akses darurat: " + emergencyAccess);
        System.out.println("Akses ditolak: " + accessDenied);

        // Latihan 6: Pengambilan keputusan cuaca
        isRaining = false;
        boolean isSnowing = true;
        int temperature = -5;
        boolean isCloudy = true;

        boolean goodWeather = !isRaining && !isSnowing && temperature > 0;
        boolean needUmbrella = isRaining || (isCloudy && temperature > 20);
        boolean roadsDangerous = isSnowing || (isRaining && temperature < 5);

        System.out.println("Cuaca bagus untuk outdoor? " + goodWeather);
        System.out.println("Perlu bawa payung? " + needUmbrella);
        System.out.println("Jalan berbahaya? " + roadsDangerous);

        // ===== EVALUASI SHORT-CIRCUIT =====
        System.out.println("\n=== EVALUASI SHORT-CIRCUIT ===");

        // Latihan 7: Short-circuit AND
        int a = 5;
        int b = 0;

        // Evaluasi ini AMAN karena b != 0 akan false, maka ekspresi kedua tidak dijalankan
        boolean safeAnd = (b != 0) && (a / b > 2);
        System.out.println("Short-circuit AND aman? " + safeAnd);

        // Evaluasi ini juga AMAN karena b == 0 akan true, maka ekspresi kedua dilewati
        boolean safeOr = (b == 0) || (a / b > 2);
        System.out.println("Short-circuit OR aman? " + safeOr);

        // Komentar:
        // - Pada ekspresi AND, jika kondisi pertama false, Java tidak lanjut evaluasi bagian kanan.
        // - Pada ekspresi OR, jika kondisi pertama true, Java juga tidak lanjut evaluasi bagian kanan.

        // Latihan 8: Short-circuit dengan "method"
        boolean expensiveCheck1 = false;
        boolean expensiveCheck2 = true;

        // Simulasi: expensiveCheck1 adalah hasil dari method mahal (misal, cek database)
        boolean andResult = expensiveCheck1 && expensiveCheck2;
        System.out.println("AND Short-circuit result: " + andResult);
        // Komentar: Karena expensiveCheck1 == false, expensiveCheck2 tidak akan diperiksa

        boolean orResult = expensiveCheck2 || expensiveCheck1;
        System.out.println("OR Short-circuit result: " + orResult);
        // Komentar: Karena expensiveCheck2 == true, expensiveCheck1 tidak akan diperiksa
    }
}
