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

@Table( name = "Alimentation")

public class Alimentation implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String responsable ; 
private Date  date ;
private Double quantiteLitre;
@ManyToOne
Ville villes ;
@ManyToOne
Site sites ;
@ManyToOne
Produit produits ;
@ManyToOne
Reservoir reservoirs; 




}