import java.util.Scanner;
    public class Main {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            char ch = scn.next().charAt(0);
            System.out.println(Integer.toHexString((int)ch));
        }
    }
