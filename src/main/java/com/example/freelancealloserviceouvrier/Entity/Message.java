package com.example.freelancealloserviceouvrier.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "messageid")
    private int MessageId;
}