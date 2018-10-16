import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int h = scn.nextInt();
        int sex = scn.nextInt();
        if(sex == 1){
            float ans = (h-80)*0.7f;
            System.out.println(Math.round(ans*10)/10f);
        }else{
            float ANS = (h-70)*0.6f;
            System.out.println(Math.round(ANS*10)/10f);
        }
    }
}
