import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        float summer, notSummer;
        if(v1 <= 120){
            summer = v1* 2.10f;
            notSummer = v1*2.10f;
        }else if(v1 <= 330){
            v1 -= 120;
            summer = 120 * 2.10f +v1 * 3.02f;
            notSummer = 120 *2.10f+v1 * 2.68f;
        }else if(v1<=500){
            v1 -= 330;
            summer = 120*2.10f+(330-120)*3.02f+v1*4.39f;
            notSummer = 120*2.10f+(330-120)*2.68f+v1*3.61f;
        }else if (v1<= 700){
            v1 -= 500;
            summer = 120*2.10f+(330-120)*3.02f+(500-330)*4.39f+v1*4.97f;
            notSummer = 120*2.10f+(330-120)*2.68f+(500-330)*3.61f+v1*4.01f;
        }else{
            v1 -= 700;
            summer = 120*2.10f+(330-120)*3.02f+(500-330)*4.39f+(700-500)*4.97f+v1*5.63f;
            notSummer = 120*2.10f+(330-120)*2.68f+(500-330)*3.61f+(700-500)*4.01f+v1*4.50f;
        }
        System.out.println(summer);
        System.out.println(notSummer);
    }
}
