package com.example.freelancealloserviceouvrier.Entity;
import jakarta.persistence.*;
@Entity
@Table(name = "imgpub")
public class ImgPub {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "imgpubid")
    private int ImgPubId;
    @Column(name = "chemin",length = 50)
    private String chemin;
    @OneToOne
    private Publication publication;

    public int getImgPubId() {
        return ImgPubId;
    }

    public void setImgPubId(int imgPubId) {
        ImgPubId = imgPubId;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }
}