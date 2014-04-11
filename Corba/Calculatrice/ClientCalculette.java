package Calculatrice;

import org.omg.CORBA.ORB;

public class ClientCalculette {
	public static void main(String[] args) {

		ORB orb = ORB.init(args, null);

		String url = "corbaname::localhost:2506#Calc";
		org.omg.CORBA.Object obj = orb.string_to_object(url);

		

		ServeurCalculatrice serv = ServeurCalculatriceHelper.narrow(obj);
		/** utilisation de compte **/
		System.out.println("Add: " + serv.add(1,2));

	}

}
