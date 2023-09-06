package tn.esprit.spring.entities;

import java.io.Serializable;

import java.util.Date;


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

@Table( name = "Remplissage")

public class Remplissage implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private Date date ; 
@ManyToOne
Site sites ; 
@ManyToOne
Produit produits ;
@ManyToOne
Ville villes ;



}