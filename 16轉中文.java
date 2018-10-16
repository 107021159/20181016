import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner ch=new Scanner(System.in);
	String a=ch.next();
	int v=Integer.valueOf(a,16);
        System.out.println((char)v);
    }
}
