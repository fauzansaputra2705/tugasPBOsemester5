import java.util.Scanner;

import no1.Salon;

/**
 * main
 */
public class Main {

    public void soal(int nomor, String[] args) {
        if (nomor == 1) {
            Salon.main(args);
        } else if (nomor == 2) {
            no2.Main.main(args);
        }else if (nomor == 3) {
            no3.Main.main(args);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] no = {1,2,3};

        System.out.println(" ----- QUIZ PBO SEMESTER 5 ----- ");
        System.out.println(" ================================================= ");
        System.out.println(" Nama: Muhammad Fauzan Saputra ");
        System.out.println(" Kelas: X5F  ");
        System.out.println(" NPM: 202143500586  ");
        System.out.println("");
        System.out.println("SILAHKAN PILIH SOAL :");
        for (int i = 0; i < no.length; i++) {
            System.out.println("NOMOR "+no[i]);
        }
        int nomor = scanner.nextInt();
        Main main = new Main();
        main.soal(nomor, args);
    }
}
