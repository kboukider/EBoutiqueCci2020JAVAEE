package com.cci.eboutique.metier;

import com.cci.eboutique.entities.Categorie;
import com.cci.eboutique.entities.Role;
import com.cci.eboutique.entities.User;

public interface IAdminCategoriesMetier extends IAdminProduitsMetier {
	public Long ajouterCategorie(Categorie c);
	public void supprimerCategrorie(Long idcat);
	public void modifierCategorie(Categorie c);
	public void ajouterUser(User u);
	public void attribuerRole(Role r,Long userID);
}