package adresse.model;

import java.util.List;

public class Abonnee {
private List<Adresse>  adresse;
private List <Contrat> contrat;

public List<Contrat> getContrat() {
	return contrat;
}


public void setContrat(List<Contrat> contrat) {
	this.contrat = contrat;
}


private String nom;
private String prenom;


public List<Adresse> getAdresse() {
	return adresse;
}


public void setAdresse(List<Adresse> adresse) {
	this.adresse = adresse;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getPrenom() {
	return prenom;
}


public void setPrenom(String prenom) {
	this.prenom = prenom;
}


@Override
public String toString() {
	return "Abonnee [adresse=" + adresse + "]";
}
}
