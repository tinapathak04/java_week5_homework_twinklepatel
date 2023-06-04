package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        String ch = "y";
        do {
            Scanner tv = new Scanner(System.in);
            System.out.println("Enter first Number: ");
            int a = tv.nextInt();
            System.out.println("Enter second Number: ");
            int b = tv.nextInt();
            System.out.println("Please enter one of symbol +,-,*, /: ");
            char symbol = tv.next().charAt(0);
            Main main = new Main();
            main.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation Please enter “Y” or “N” :");
            ch = tv.next();
            
        }while(ch.equalsIgnoreCase("Y"));
    }
}
