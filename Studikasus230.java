import java.util.Scanner;
public class Studikasus230 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        //deklarasi variable
        String nama, jenis;
        int jumlahDoc, juara, statusPendanaan;
        //input data
        System.out.println("---Validasi Prestasi---");
        System.out.println("Nama Mahasiswa : ");
        nama = sc.nextLine();

        System.out.println("Jenis kegiatan : ");
        jenis = sc.nextLine();
        //pemilihan tahap 1
        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA") || jenis.equalsIgnoreCase("MANDIRI")) {
            
        }

        sc.close();
    }
}