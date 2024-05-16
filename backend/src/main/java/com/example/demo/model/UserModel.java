package com.example.demo.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "USER")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="UserID", nullable=false, unique=true)
    private long UserId;

    @Column(name="UserName", nullable=false)
    private String UserName;

    @Column(name="Email", nullable=false)
    private String Email;

    @Column(name="Password", nullable=false)
    private String Password;

    @Column(name="Biography", nullable=false)
    private String Biography;
}
