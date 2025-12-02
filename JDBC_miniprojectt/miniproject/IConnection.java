package com.jdbc.smallproject;

import java.sql.Connection;
import java.sql.SQLException;

public interface IConnection {
    Connection createConnection() throws ClassNotFoundException, SQLException;
}
