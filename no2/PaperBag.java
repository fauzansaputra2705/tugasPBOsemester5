package no2;

import java.util.Scanner;

public class PaperBag {
    private String ukuranPaperBag;
    private long hargaPaperBag;
    private double bunga;
    private double kewajibanBulanan;
    private double totalWajibBayar;

    public void setUkuranPaperBag() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih ukuran PaperBag:");
        System.out.println("1. XL");
        System.out.println("2. L ");
        System.out.println("3. M ");
        System.out.println();
        System.out.print("MASUKKAN PILIHAN : ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                ukuranPaperBag = "XL";
                hargaPaperBag = 30000000;
                break;
            case 2:
                ukuranPaperBag = "L";
                hargaPaperBag = 20000000;
                break;
            case 3:
                ukuranPaperBag = "M";
                hargaPaperBag = 10000000;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public void hitungBungaDanKewajiban(int bulan) {
        bunga = hargaPaperBag * 0.025;
        kewajibanBulanan = (bunga * bulan + hargaPaperBag) / bulan;
        totalWajibBayar = hargaPaperBag + (bunga * bulan);
    }

    public String getUkuranPaperBag() {
        return ukuranPaperBag;
    }

    public long getHargaPaperBag() {
        return hargaPaperBag;
    }

    public double getBunga() {
        return bunga;
    }

    public double getKewajibanBulanan() {
        return kewajibanBulanan;
    }

    public double getTotalWajibBayar() {
        return totalWajibBayar;
    }
}
