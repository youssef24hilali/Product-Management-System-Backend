package com.pmso.product_management_system_original.dataaccess.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String description;

    private String image;

    private String slug;

    @Column(name = "date_creation")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dateCreation;

    @Column(name = "date_modification")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dateModification;

    private Boolean supprimer;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
