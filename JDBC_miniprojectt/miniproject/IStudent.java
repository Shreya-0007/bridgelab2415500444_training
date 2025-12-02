package com.jdbc.smallproject;

import java.sql.SQLException;
import java.util.Scanner;

public interface IStudent {
    void createtable() throws SQLException;
    void insert(Scanner sc) throws SQLException;
    void insertMultiple(Scanner sc) throws SQLException;
    void update(Scanner sc) throws SQLException;
    void updateMultiple(Scanner sc) throws SQLException;
    void delete(Scanner sc) throws SQLException;
    void deleteMultiple(Scanner sc) throws SQLException;
    void show() throws SQLException;
}
