import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// Ededin üstünü tapan bir "power" metodu yazın,
// metod number ve power parametrleri alib
// ona uygun ededin ustunu geri qaytarmalidir.

        Scanner scan = new Scanner(System.in);
        System.out.print("Eded daxil edin: ");
        int number=scan.nextInt();

        System.out.print("Eded ustu daxil edin: ");
       int power=scan.nextInt();

        System.out.println(power(number,power));
    }

        public static int power(int number, int power) {
        int totalValue=1;
            for (int i=0;i<power;i++){
                totalValue*=number;
            }
    return totalValue;}
    }