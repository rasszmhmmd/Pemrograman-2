import java.util.Scanner;
public class PRAK103_2210817210028_MuhammadAuliaRasyid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deretN = input.nextInt();
        int angka = input.nextInt();
        int i = 0;
        do {
            if(angka % 2 == 1) {
                System.out.print(angka);
                if(i < deretN-1) {
                    System.out.print(", ");
                }
                i++;
            }
            angka++;
        } while(i < deretN);
    }
}