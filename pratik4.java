
import java.util.Scanner;

public class pratik4 {
    public static void main(String[] args) {
        int r, a;
        double pi=3.14;

        Scanner inp = new Scanner(System.in);

    System.out.print("Dairenin yarıçapını giriniz : ");
    r = inp.nextInt();

    System.out.print("Dairenin merkez açısını giriniz : ");
    a = inp.nextInt();

    double dilimAlani = (pi * (r*r) * a) / 360 ;
    System.out.println("Daire diliminin alanı : " + dilimAlani);
    }
}
