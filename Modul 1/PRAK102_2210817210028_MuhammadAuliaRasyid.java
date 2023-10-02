import java.util.Scanner;
public class PRAK102_2210817210028_MuhammadAuliaRasyid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, deret;
        angka = input.nextInt();
        int i = 0;
        while (i <= 10) {
            if (angka % 5 == 0) {
                deret = angka / 5 - 1;
                System.out.print(deret);
                if(i < 10) System.out.print(", ");
            } else {
                deret = angka;
                System.out.print(deret);
                if(i < 10) System.out.print(", ");
            }
            angka++;
            i++;
        }
    }
}