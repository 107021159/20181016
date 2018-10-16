import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float k = scn.nextFloat();
        float c = k / 600f;
        System.out.printf("%.1f",c);
    }
}
