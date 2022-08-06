import java.util.Scanner;
public class ucgenhesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Birinci kenarı giriniz :");
        a = input.nextInt();
        System.out.print("\nİkinci kenarı giriniz :");
        b = input.nextInt();
        System.out.print("\nÜçüncü kenarı giriniz :");
        c = input.nextInt();


        int cevre = a + b + c;
        System.out.println("\nÜcçgenin çevresi :"+ cevre);
        int u = cevre/2;
        int alan = u*(u-a)*(u-b)*(u-c);
        System.out.println("Üçgenin alanının karesi :"+ alan);
    }



}
