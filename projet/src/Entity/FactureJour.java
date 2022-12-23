package Entity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class FactureJour {
Date date;
int id;
List<Commande> coms;
public FactureJour(Date date, int id) {
	super();
	this.date = date;
	this.id = id;
	coms=new ArrayList<Commande>();
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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

}
