package Entity;

import java.util.List;

public class Plat  {
private int id_plat;
private String nom_plat;
private double prix;
private Type type;
public Plat(int id_plat, String nom_plat, double prix, Type type) {
	super();
	this.id_plat = id_plat;
	this.nom_plat = nom_plat;
	this.prix = prix;
	this.type = type;
}
public int getId_plat() {
	return id_plat;
}
public void setId_plat(int id_plat) {
	this.id_plat = id_plat;
}
public String getNom_plat() {
	return nom_plat;
}
public void setNom_plat(String nom_plat) {
	this.nom_plat = nom_plat;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public Type getType() {
	return type;
}
public void setType(Type type) {
	this.type = type;
}

public void ajouter(Plat element) {
	// TODO Auto-generated method stub
	
}
public void modifier(Plat element) {
	// TODO Auto-generated method stub
	
}
public List<Plat> consulter() {
	// TODO Auto-generated method stub
	return null;
}
public void supprimer(Plat element) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Plat other = (Plat) obj;
	if (id_plat != other.id_plat)
		return false;
	if (nom_plat == null) {
		if (other.nom_plat != null)
			return false;
	} else if (!nom_plat.equals(other.nom_plat))
		return false;
	if (Double.doubleToLongBits(prix) != Double.doubleToLongBits(other.prix))
		return false;
	if (type != other.type)
		return false;
	return true;
}

}
