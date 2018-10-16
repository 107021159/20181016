import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int v2 = scn.nextInt();
        int v3 = scn.nextInt();
        System.out.println(Math.max(Math.max(v1,v2),v3));
        System.out.println(Math.min(Math.min(v1,v2),v3));
    }
}
