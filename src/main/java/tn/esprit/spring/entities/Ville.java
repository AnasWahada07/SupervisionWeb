package tn.esprit.spring.entities;

import java.io.Serializable;


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



@Table( name = "Ville ")

public class Ville implements Serializable  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;  

	



}