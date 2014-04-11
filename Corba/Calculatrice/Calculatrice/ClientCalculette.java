package Calculatrice;

import java.io.IOException;

import org.omg.CORBA.ORB;

public class ClientCalculette {
	public static void main(String[] args) {

		try {
			ORB orb = ORB.init(args, null);
			org.omg.CORBA.Object obj;
			obj = Tools.restoreIOR("compte.ior", orb);


			ServeurCalculatrice serv = ServeurCalculatriceHelper.narrow(obj);
			/** utilisation de compte **/
			System.out.println("Add: " + serv.add(1,2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
