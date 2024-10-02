import java.lang.reflect.Member;
import java.util.Scanner;
public class pemilihan2Percobaan206 {

    public static void main(String[] args) {
        Scanner sc06 = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("--------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        int pilihan_menu = sc06.nextInt();
        sc06.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        String member = sc06.nextLine();
        System.out.println("---------------------------------------");
        if (member.equalsIgnoreCase("y")) {
            double diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                int harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);    
            } else if (pilihan_menu == 2) {
                int harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                int harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            int harga;
            double total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
            }
            else if (member.equalsIgnoreCase("n")) {
                double diskon = 0.10;
                System.out.println("Besar diskon = 10%");
                if (pilihan_menu == 1) {
                    int harga = 14000;
                    System.out.println("Harga Ricebowl = " + harga);    
                } else if (pilihan_menu == 2) {
                    int harga = 3000;
                    System.out.println("Harga ice tea = " + harga);
                } else if (pilihan_menu == 3) {
                    int harga = 15000;
                    System.out.println("Harga bundling = " + harga);
                } else {
                    System.out.println("Masukkan pilihan menu dengan benar");
                    return;
                }
                System.out.println("Total bayar = " + harga);
        }
    }
}