import java.util.Scanner;

public class Tu07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 2;
        System.out.print("ค่า 1: ");
        a = sc.nextInt();
        System.out.print("ค่า 2: ");
        b = sc.nextInt();
        int sum = a+b;
        System.out.println(a+ " + " +b+ " = " +sum );
    }
}
/*
รับค่าจำนวนเต็มเข้ามา 2 ค่า
แล้วแสดงผลรวม
===output===
ค่า 1: 49
ค่า 2: 51

49 + 51 = 100
 */
