package com.exampleProfile.ProfileSet;

public class DataSource {

    private String username;
    private String password;

    public DataSource( String username, String password) {

        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }



    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "DataSource{" +

                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}