package PRAK203_2210817210028_MuhammadAuliaRasyid;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //Menambahkan tanda ";" karena tidak ada
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        //Kurangnya p1.umur = 17;
        p1.umur = 17;
        p1.setJabatan("Assassin"); //Menggunakan method setJabatan dengan parameter
        
        //Perbedaan output pada Nama Pegawai yang seharusnya hanya Nama
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Kurangnya kata "Tahun setelah umur menghasilkan output yang berbeda dengan soal
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " Tahun");
    }
}