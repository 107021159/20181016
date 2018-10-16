import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int hr1 = scn.nextInt();
        int min1 = scn.nextInt();
        int hr2 = scn.nextInt();
        int min2 = scn.nextInt();
        int min = (hr2*60+min2)-(hr1*60+min1);
        int money;
        if(min<120){
            money = 30*(min/30);
        }else if(min<240){
            min = min-120;
            money = 120+40*(min/30);
        }
        else{
            min = min - 240;
            money = 120 + 160 + 60*(min/30);
        }
        System.out.println(money);
    }
}
