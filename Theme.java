package com.example.songapp.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
