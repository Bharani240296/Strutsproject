package com.sql;

import com.Student.StudentForm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SqlData {
    static String url="jdbc:postgresql://localhost:5432/student";
    static String user="postgres";
    static String password="admin";
    public static int Reg(StudentForm form)
    {
        int status=0;
        try {
            Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection(url,user,password);
            String query="Insert into studData values(?,?,?,?)";
            PreparedStatement ps= con.prepareStatement(query);
            ps.setInt(1,form.getId());
            ps.setString(2,form.getName());
            ps.setString(3,form.getGender());
            ps.setDate(4,form.getSqldate());
            status= ps.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }
}
