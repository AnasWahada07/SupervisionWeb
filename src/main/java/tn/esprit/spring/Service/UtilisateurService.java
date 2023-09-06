package tn.esprit.spring.Service;

import java.io.Console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import tn.esprit.spring.Repository.UtilisateurRepository;
import tn.esprit.spring.entities.Utilisateur;

@Service
public class UtilisateurService {
	
	@Autowired
    private  BCryptPasswordEncoder passwordEncoder;

	
	@Autowired
    private  UtilisateurRepository userRepository;
	

	public Utilisateur addUtilisateur(String nom , String email , String telephone ,
			String motdepasse , String role ) {
		
        String encryptedPassword = passwordEncoder.encode(motdepasse);

		Utilisateur utilisateur = new Utilisateur();
		
		utilisateur.setNom(nom);
		utilisateur.setEmail(email);
		utilisateur.setTelephone(telephone);
		utilisateur.setMotdepasse(encryptedPassword);
		utilisateur.setRole(role);
	      return  userRepository.save(utilisateur);
	      
	
		
	}
	
	
	

    public String auth(String email , String motdepasse){
        Utilisateur u = new Utilisateur();
        u.getEmail();
        if(u.getMotdepasse().equals(motdepasse)){
            return u.getRole();
        }
        return "INVALID";
    }

    
}
