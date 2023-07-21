package com.example.freelancealloserviceouvrier.Entity;
import jakarta.persistence.*;
@Entity
@Table(name = "inscription")
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "publicationid")
    private int publicationid;
    @Column(name = "firstname",length = 150)
    private String FirstName;
    @Column(name = "lastname",length = 150)
    private String LastName;
    @Column(name = "password",length = 30)
    private String password;
    @Column(name = "confirmedpassword",length = 30)
    private String ConfirmedPassword;

    public int getPublicationid() {
        return publicationid;
    }

    public void setPublicationid(int publicationid) {
        this.publicationid = publicationid;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmedPassword() {
        return ConfirmedPassword;
    }

    public void setConfirmedPassword(String confirmedPassword) {
        ConfirmedPassword = confirmedPassword;
    }
}