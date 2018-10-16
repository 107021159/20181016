import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float r = scn.nextFloat();
        float a = scn.nextFloat();
        double v = Math.PI*r*r*a;
        System.out.println(v);
    }
}
