import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float a = scn.nextFloat();
        float b = a *0.26418f;
        System.out.printf("%.1f",b);
    }
}
