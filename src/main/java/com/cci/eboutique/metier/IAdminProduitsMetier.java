package com.cci.eboutique.metier;

import com.cci.eboutique.entities.Produit;
import com.cci.eboutique.metier.InternauteMetier;

public interface IAdminProduitsMetier extends InternauteMetier {
	public Long ajouterProduit(Produit  p, Long idCat);
	public void supprimerProduit(Long idP);
	public void modifierProduit(Produit p); 
}
