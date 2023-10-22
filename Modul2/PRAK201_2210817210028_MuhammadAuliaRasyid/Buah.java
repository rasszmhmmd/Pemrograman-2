import static java.lang.Math.floor;

public class Buah{
    String namaBuah;
    double berat;
    double hargaPerKg;
    double jumlahbeli;

    Buah(String namaBuah, double berat, double hargaPerKg, double jumlahbeli) {
        this.namaBuah = namaBuah;
        this.berat = berat;
        this.hargaPerKg = hargaPerKg;
        this.jumlahbeli = jumlahbeli;
    }

    double hitungHargaSebelumDiskon() {
        return (jumlahbeli / berat) * hargaPerKg;
    }

    double hitungDiskon() {
        double diskon = 0;
            diskon = (floor(jumlahbeli/4))*(hargaPerKg * 0.02 * 4);
        return diskon;
    }

    double hitungHargaSetelahDiskon() {
        return hitungHargaSebelumDiskon() - hitungDiskon();
    }

    void tampilkanInfo() {
        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + hargaPerKg);
        System.out.println("Jumlah Beli: " + jumlahbeli + "Kg");
        System.out.println("Harga Sebelum Diskon: Rp" + String.format("%.2f", hitungHargaSebelumDiskon()));
        System.out.println("Total Diskon: Rp" + String.format("%.2f", hitungDiskon()));
        System.out.println("Harga Setelah Diskon: Rp" + String.format("%.2f", hitungHargaSetelahDiskon()));
        System.out.println();
    }
}