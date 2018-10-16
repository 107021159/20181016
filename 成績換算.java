import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int v2 = (int)Math.sqrt((double)v1)*10;
        System.out.println(v2);
    }
}
