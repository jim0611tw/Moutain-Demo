package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "Comment")
public class CommentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID", nullable=false, unique=true)
    private Long id;

    @ManyToOne
    @JoinColumn(name="USER", referencedColumnName="ID")
    private UserModel UserModel;

    @ManyToOne
    @JoinColumn(name="POST", referencedColumnName="ID")
    private PostModel PostModel;

    private String Content;
    private Date CreateAt;

}
