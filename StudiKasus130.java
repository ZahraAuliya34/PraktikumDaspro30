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

        totalBayar = jumlahCup * hargaPerCup;
        
        sc.close();
    }
}