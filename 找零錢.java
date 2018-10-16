import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a1 = scn.nextInt();
        int a2 = scn.nextInt();
        int a3 = scn.nextInt();
        int r = n-(a1*15+a2*20+a3*30);
        if(r<=0){
            System.out.println("0");
        }
        else{
            int d50 = r/50;
            r = r%50;
            int d5 =  r/5;
            int d1 =  r%5;
            System.out.println(d1);
            System.out.println(d5);
            System.out.println(d50);
        }
    }
}
