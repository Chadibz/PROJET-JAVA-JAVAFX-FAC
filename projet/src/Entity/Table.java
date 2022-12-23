package Entity;

import java.util.List;

public class Table {
private int num_t;
private int nb_place;
public int getNum_t() {
	return num_t;
}
public void setNum_t(int num_t) {
	this.num_t = num_t;
}
public int getNb_place() {
	return nb_place;
}
public void setNb_place(int nb_place) {
	this.nb_place = nb_place;
}
public Table(int num_t, int nb_place) {
	super();
	this.num_t = num_t;
	this.nb_place = nb_place;
}
public void ajouter(Table element) {
	// TODO Auto-generated method stub
	
}
public void modifier(Table element) {
	// TODO Auto-generated method stub
	
}
public List<Table> consulter() {
	// TODO Auto-generated method stub
	return null;
}
public void supprimer(Table element) {
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
	Table other = (Table) obj;
	if (nb_place != other.nb_place)
		return false;
	if (num_t != other.num_t)
		return false;
	return true;
}

}
