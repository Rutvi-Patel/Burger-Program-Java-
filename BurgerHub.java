package BurgerProgram;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BurgerHub {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Burger Hub Operator:");
        int count = 0;
        System.out.println("Type \"1\" to take order, \"2\" to serve customer, \"3\" to display backlog info, otherwise quit");
        String x = scnr.nextLine();
        String name;
        String drink;
        String side;
        Object d;
        Queue start = new Queue();
        while (x.equals("1") | x.equals("2")| x.equals("3")) {
            if (x.equals("1")) {
                System.out.println("Entry name: ");
                name = scnr.nextLine();
                System.out.println("Drink: ");
                drink = scnr.nextLine();
                System.out.println("Side: ");
                side = scnr.nextLine();
                d = new FastFood(name, drink, side);
                start.enqueue(d);
            }
            if (x.equals("2")){
                d = start.dequeue();
                System.out.println("Order "+ d+" served.");
            }
            if (x.equals("3")) {
                    System.out.println("There are " + start.size + " orders waiting.");
            }
                System.out.println("Type \"1\" to take order, \"2\" to serve customer, \"3\" to display backlog info, otherwise quit");
                x = scnr.nextLine();

        }

    }
}
