package com.example.freelancealloserviceouvrier.Entity;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "publication")
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "publicationid")
    private int PublicationId;
    @Column(name = "libelle",length = 150)
    private String Libelle;
    @Column(name = "datepub")
    private Date datePub;
    @Column(name = "description",length = 250)
    private String Description;
    @Column(name = "typedescription",length = 250)
    private String TypeDescription;
    @OneToMany
    private List<ImgPub> imgPubs;

    public int getPublicationId() {
        return PublicationId;
    }

    public void setPublicationId(int publicationId) {
        PublicationId = publicationId;
    }

    public String getLibelle() {
        return Libelle;
    }

    public void setLibelle(String libelle) {
        Libelle = libelle;
    }

    public Date getDatePub() {
        return datePub;
    }

    public void setDatePub(Date datePub) {
        this.datePub = datePub;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTypeDescription() {
        return TypeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        TypeDescription = typeDescription;
    }

    public List<ImgPub> getImgPubs() {
        return imgPubs;
    }

    public void setImgPubs(List<ImgPub> imgPubs) {
        this.imgPubs = imgPubs;
    }
}