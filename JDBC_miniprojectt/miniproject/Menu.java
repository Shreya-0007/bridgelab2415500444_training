package com.jdbc.smallproject;

import java.sql.Connection;
import java.util.Scanner;

public class Menu implements IMenu {

    private StudentImpl student;

    public Menu(Connection con) {
        this.student = new StudentImpl(con);
    }

    public void startMenu() {
        try {
            Scanner sc = new Scanner(System.in);
            int user_choice;

            student.createtable();

            while (true) {
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
                System.out.println();
                System.out.println("----------Welcome to Student Database Menu-----------");
                System.out.println();
                System.out.println("1-> Insert Student Details");
                System.out.println("2-> Insert Multiple Student Details");
                System.out.println("3-> Update Student Details");
                System.out.println("4-> Update Multiple Student Details:");
                System.out.println("5-> Delete Student Records");
                System.out.println("6-> Delete Multiple Student Records");
                System.out.println("7-> Show student details");
                System.out.println("8-> Exit from Menu");
                System.out.println();
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

                System.out.print("Enter your choice (from 1 to 8): ");
                user_choice = sc.nextInt();
                sc.nextLine();

                if (user_choice == 1)
                    student.insert(sc);
                else if (user_choice == 2)
                    student.insertMultiple(sc);
                else if (user_choice == 3)
                    student.update(sc);
                else if (user_choice == 4)
                    student.updateMultiple(sc);
                else if (user_choice == 5)
                    student.delete(sc);
                else if (user_choice == 6)
                    student.deleteMultiple(sc);
                else if (user_choice == 7)
                    student.show();
                else if (user_choice == 8) {
                    System.out.println("Thanks for Coming!!!");
                    break;
                } else {
                    System.out.println("Please enter Valid Value according to the Menu!!!");
                }
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
