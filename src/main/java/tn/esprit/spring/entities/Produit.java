package tn.esprit.spring.entities;




import jakarta.persistence.*;
import lombok.*;
import lombok.Data;


@Data
@Builder
@Entity
@AllArgsConstructor 
@NoArgsConstructor

@Table( name = "Produit")

public class Produit   {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nom ;

}


