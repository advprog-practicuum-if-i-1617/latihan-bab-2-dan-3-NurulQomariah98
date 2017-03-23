package latihan;
import java.util.Scanner;
/**
 *
 * @author ridho
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int a = input.nextInt();
        latihan x = new latihan(a);
        System.out.println(x.getRibuan());
        System.out.print("Masukkan kata : ");
        input.nextLine();
        String b = input.nextLine();
        x = new latihan(b);
        x.getRibuan(b);
    }
}
