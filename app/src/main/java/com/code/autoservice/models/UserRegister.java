package com.code.autoservice.models;

public class UserRegister {

    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String Password;

    public UserRegister(String firstName , String lastName , String mobileNumber , String password) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setMobileNumber(mobileNumber);
        setPassword(password);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
