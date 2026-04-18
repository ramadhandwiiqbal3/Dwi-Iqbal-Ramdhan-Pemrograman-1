package tugas;
import java.util.Scanner;


public class tugas4 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    

    double Makanan = 20000;
    double Transport = 10000;
    double Belanja = 50000;


    double total = (Makanan + Transport + Belanja );

    double TotalMakan = ( Makanan / total) * 100;
    double TotalTransport = (Transport/ total) * 100;
    double TotalBelanja =  (Belanja / total ) * 100;

    System.out.println("Total Makanan : " + TotalMakan + "%");
    System.out.println("Total Transport : " + TotalTransport + "%");
    System.out.println("Total Belanja : " + TotalBelanja + "%");


    input.close();

    
    }
}
