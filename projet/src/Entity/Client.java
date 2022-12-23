package Entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import application.Main;

public class Client extends Personne  {
int id_client;
public static FileOutputStream fo;
public static FileInputStream fi;
static ObjectOutputStream os;
public static void init (String nom) 
{
	try {
		
		fi =new FileInputStream(nom);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void init_ecriture (String nom)
{
	try {
		fo = new FileOutputStream(nom);
		os =new ObjectOutputStream(fo);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
}
public Client(String nom, String prenom, int id_client) {
	super(nom, prenom);
	this.id_client = id_client;
	
}

public int getId_client() {
	return id_client;
}

public void setId_client(int id_client) {
	this.id_client = id_client;
}

@Override
public String toString() {
	return "Client [id_client=" + id_client + ", nom=" + nom + ", prenom=" + prenom + "]";
}

public static void ajouter(Client element) throws IOException {

os.writeObject(element);

}

public static void modifier(Client element) {

	List<Client> cs=Client.consulter();

	Iterator<Client> it =cs.iterator();
	int indice;
while (it.hasNext())
{
Client c=it.next();
if (c.equals(element)==true)
{c.setId_client(34);
c.setNom("3");
c.setPrenom("2");
indice=cs.indexOf(c);
cs.remove(indice);
cs.add(indice,c);
}
}
Iterator<Client> it2 =cs.iterator();
Client.init_ecriture("files/client.txt");

 while (it2.hasNext())
 {
 Client c=it2.next();
	try {
	Client.ajouter(c);}
	 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 } 
 }


public static List<Client> consulter()  {
	// TODO Auto-generated method stub
	Client.init("files/client.txt");

	ObjectInputStream is;
List<Client> cs=new ArrayList<Client>();
try {
	is = new ObjectInputStream(fi);
Client c;
do 
{
c= (Client) is.readObject();
if (c!=null)
{cs.add(c);}

}
while (c!=null);
Client.fi.close();

}
catch (IOException | ClassNotFoundException e)
{System.out.println(e.getMessage());

}
return cs;
}

public static void supprimer(Client element) {
	// TODO Auto-generated method stub

	List<Client> cs=Client.consulter();

	Iterator<Client> it =cs.iterator();
	int indice;
while (it.hasNext())
{
Client c=it.next();
if (c.equals(element)==true)
{indice=cs.indexOf(c);
cs.remove(indice);
}
}
Iterator<Client> it2 =cs.iterator();
Client.init_ecriture("files/client.txt");

 while (it2.hasNext())
 {
 Client c=it2.next();
	try {
	Client.ajouter(c);}
	 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 } 
	
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Client other = (Client) obj;
	if (id_client != other.id_client)
		return false;
	return true;
}

}
