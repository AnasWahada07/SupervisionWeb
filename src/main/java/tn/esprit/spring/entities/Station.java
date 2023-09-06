package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Optional;


import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

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


@Table( name = "Station")

public class Station implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String adresse ;
private String contact;
private Double responsableTelephone;
private Double tanknumber; 
@ManyToOne(cascade = CascadeType.ALL)
Ville villes ;




}