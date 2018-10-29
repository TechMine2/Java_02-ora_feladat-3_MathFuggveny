package javaapp_02_mathfuggveny;

import java.util.Scanner;

public class JavaApp_02_MathFuggveny {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valosPozitivSzam;
        
        do{
            System.out.println("Kérem adjon meg egy pozitív valós számot: ");
            valosPozitivSzam = sc.nextDouble();
        }while (valosPozitivSzam < 0);
        
        System.out.println(
        String.format(
                "A megadott szám a %d és a %d egész számok között van, és ezek közül a %d számhoz van közelebb.\n" +
                "A szám egész része: %d \n" +
                "A szám törtrésze: %f \n",
                (int)Math.floor(valosPozitivSzam),
                (int)Math.ceil(valosPozitivSzam),
                (int)Math.round(valosPozitivSzam),
                (int)Math.floor(valosPozitivSzam),
                valosPozitivSzam - Math.floor(valosPozitivSzam)
        
        )
        );           
    }
    
}
