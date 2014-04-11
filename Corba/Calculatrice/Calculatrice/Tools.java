package Calculatrice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.omg.CORBA.ORB;

public class Tools {

	public  static void saveIOR(String fileName, ORB orb, org.omg.CORBA.Object obj) throws IOException {
		String ior = orb.object_to_string(obj); // représentation sous forme de string de l’ior
		FileWriter fw = new FileWriter(fileName); // un flux de sortie vers un fichier
		fw.write(ior); // rempli avec l’ior
		fw.close(); // et fermé
	}

	 public static org.omg.CORBA.Object restoreIOR(String fileName, ORB orb) throws IOException {
		  // ouverture du flux d’entrée
		  BufferedReader br = new BufferedReader(new FileReader(fileName));
		  String ior = br.readLine(); // récupère l’ior enregistrée dans le fichier
		  br.close(); // ferme le flux
		  return orb.string_to_object(ior); // convertit la chaîne en object CORBA
		}


}
