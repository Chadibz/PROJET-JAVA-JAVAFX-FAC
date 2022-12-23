package Entity;

import java.io.Serializable;

public abstract class Personne implements Serializable  {
private static final long serialVersionUID = 6845207379535844575L;
protected String nom;
protected String prenom;
Personne()
{}
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
	return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
}
public Personne(String nom, String prenom) {
	super();
	this.nom = nom;
	this.prenom = prenom;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Personne other = (Personne) obj;
	if (nom == null) {
		if (other.nom != null)
			return false;
	} else if (!nom.equals(other.nom))
		return false;
	if (prenom == null) {
		if (other.prenom != null)
			return false;
	} else if (!prenom.equals(other.prenom))
		return false;
	return true;
}


}
