package tn.esprit.spring.entities;

import java.io.Serializable;


import java.net.PasswordAuthentication;
import java.util.Set;

import jakarta.persistence.*;
import org.springframework.core.serializer.Deserializer;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor 
@NoArgsConstructor

@Table( name = "Utilisateur")

public class Utilisateur implements Serializable {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String Nom ; 
private String email ;
private String telephone;
private String motdepasse;
private String role ;
@ManyToMany
private Set<Produit> produits ; 
@ManyToMany
private Set<Remplissage> remplissages;
@ManyToMany
private Set<Alimentation> alimentations;
@ManyToMany
private Set<Ville> villess;
@ManyToMany
private Set<Site> sites;




}