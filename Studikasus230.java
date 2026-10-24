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
        //proses pemilihan bersarang
        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA") || jenis.equalsIgnoreCase("MANDIRI")) {
            System.out.println("Masukkan juara : ");
            juara = sc.nextInt();

            System.out.println("Berapa dokumen yang di ajukan : ");
            jumlahDoc = sc.nextInt();

            if (juara >= 1 && juara <= 3) {
                if (jumlahDoc == 4) {
                    statusPendanaan = 1;
                    System.out.println("Dana diberikan");
                } else {
                    statusPendanaan = 2;
                    System.out.println("Dana tidak diberikan");
                    System.out.println("jumlah dokumen kurang dari 4");
                }
            } else {
                statusPendanaan = 3;
                System.out.println("Dana tidak diberikan");
                System.out.println("bukan juara 1,2 dan 3");
            }
                
        } else if (jenis.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan (1 = lolos, 0 = tidak lolos) : ");
            statusPendanaan = sc.nextInt();
            System.out.print("Jumlah dokumen yang diupload (0-4) : ");
            jumlahDoc = sc.nextInt();

            if (statusPendanaan == 1) {
                if (jumlahDoc == 4) {
                    System.out.println("Dana diberikan");
                } else {
                    System.out.println("Dana tidak diberikan");
                    System.out.println("Dokumen tidak lengkap, kurang " + (4 - jumlahDoc) + " dokumen");
                }
            } else {
                System.out.println("Dana tidak diberikan");
                System.out.println("PKM tidak lolos pendanaan");
            }

        } else if (jenis.equalsIgnoreCase("LAINNYA")) {
            System.out.println("Dana tidak diberikan");
            System.out.println("Kegiatan kategori Lainnya tidak memperoleh dana penghargaan");

        } else {
            System.out.println("jenis kegiatan tidak valid");
        }

        sc.close();
    }
}