package com.Student;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.Date;

public class StudentForm extends ActionSupport {
    private int id;
    private String name,gender;
    java.util.Date date=new java.util.Date();
    java.sql.Date sqldate=new java.sql.Date(date.getTime());

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getSqldate() {
        return sqldate;
    }

    public void setSqldate(Date sqldate) {
        this.sqldate = sqldate;
    }

    @Override
    public String execute() throws Exception {
        int i=com.sql.SqlData.Reg(this);
        if (i>0&&i!=0&&date!=null)
        {
            return SUCCESS;
        }
        return ERROR;
    }
}

