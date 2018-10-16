import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int cm = scn.nextInt();
	int kg = scn.nextInt();
	double a = cm/2.54;
	double b = kg/0.454;
	System.out.println(a);
	System.out.println(b);

    }
}
