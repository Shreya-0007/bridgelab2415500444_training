package com.jdbc.smallproject;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        try {
            IConnection conn = new ConnectionImpl();
            Connection con = conn.createConnection();
            System.out.println("Connection Created Successfully!!!");

            IMenu menu = new Menu(con);
            menu.startMenu();

            con.close();
            System.out.println("Connection Closed!!!");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
