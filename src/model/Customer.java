package model;

import java.util.regex.Pattern;

public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private final String emailRegex = "^(.+)@(.+).(.+)$";
    private final Pattern pattern = Pattern.compile(emailRegex);

    public Customer(String firstName, String lastName, String email) {

        if (!pattern.matcher(email).matches()){
          throw new IllegalArgumentException("Error, Invalid email");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName() {
        this.firstName = firstName;

    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName() {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    @Override

    public String toString() {

        return "Name:" + firstName + "Surname:" + lastName + "Email:" + email;
    }


}
