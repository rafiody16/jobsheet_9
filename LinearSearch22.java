import java.util.Scanner;

public class LinearSearch22 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int key;
        int hasil = -1;

        System.out.print("Masukkan Jumlah Elemen Array: ");
        int jmlArray = sc.nextInt();
        int [] arrayInt = new int[jmlArray];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.printf("Masukkan Elemen Array Ke-"+i+" : ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan Key yang Ingin Dicari: ");
        key = sc.nextInt();
        for (int i = 0; i < arrayInt.length; i++)
        {
             if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
                break;
            }
        }
        if (hasil == -1) {
            System.out.println("Key Tidak Ditemukan!");
        }
    }
}
