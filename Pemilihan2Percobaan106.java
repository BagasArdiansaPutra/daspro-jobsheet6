import java.util.Scanner;
public  class Pemilihan2Percobaan106 {

    public static void main(String[] args) {
        Scanner sc06 = new Scanner(System.in);
        System.out.print("Masukkan Tahun: ");
        int tahun = sc06.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0 ) {
                    System.out.println("Tahun kabisat");
                } else {
                    System.out.println("Bukan tahun kabisat");
                }
                System.out.println("Tahun Kabisat");
        } else 
        System.out.println("Bukan Tahun Kabisat");

            }
        }  
    }