import java.util.Scanner;
public class StudiKasus130 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;
        
        System.out.println("Berapa Cup yang dibeli : ");
        jumlahCup = sc.nextInt();

        System.out.println("Berapa uang yang dibayar : ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10/100;
        } else {
            diskon = 0;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga : Rp." + totalHarga);
        System.out.println("Diskon : Rp." + diskon);
        System.out.println("Total bayar : Rp." + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian =  uangBayar - totalBayar;
            System.out.println("kembalian Rp." + kembalian);
        } else {
            kurang  = totalBayar - uangBayar;
            System.out.println("uang tidak cukup, kurang Rp." + kurang);
        }

        sc.close();
    }
}