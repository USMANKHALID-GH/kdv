package DikΓΓ§gende;

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
        double ΓΓ§πππππΓ§ππ£πππ π = 2*u;
        double alan;
        alan= (u * (u-a)* (u-b) * (u-c));
        System.out.println("ALAN= "+alan);

    }
}
