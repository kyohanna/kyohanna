
import java.util.Scanner;


public class Soal3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Soal3 resto = new Soal3();
        String pesanlagi = "";
        int input; //makanan/minuman

        while (!pesanlagi.equalsIgnoreCase("n")) {
            System.out.println("============");
            System.out.println("    MENU    ");
            System.out.println("============");
            System.out.println("1. Pesan Makanan/Minuman");
            System.out.println("2. Bayar");
            System.out.println("3. Update Harga");
            System.out.println("4. Exit");
            System.out.print("Input : ");
            input = scan.nextInt();

            if (input == 1) {
                resto.menumakanan();
            }

            if (input == 2) {
                resto.bayar();
            }

            if (input == 3) {

            }

            if (input == 4) {
                pesanlagi = "n";
            }
        }

    }

    public void menumakanan() { //input1
        Scanner scan = new Scanner(System.in);

        int jumlahorder = 0;
        int makmin[] = new int[jumlahorder]; //input pesanan makanan/minuman
        int jumlahmakmin[] = new int[jumlahorder];

        System.out.println("=============================");
        System.out.println("     PESAN MAKANAN/MINUMAN   ");
        System.out.println("=============================");
        System.out.println("1. Nasi Goreng - 24000");
        System.out.println("2. Ayam Goreng - 28000");
        System.out.println("3. Mie Goreng - 26000");
        System.out.println("4. Air Putih - 2000");
        System.out.println("5. Jeruk Peras - 4000");
        System.out.println("6. Milo - 6000");

        for (int i = 0; i < makmin.length; i++) {
            System.out.println("Jumlah orderan (Mau order berapa makanan/minuman dari menu) : ");
            jumlahorder = scan.nextInt();
            System.out.print("Input : ");
            makmin[i] = scan.nextInt();
            System.out.print("Jumlah makanan yang dipilih : ");
            jumlahmakmin[i] = scan.nextInt();

        }
         if (makmin == 1){
             System.out.println("24000");
         }
            int totalmakanan = makmin[i] * jumlahmakmin[i];
            System.out.println("Total = " + totalmakanan);


    }

    public void bayar() {
        for (int i = 0; i < makmin; i++) {
            if (makmin[i] == 1){
              System.out.println("Nasi Goreng * " + jumlahmakmin +);  
            }
            
            
        }
    }

}

// //Preparation
//        int input = 0;
//        //pilih makanan ato minum
//        int input1 = 0;
//        //input makanan apa yang mau di pesan
//        int input2 = 0;
//        //input minuman apa yang mau di beli
//        int ngoreng = 20000;
//        int nuduk = 15000;
//        int bistik = 25000;
//        int jumlahmakanan = 0;
//        int jumlahminuman = 0;
//        int subtotal = 0;
//        int total = 0;
//        int air = 2000;
//        int jeruk = 5000;
//        int teh = 3500;
//
//        String pesanlagi = "";
//
//        //Input & Process & Output
//        while (!pesanlagi.equalsIgnoreCase("n")) {
//            System.out.println("============");
//            System.out.println("    MENU    ");
//            System.out.println("============");
//            System.out.println("1. Makanan");
//            System.out.println("2. Minuman");
//            System.out.print("Input : ");
//            input = scan.nextInt();
//
//            if (input == 1) {
//                System.out.println("============");
//                System.out.println("    MENU    ");
//                System.out.println("============");
//                System.out.println("1. Nasi Goreng - 20000");
//                System.out.println("2. Nasi Uduk - 15000");
//                System.out.println("3. Bistik Galantin - 25000");
//                System.out.print("Input : ");
//                input1 = scan.nextInt();
//                System.out.print("Jumlah : ");
//                jumlahmakanan = scan.nextInt();
//
//                if (input1 == 1) {
//                    subtotal = ngoreng * jumlahmakanan;
//                } else if (input1 == 2) {
//                    subtotal = nuduk * jumlahmakanan;
//                } else if (input1 == 3) {
//                    subtotal = bistik * jumlahmakanan;
//                }
//                System.out.println("Subtotal = " + subtotal);
//                total += subtotal;
//                System.out.println("Total = " + total);
//                System.out.println("Pesan lagi (y/n) ");
//                pesanlagi = scan.next() + scan.nextLine();
//
//            } else if (input == 2) {
//                System.out.println("============");
//                System.out.println("    MENU    ");
//                System.out.println("============");
//                System.out.println("1. Air Mineral - 2000");
//                System.out.println("2. (Es/Hangat) Teh - 3500");
//                System.out.println("3. (Es/Hangat) Jeruk  - 5000");
//                System.out.print("Input : ");
//                input2 = scan.nextInt();
//                System.out.print("Jumlah : ");
//                jumlahminuman = scan.nextInt();
//
//                if (input2 == 1) {
//                    subtotal = air * jumlahminuman;
//                } else if (input2 == 2) {
//                    subtotal = teh * jumlahminuman;
//                } else if (input2 == 3) {
//                    subtotal = jeruk * jumlahminuman;
//                }
//                System.out.println("Subtotal = " + subtotal);
//                total += subtotal;
//                System.out.println("Total = " + total);
//                System.out.println("Pesan lagi (y/n) ");
//                pesanlagi = scan.next() + scan.nextLine();
//            }
//
//        }
//        System.out.println("Total harga = " + total);
//        System.out.println("Terima Kasih");
//    }
//}
