package com.example.mvvm.model;

public class login {
    private  String email;
    private  String pass;
    private String sdt;
    private  String tenkhach;

    public login(String email, String pass, String sdt, String tenkhach) {
        this.email = email;
        this.pass = pass;
        this.sdt = sdt;
        this.tenkhach = tenkhach;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTenkhach() {
        return tenkhach;
    }

    public void setTenkhach(String tenkhach) {
        this.tenkhach = tenkhach;
    }
}
