import java.util.Scanner;

public class RekapNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0;
        double nilai ;

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilai = input.nextDouble();
            totalNilai += nilai;
        }
        double rataRata = totalNilai / jumlahSiswa;
        System.out.println("Rekap nilai siswa:" );
        System.out.println("Jumlah Siswa: " + jumlahSiswa);
        System.out.println("Total Nilai: " + totalNilai);
        System.out.println("Rata-rata Nilai: " + rataRata);

        input.close();
    }
}