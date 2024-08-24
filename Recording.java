package com.example.songapp.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Recording {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String filePath;
    
    @ManyToOne
    private User user;

    @ManyToOne
    private Theme theme;
}
