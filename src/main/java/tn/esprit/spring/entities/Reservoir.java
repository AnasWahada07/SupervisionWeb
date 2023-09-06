package tn.esprit.spring.entities;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;


import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

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

@Table( name = "Reservoir")

public class Reservoir {
@Id
@GeneratedValue
private Long id;
private String niveau ;
private String min ;
private String max;
@ManyToOne
Station stations; 
@ManyToOne
Produit produits ;

}
