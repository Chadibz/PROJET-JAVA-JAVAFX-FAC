package Entity;

import java.util.ArrayList;
import java.util.List;

public class Serveur extends Personne  {
int id_serveur;
int h_travail;
double montant_h;
List<Table> table_resp;

public Serveur(String nom, String prenom, int id_serveur, int h_travail, double montant_h) {
	super(nom, prenom);
	this.id_serveur = id_serveur;
	this.h_travail = h_travail;
	this.montant_h = montant_h;
	table_resp=new ArrayList<Table>();
}
public int getId_serveur() {
	return id_serveur;
}
public void setId_serveur(int id_serveur) {
	this.id_serveur = id_serveur;
}
public int getH_travail() {
	return h_travail;
}
public void setH_travail(int h_travail) {
	this.h_travail = h_travail;
}
public double getMontant_h() {
	return montant_h;
}
public void setMontant_h(double montant_h) {
	this.montant_h = montant_h;
}
public void ajouter(Serveur element) {
	// TODO Auto-generated method stub
	
}
public void modifier(Serveur element) {
	// TODO Auto-generated method stub
	
}
public List<Serveur> consulter() {
	// TODO Auto-generated method stub
	return null;
}
public void supprimer(Serveur element) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Serveur other = (Serveur) obj;
	if (h_travail != other.h_travail)
		return false;
	if (id_serveur != other.id_serveur)
		return false;
	if (Double.doubleToLongBits(montant_h) != Double.doubleToLongBits(other.montant_h))
		return false;
	if (table_resp == null) {
		if (other.table_resp != null)
			return false;
	} else if (!table_resp.equals(other.table_resp))
		return false;
	return true;
}

}
