import java.util.Scanner;
public class PRAK101_2210817210028_MuhammadAuliaRasyid {
    public static void main(String[] args) {
        String nama, tempatlahir;
        int tanggallahir, bulanlahir, tahunlahir, tinggibadan ;
        float beratbadan;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        nama = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        tempatlahir = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        tanggallahir = input.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        bulanlahir = input.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        tahunlahir = input.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        tinggibadan = input.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        beratbadan = input.nextFloat();

        String bulan = "";
        if (bulanlahir == 1) {
            bulan = "Januari";
        } else if (bulanlahir == 2) {
            bulan = "Februari";
        } else if (bulanlahir == 3) {
            bulan = "Maret";
        } else if (bulanlahir == 4) {
            bulan = "April";
        } else if (bulanlahir == 5) {
            bulan = "Mei";
        } else if (bulanlahir == 6) {
            bulan = "Juni";
        } else if (bulanlahir == 7) {
            bulan = "Juli";
        } else if (bulanlahir == 8) {
            bulan = "Agustus";
        } else if (bulanlahir == 9) {
            bulan = "September";
        } else if (bulanlahir == 10) {
            bulan = "Oktober";
        } else if (bulanlahir == 11) {
            bulan = "November";
        } else if (bulanlahir == 12) {
            bulan = "Desember";
        } else {
            System.out.println("Pilihan tidak tersedia");
        }

        System.out.print("Nama Lengkap " + nama + ",");
        System.out.print(" Lahir di " + tempatlahir);
        System.out.print(" pada Tanggal " + tanggallahir);
        System.out.print(" " + bulan + " ");
        System.out.println(tahunlahir + " ");
        System.out.print("Tinggi Badan " + tinggibadan + " cm ");
        System.out.print("dan berat badan " + beratbadan + " kilogram");
    }
}
