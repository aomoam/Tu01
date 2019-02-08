import java.util.Scanner;

public class Tu06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = "";
        String lastName = "";

        System.out.print("ชื่อ: ");
        firstName = sc.nextLine();

        System.out.print("นามสกุล: ");
        lastName = sc.nextLine();

        System.out.println("ชื่อเต็ม "+firstName+" "+lastName);
    }
}
