package com.example.edlyas.myapplication;

import java.io.Serializable;

public class student implements Serializable {
    private String fname;

    public String getFname() {
        return fname;
    }

    public String getSname() {
        return sname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public student(String fname, String sname) {

        this.fname = fname;
        this.sname = sname;
    }

    private String sname;

}
