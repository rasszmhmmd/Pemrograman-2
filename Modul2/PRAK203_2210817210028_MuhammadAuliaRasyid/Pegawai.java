package PRAK203_2210817210028_MuhammadAuliaRasyid;

//public class salah digunakan karena menggunakan "Employee" dan harus menggunakan class "Pegawai" untuk terhubung ke Main.
//public class Employee {
public class Pegawai {
    public String nama;
    //Mengubah tipe data "char" menjadi "String"
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    //Menambahkan parameter "String j" untuk method setJabatan
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}