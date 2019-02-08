import java.util.Scanner;

public class Tu04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = 0;

        System.out.print("อายุคือ: ");
        age = sc.nextInt();
        System.out.println("อายุของคุณ คือ " +age+ (" ปี "));

    }
}
/*
รับค่าอายุจากแป้นพิมพ์
===output===
อายุคือ: 4
อายุของคุณ คือ 4 ปี
 */
