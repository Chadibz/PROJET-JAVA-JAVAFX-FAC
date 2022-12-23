package Entity;
import java.util.*;
public class Commande  {
int num_c;
Date date_com;
double montant;
Table table;

public Commande(int num_c, Date date_com, double montant) {
	super();
	this.num_c = num_c;
	this.date_com = date_com;
	this.montant = montant;
}
public int getNum_c() {
	return num_c;
}
public void setNum_c(int num_c) {
	this.num_c = num_c;
}
public Date getDate_com() {
	return date_com;
}
public void setDate_com(Date date_com) {
	this.date_com = date_com;
}
public double getMontant() {
	return montant;
}
public void setMontant(double montant) {
	this.montant = montant;
}
public void ajouter(Commande element) {
	// TODO Auto-generated method stub
	
}
public void modifier(Commande element) {
	// TODO Auto-generated method stub
	
}
public List<Commande> consulter() {
	// TODO Auto-generated method stub
	return null;
}
public void supprimer(Commande element) {
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
	Commande other = (Commande) obj;
	if (date_com == null) {
		if (other.date_com != null)
			return false;
	} else if (!date_com.equals(other.date_com))
		return false;
	if (Double.doubleToLongBits(montant) != Double.doubleToLongBits(other.montant))
		return false;
	if (num_c != other.num_c)
		return false;
	if (table == null) {
		if (other.table != null)
			return false;
	} else if (!table.equals(other.table))
		return false;
	return true;
}

}
