import java.util.Scanner;

public class cetakGambarGanjil {
    public static void main(String[] args) {
        /*for (int i = 1; i <= 5; i++) {
            System.out.print("*");
            System.out.print(" ");
            System.out.print("=");
            System.out.print(" ");
            for (int j = 1; j <= 2; j++) {
                System.out.print("=");
                System.out.print(" ");                
            }
            System.out.print("*");
            System.out.println();
        }*/

        Scanner input = new Scanner(System.in);
        System.out.print("cetak gambar = ");
        int tinggi = input.nextInt();

        if (tinggi % 2 == 1) {

            int awalAkhir = (tinggi - 1) / 2;

            for (int i = 1; i <= awalAkhir; i++) {
                System.out.print("*");
                System.out.print(" ");

                for (int k = 1; k <= (awalAkhir + 1); k++) {
                    System.out.print("=");
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }

            for (int l = 1; l <= awalAkhir - 1; l++) {
                System.out.print("*");
                System.out.print(" ");

                for (int m = 1; m <= (awalAkhir + 1); m++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }

            for (int n = 1; n <= awalAkhir; n++) {
                System.out.print("*");
                System.out.print(" ");

                for (int o = 1; o <= (awalAkhir + 1); o++) {
                    System.out.print("=");
                    System.out.print(" ");
                }

                System.out.print("*");
                System.out.println();
            }
        } else {
            System.out.println("Hanya bisa untuk bilangan ganjil");
        }
    }
}