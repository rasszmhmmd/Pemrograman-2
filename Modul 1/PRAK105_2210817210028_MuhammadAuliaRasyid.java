import java.util.Scanner;
import java.text.DecimalFormat;
public class PRAK105_2210817210028_MuhammadAuliaRasyid {
        public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double r, t, phi, volume;
        phi = 3.14;

        System.out.print("Masukkan jari-jari: ");
        r = keyboard.nextDouble();

        System.out.print("Masukkan tinggi: ");
        t = keyboard.nextDouble();
        volume = phi * r * r * t;
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.print("Volume tabung dengan jari-jari " + r + " cm dan ");
        System.out.print("tinggi " + t + " cm adalah " + df.format(volume) + " m3 ");
    }
}