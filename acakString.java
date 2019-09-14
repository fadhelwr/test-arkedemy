import java.util.Scanner;

public class acakString {
    public static void main(String[] args) {
      Scanner jmlBaris = new Scanner(System.in);
        System.out.print("jumlah baris = ");
        int baris = jmlBaris.nextInt();

       char karakterAcak;  
       String deretKarakter = "";
  
        for (int i = 1; i <= baris; i++) {

            System.out.println();

            for (int x = 1; x <= 32; x++) {
                karakterAcak = (char) ('z' + Math.random() * ('0' - '9'));
                deretKarakter += karakterAcak + "";
            }

            System.out.println(deretKarakter);
        }  
    }
 }