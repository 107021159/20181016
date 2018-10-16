import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Float m = scn.nextFloat();
        float k = m*1.6f;
        System.out.printf("%.2f",k);
    }
}
