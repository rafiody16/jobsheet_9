import java.util.Scanner;

public class ArrayRataNilai22 {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int jmlLulus = 0, jmlTdkLulus = 0;
        double total = 0, ttlLulus = 0, ttlTdkLulus = 0;
        double rata2, rata2Lulus, rata2TdkLulus;

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int [] nilaiMhs = new int [jmlMhs];

        for (int i = 0; i < nilaiMhs.length; i++)
        {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs [i] = sc.nextInt();

            if (nilaiMhs[i] > 70)
            {
                jmlLulus++;
            }
            else if (nilaiMhs[i] < 70)
            {
                jmlTdkLulus++;
            }
        }

        for (int i = 0; i < nilaiMhs.length; i++)
        {
            total += nilaiMhs[i];

            if (nilaiMhs [i] > 70) {
                ttlLulus += nilaiMhs[i];
            }
            else if (nilaiMhs [i] < 70)
            {
                ttlTdkLulus += nilaiMhs[i];
            }
        }

        rata2 = total/nilaiMhs.length;
        rata2Lulus = ttlLulus/jmlLulus;
        rata2TdkLulus = ttlTdkLulus/jmlTdkLulus;
        System.out.println("Rata-rata nilai: "+rata2);
        System.out.println("Jumlah mahasiswa yang lulus: "+jmlLulus);
        System.out.println("Jumlah Mahasiswa yang Tidak Lulus: "+jmlTdkLulus);
        System.out.println("Rata-rata Mahasiswa Lulus: "+rata2Lulus);
        System.out.println("Rata-rata Mahasiswa Tidak Lulus: "+rata2TdkLulus);
    }
}
