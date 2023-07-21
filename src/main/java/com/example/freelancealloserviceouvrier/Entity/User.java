package com.example.freelancealloserviceouvrier.Entity;
import jakarta.persistence.*;
import java.io.File;
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userid")
    protected int UserId;
    @Column(name = "nom",length = 150)
    protected String nom;
    @Column(name = "prenom",length = 150)
    protected String prenom;
    @Column(name = "ville",length = 150)
    protected String ville;
    @Column(name = "login",length = 150)
    protected String login;
    @Column(name = "password",length = 30)
    protected String password;
    @Column(name = "photo")
    protected File photo;
    @Column(name = "email",length = 150)
    protected String email;
    @OneToOne
    private Inscription inscription;
    @ManyToOne
    private ImgPub imgPub;
    

    public ImgPub getImgPub() {
        return imgPub;
    }

    public void setImgPub(ImgPub imgPub) {
        this.imgPub = imgPub;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Inscription getInscription() {
        return inscription;
    }

    public void setInscription(Inscription inscription) {
        this.inscription = inscription;
    }
}