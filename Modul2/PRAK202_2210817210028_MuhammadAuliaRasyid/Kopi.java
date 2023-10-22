package PRAK202_2210817210028_MuhammadAuliaRasyid;

public class Kopi {
    String namaKopi;
    String ukuran;
    Integer harga;
    String pembeli;

    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public String getPembeli() {
        return pembeli;
    }

    public double getPajak() {
        double pajak = 0.11 * harga;
        return pajak;
    }
}
