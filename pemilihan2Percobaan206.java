import java.util.Scanner;
public class pemilihan2Percobaan206 {

    public static void main(String[] args) {
        Scanner sc06 = new Scanner(System.in); 
        double diskon;
        int harga, potonganQRIS;
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
        System.out.print("Apakah punya member (y/n) ? = ");
        String member = sc06.nextLine();
        System.out.println("---------------------------------------");
        
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);    
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            double total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
            }

            else if (member.equalsIgnoreCase("n")) {
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga Ricebowl = " + harga);    
                } else if (pilihan_menu == 2) {
                    harga = 3000;
                    System.out.println("Harga ice tea = " + harga);
                } else if (pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga bundling = " + harga);
                } else {
                    System.out.println("Masukkan pilihan menu dengan benar");
                    return;
                }
                System.out.println("Total bayar = " + harga);
            } else {
                System.out.println("Member tidak valid");
            }
            System.out.print("Masukkan jumlah total pembayaran: Rp. ");
            double totalPembayaran = sc06.nextDouble();
            double potongan = 1000.0;
            double totalAkhir;
            System.out.print("Apakah Anda membayar melalui QRIS? (ya/tidak): ");
            sc06.nextLine();
            String metodePembayaran = sc06.nextLine();

            if (metodePembayaran.equalsIgnoreCase("ya")) {
            totalAkhir = totalPembayaran - potongan;
            System.out.println("Anda mendapatkan potongan harga Rp. " + potongan);
            } else {
            totalAkhir = totalPembayaran;
            System.out.println("Tidak ada potongan harga.");
            }

            System.out.println("Total pembayaran setelah potongan: Rp. " + totalAkhir);
            System.out.println("----------------------------------------");
        }
    }