package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor 
@NoArgsConstructor

@Table( name = "Site")

public class Site implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String adresse;
private String contact ;
@ManyToOne
Ville villes ; 
@ManyToOne
Produit produits ;


	
}