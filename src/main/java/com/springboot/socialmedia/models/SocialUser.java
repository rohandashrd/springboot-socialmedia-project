package com.springboot.socialmedia.models;

import jakarta.persistence.*;

import javax.sound.sampled.Port;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SocialUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "socialUser")
    private SocialProfile socialProfile;

    @OneToMany
    private List<Post> posts=new ArrayList<Post>();

}
