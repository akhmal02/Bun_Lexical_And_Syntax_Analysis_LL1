
/*
NAME : MUHAMMAD AKHMAL BIN MOHAMAD HUSSIN
*/

import java.util.Scanner;

public class RDP2 {

    static String[] tokens;
    static int index;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nEnter input tokens (space separated) or type 'exit' to quit:");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program ended.");
                break;
            }

            tokens = (input + " $").split(" ");
            index = 0;

            System.out.print("Action Output: ");

            if (Gardenia() && current().equals("$")) {
                System.out.println("\nACCEPT");
            } else {
                System.out.println("\nREJECT");
            }
        }
    }

    // Helpers
    static String current() {
        return tokens[index];
    }

    static void advance() {
        index++;
    }

    // Gardenia
    static boolean Gardenia() {

        // Gardenia → Ooobun {print +} vanilla
        if (current().equals("choco") || current().equals("pandan") || current().equals("durian")) {
            if (Ooobun() && current().equals("vanilla")) {
                System.out.print("+ ");
                advance();
                return true;
            }
            return false;
        }

        // Gardenia → vanilla Gardenia {print /}
        if (current().equals("vanilla")) {
            advance();
            if (Gardenia()) {
                System.out.print("/ ");
                return true;
            }
            return false;
        }

        // Gardenia → butter Ooobun
        if (current().equals("butter")) {
            advance();
            return Ooobun();
        }

        return false;
    }

    // Ooobun
    static boolean Ooobun() {

        // Ooobun → choco Sunshine {print *}
        if (current().equals("choco")) {
            advance();
            if (Sunshine()) {
                System.out.print("* ");
                return true;
            }
            return false;
        }

        // Ooobun → pandan Suria butter {print +}
        if (current().equals("pandan")) {
            advance();
            if (Suria() && current().equals("butter")) {
                advance();
                System.out.print("+ ");
                return true;
            }
            return false;
        }

        // Ooobun → durian {print /} Masimo choco
        if (current().equals("durian")) {
            advance();
            System.out.print("/ ");
            if (Masimo() && current().equals("choco")) {
                advance();
                return true;
            }
            return false;
        }

        return false;
    }

    // Sunshine
    static boolean Sunshine() {

        // Sunshine → vanilla Gardenia {print -}
        if (current().equals("vanilla")) {
            advance();
            if (Gardenia()) {
                System.out.print("- ");
                return true;
            }
            return false;
        }

        // Sunshine → butter
        if (current().equals("butter")) {
            advance();
            return true;
        }

        return false;
    }

    // Suria 
    static boolean Suria() {

        if (current().equals("choco")) {
            advance();
            if (Sunshine()) {
                System.out.print("- ");
                return true;
            }
            return false;
        }

        return true;
    }

    // Masimo
    static boolean Masimo() {

        if (current().equals("pandan")) {
            advance();
            System.out.print("* ");
            return Gardenia();
        }

       
        return true;
    }
}
