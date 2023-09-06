package tn.esprit.spring.Repository;

import org.hibernate.mapping.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional;
import tn.esprit.spring.entities.Produit;
import tn.esprit.spring.entities.Reservoir;

@Repository
public interface ReservoirRepository extends JpaRepository<Reservoir, Long> { 
	
	

	
	
}
