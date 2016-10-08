/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

import java.util.Scanner;

/**
 *
 * @author srodriguez
 */
public class Linked_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String option;
        int number = 0;
        Logic logic = new Logic();
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Choose operation: ");
            System.out.println("[1] Add a numbers");
            System.out.println("[2] Print list");
            System.out.println("[x] Exit");
            System.out.print("Option: ");
            option = reader.nextLine();
            if (option.equals("x")) {
                break;
            } else if (option.equals("1")) {
                System.out.println("\nAdd numbers to the list, press x to return to the main menu: ");
                while (true) {
                    String comp = reader.nextLine();
                    if (comp.equals("x")) {
                        break;
                    } else if (!comp.equals("x")) {
                        if (verifyInputNumber(comp)) {
                            number = Integer.parseInt(comp);
                            if (!logic.containNumber(number)) {
                                logic.addNumber(number);
                            }
                        }
                    }
                }
            } else if (option.equals("2")) {
                System.out.println("");
                logic.printList();
                System.out.println("");
            } else if (!option.equals("1") && !option.equals("x") && !option.equals("2")) {
                System.out.println("\nInvalid option selected.\n");
            }
        }

    }

    public static boolean verifyInputNumber(String comp) {
        try {
            int number = Integer.parseInt(comp);
        } catch (NumberFormatException c) {
            System.out.println("\tOnly numbers cann be added to the list\n");
            return false;
        }
        return true;
    }
}
