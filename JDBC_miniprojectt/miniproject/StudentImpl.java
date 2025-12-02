package com.jdbc.smallproject;

import java.sql.*;
import java.util.Scanner;

public class StudentImpl implements IStudent {

    private Connection con;

    public StudentImpl(Connection con) {
        this.con = con;
    }

    public void createtable() throws SQLException {
        String query = "CREATE TABLE IF NOT EXISTS student ("
                + " id INT AUTO_INCREMENT PRIMARY KEY,"
                + " enrollment_id BIGINT UNIQUE, "
                + " name VARCHAR(100) NOT NULL,"
                + " age INT,"
                + " email VARCHAR(100),"
                + " enrolled_date DATE, "
                + " course VARCHAR(20)"
                + ");";

        Statement stmt = con.createStatement();
        stmt.executeUpdate(query);
        stmt.close();

        System.out.println("Table Created!!!");
        System.out.println();
    }

    public void insert(Scanner sc) throws SQLException {
        String query = "insert into student(enrollment_id,name,age,email,enrolled_date,course) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(query);

        System.out.print("Enter Enrollment ID: ");
        long enrollment_Id = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Enrolled Date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        stmt.setLong(1, enrollment_Id);
        stmt.setString(2, name);
        stmt.setInt(3, age);
        stmt.setString(4, email);
        stmt.setDate(5, Date.valueOf(date));
        stmt.setString(6, course);

        stmt.executeUpdate();
        stmt.close();

        System.out.println("Record inserted successfully!!!");
        System.out.println();
    }

    public void insertMultiple(Scanner sc) throws SQLException {
        System.out.println();
        System.out.print("Enter number of students to insert: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for student " + i);
            insert(sc);
        }
        System.out.println();
    }

    public void update(Scanner sc) throws SQLException {
        System.out.println();
        String query = "update student SET name=?, age=?, email=?, course=? WHERE enrollment_id=?";
        PreparedStatement stmt = con.prepareStatement(query);

        System.out.print("Enter Enrollment ID to update: ");
        long enrollId = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter New Name: ");
        String name = sc.nextLine();

        System.out.print("Enter New Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter New Email: ");
        String email = sc.nextLine();

        System.out.print("Enter New Course: ");
        String course = sc.nextLine();

        stmt.setString(1, name);
        stmt.setInt(2, age);
        stmt.setString(3, email);
        stmt.setString(4, course);
        stmt.setLong(5, enrollId);

        int rows = stmt.executeUpdate();
        if (rows > 0) {
            System.out.println("Record updated successfully");
        } else {
            System.out.println("Enrollment ID not found");
        }

        stmt.close();
        System.out.println();
    }

    public void updateMultiple(Scanner sc) throws SQLException {
        System.out.println();
        System.out.println("Enter number of students for updating details:");
        int update_number_students = sc.nextInt();

        for (int i = 0; i < update_number_students; i++) {
            update(sc);
        }
        System.out.println();
    }

    public void delete(Scanner sc) throws SQLException {
        String query = "delete from student where enrollment_id=?";
        PreparedStatement stmt = con.prepareStatement(query);

        System.out.println();
        System.out.print("Enter Enrollment ID to delete: ");
        long enrollId = sc.nextLong();
        sc.nextLine();

        stmt.setLong(1, enrollId);
        int rows = stmt.executeUpdate();

        if (rows > 0)
            System.out.println("Record deleted successfully");
        else
            System.out.println("Enrollment ID not found");

        System.out.println();
        stmt.close();
    }

    public void deleteMultiple(Scanner sc) throws SQLException {
        System.out.println();
        System.out.println("Enter number of Students whose details you want to delete:");
        int delete_number_students = sc.nextInt();

        for (int i = 0; i < delete_number_students; i++) {
            delete(sc);
        }
    }

    public void show() throws SQLException {
        String query = "SELECT * FROM student";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        System.out.println();
        System.out.println("------------------------------------------------------------- STUDENT TABLE -------------------------------------------------------------");
        System.out.printf("%-5s | %-15s | %-20s | %-5s | %-25s | %-15s | %-15s%n",
                "ID", "Enrollment_ID", "Name", "Age", "Email", "Date", "Course");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

        while (rs.next()) {
            System.out.printf("%-5d | %-15d | %-20s | %-5d | %-25s | %-15s | %-15s%n",
                    rs.getInt("id"),
                    rs.getLong("enrollment_id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("email"),
                    rs.getDate("enrolled_date"),
                    rs.getString("course"));
        }

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
