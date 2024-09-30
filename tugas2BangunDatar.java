import java.util.Scanner;

public class tugas2BangunDatar {
    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    public static double hitungKelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungKelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    public static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static double hitungKelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double sisi = input.nextDouble();
                System.out.println("Luas persegi: " + hitungLuasPersegi(sisi));
                System.out.println("Keliling persegi: " + hitungKelilingPersegi(sisi));
                break;
            case 2:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebar = input.nextDouble();
                System.out.println("Luas persegi panjang: " + hitungLuasPersegiPanjang(panjang, lebar));
                System.out.println("Keliling persegi panjang: " + hitungKelilingPersegiPanjang(panjang, lebar));
                break;
            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();
                System.out.println("Luas lingkaran: " + hitungLuasLingkaran(jariJari));
                System.out.println("Keliling lingkaran: " + hitungKelilingLingkaran(jariJari));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        input.close();
    }
}