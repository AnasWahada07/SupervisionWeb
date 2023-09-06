package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.spring.Service.UtilisateurService;
import tn.esprit.spring.entities.Utilisateur;

@RestController
@CrossOrigin("*")

public class UtilisateurController {
	
	@Autowired
    private  UtilisateurService userService ;
    
    
    @PostMapping("/adduser")
    @ResponseBody
    public void signUp(@RequestBody Utilisateur user  ) {
        userService.addUtilisateur(user.getNom() , user.getEmail() , user.getTelephone() ,
        		user.getMotdepasse(),user.getRole());
        
    }
}





