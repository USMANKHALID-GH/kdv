package DikÜçgende;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter side A");
        int a=input.nextInt();
        System.out.println("enter side b");
        int b=input.nextInt();
        double c=Math.sqrt(a^2 * b^2);
        double u = (a+b+c) / 2;
        double Üç𝑔𝑒𝑛𝑖𝑛ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2*u;
        double alan;
        alan= (u * (u-a)* (u-b) * (u-c));
        System.out.println("ALAN= "+alan);

    }
}
