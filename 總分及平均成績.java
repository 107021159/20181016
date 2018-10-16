import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int chinese = scn.nextInt();
        int english = scn.nextInt();
        int math = scn.nextInt();
        int sum = chinese+english+math;
        int a = sum/3;
        System.out.println(sum);
        System.out.println(a);
    }
}