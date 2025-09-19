public class OperatorPrecedencePractice {
    public static void main(String[] args) {

        System.out.println("=== PRECEDENCE OPERATOR ARITMATIKA ===");

        int a = 10, b = 5, c = 2;

        // a + b * c
        int result1 = a + b * c; // 10 + (5 * 2) = 10 + 10 = 20
        System.out.println("a + b * c = " + result1 + " (prediksi: 20)");

        // (a + b) * c
        int result2 = (a + b) * c; // (10 + 5) * 2 = 15 * 2 = 30
        System.out.println("(a + b) * c = " + result2 + " (prediksi: 30)");

        // a * b + c / 2
        int result3 = a * b + c / 2; // (10*5) + (2/2) = 50 + 1 = 51
        System.out.println("a * b + c / 2 = " + result3 + " (50 + 1 = 51)");

        // a / b + c * 2
        int result4 = a / b + c * 2; // (10/5) + (2*2) = 2 + 4 = 6
        System.out.println("a / b + c * 2 = " + result4 + " (2 + 4 = 6)");

        System.out.println("\n=== PRECEDENCE PERBANDINGAN DAN ARITMATIKA ===");

        int x = 15, y = 10, z = 20;

        boolean res1 = x + y > z - 5;
        // 15+10=25, 20-5=15, 25>15 -> true
        System.out.println("x + y > z - 5 = " + res1);

        boolean res2 = x > y + z / 4;
        // z/4=5, y+5=15, 15 > 15? false
        System.out.println("x > y + z / 4 = " + res2);

        boolean res3 = (x + y) > (z - 5) && x < z;
        // (15+10)=25 > (20-5)=15 -> true && 15<20 -> true = true
        System.out.println("(x + y) > (z - 5) && x < z = " + res3);

        boolean res4 = x * 2 + y > z && y < x + 5;
        // 15*2=30 +10=40 > 20 -> true && 10<20 -> true => true
        System.out.println("x * 2 + y > z && y < x + 5 = " + res4);

        System.out.println("\n=== PRECEDENCE OPERATOR LOGIKA ===");

        boolean p = true, q = false, r = true;

        boolean logic1 = p && q || r;
        // && dulu: true && false = false, then false || true = true
        System.out.println("p && q || r = " + logic1);

        boolean logic2 = p || q && r;
        // && dulu: false && true = false, then true || false = true
        System.out.println("p || q && r = " + logic2);

        boolean logic3 = !p && q || r;
        // !p = false, false && false = false, false || true = true
        System.out.println("!p && q || r = " + logic3);

        boolean logic4 = p && (q || r);
        // q || r = false || true = true, then true && true = true
        System.out.println("p && (q || r) = " + logic4);

        System.out.println("\n=== TIPE OPERATOR CAMPURAN ===");

        int num1 = 25, num2 = 15, num3 = 30;

        boolean mixed1 = num1 > num2 + 5 && num3 / 2 < num1;
        // 25 > 15 + 5 = 25 > 20 = true
        // 30 / 2 = 15 < 25 = true
        // true && true = true
        System.out.println("num1 > num2 + 5 && num3 / 2 < num1 = " + mixed1);

        boolean mixed2 = num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10;
        // && dulu:
        // num3 - num1 = 5 < 10 = true
        // num2 > 10 = true
        // true && true = true
        // Lalu OR:
        // num1 + num2 = 40 > 30 = true
        // true || true = true
        System.out.println("num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10 = " + mixed2);

        boolean mixed3 = (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10;
        // (true || true) && true = true && true = true
        System.out.println("(num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10 = " + mixed3);

        System.out.println("\n=== UNARY OPERATORS DAN PRECEDENCE ===");

        int value = 8;

        int unary1 = ++value * 2; // pre-increment jadi 9 * 2 = 18
        System.out.println("++value * 2 = " + unary1 + " (value sekarang " + value + ")");

        value = 8;
        int unary2 = value++ * 2; // post-increment 8 * 2 = 16, lalu value = 9
        System.out.println("value++ * 2 = " + unary2 + " (value sekarang " + value + ")");

        value = 8;
        int unary3 = 2 * ++value; // pre-increment jadi 9 * 2 = 18
        System.out.println("2 * ++value = " + unary3 + " (value sekarang " + value + ")");

        value = 8;
        int unary4 = -value + 10; // unary minus jadi -8 + 10 = 2
        System.out.println("-value + 10 = " + unary4);

        System.out.println("\n=== PRECEDENCE OPERATOR ASSIGNMENT ===");

        a = 5;
        b = 10;

        a += b * 2; // b*2=20, a = 5 + 20 = 25
        System.out.println("a += b * 2 -> a = " + a);

        a = 5;
        a *= b + 3; // b+3=13, a=5*13=65
        System.out.println("a *= b + 3 -> a = " + a);

        a = b > 5 ? b * 2 : b / 2;
        // b=10 >5 true, jadi a= b*2 = 20
        System.out.println("a = b > 5 ? b * 2 : b / 2 -> a = " + a);

        System.out.println("\n=== TANDA KURUNG DAN OVERRIDE PRECEDENCE ===");

        a = 8; b = 4; c = 2; x = 6;

        // a + b * c - d
        // b*c=8, a+8=16, 16 - d=16 - 6=10
        int calc1 = a + b * c - x;
        System.out.println("a + b * c - d = " + calc1);

        // (a + b) * (c - d)
        // (8+4)=12, (2 - 6) = -4, 12 * -4 = -48
        int calc2 = (a + b) * (c - x);
        System.out.println("(a + b) * (c - d) = " + calc2);

        // a > b && c < d || a == b
        // a>b = 8>4 = true
        // c<d = 2<6 = true
        // true && true = true
        // a==b = false
        // true || false = true
        boolean logicExpr1 = a > b && c < x || a == b;
        System.out.println("a > b && c < d || a == b = " + logicExpr1);

        // a > b && (c < d || a == b)
        // c<d || a==b = true || false = true
        // a>b && true = true && true = true
        boolean logicExpr2 = a > b && (c < x || a == b);
        System.out.println("a > b && (c < d || a == b) = " + logicExpr2);

        // Ekspresi nested kompleks
        // ((a + b) * c) / (d - 2) > (a - b)
        // (8+4)=12 * 2=24
        // d-2=6-2=4
        // 24 / 4 =6
        // a - b = 8 - 4 = 4
        // 6 > 4 = true
        boolean nested = ((a + b) * c) / (x - 2) > (a - b);
        System.out.println("((a + b) * c) / (d - 2) > (a - b) = " + nested);
    }
}
