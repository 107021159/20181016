import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int y = scn.nextInt();
        if(y>=3 && y<=5){
            System.out.println("Spring");
        }
        else if(y>=6 && y<=8){
            System.out.println("Summer");
        }
        else if(y>=9 && y<=11){
            System.out.println("Autumn");
        }
        else if(y>=12 && y<=2){
            System.out.println("Winter");
        }
    }
}
