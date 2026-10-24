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
                
        } else {
            System.out.println("jenis kegiatan tidak valid");
        }

        sc.close();
    }
}