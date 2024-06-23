package com.scm.entities;
import java.util.*;

import jakarta.persistence.*;

import jakarta.persistence.criteria.Fetch;
import lombok.*;

@Entity(name = "user")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {
    @Id
    private String userId;

    @Column(name = "user_name" , nullable = false)
    private  String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Getter
    private String password;


    @Column(length = 1000)
    private String about;

    @Column(length = 1000)
    private  String profilePic;
    private String phoneNumber;

    //info
    private boolean enabled=false;
    private boolean emailVerified = false;
    private boolean phoneVerified=false;


//    SELF , GOOGLE , GITHUB

    private Providers provider = Providers.SELF;
    private  String providerUserId;


    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL , fetch = FetchType.LAZY , orphanRemoval = true)
    private List<Contact> contacts = new ArrayList<>();

    
}
