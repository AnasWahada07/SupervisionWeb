package tn.esprit.spring.entities;

import java.io.Serializable;
import java.sql.Date;


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

@Table( name = "Alerte")

public class Alerte implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private Date date;
private String text;
@ManyToOne
Station stations ;


}