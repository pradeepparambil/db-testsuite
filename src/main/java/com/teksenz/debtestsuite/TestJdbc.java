package com.teksenz.debtestsuite;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
        String user = "hbstudent";
        String password = "hbstudent";
        try {
            System.out.println("Connecting to DB - " + jdbcUrl);
            Connection connection = DriverManager.getConnection(jdbcUrl,user,password);
            System.out.println("Connection successfull");

        }catch (Exception exc){
            exc.printStackTrace();

        }

    }
}
