package hashtable;

import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

import Calculatrice.*;


public class Client {

	public static void main(String[] args) throws ServantNotActive, WrongPolicy, InvalidName {
		
		ORB orb = ORB.init(args, null);

		String url = "corbaname::localhost:2506#Hash";
		org.omg.CORBA.Object obj = orb.string_to_object(url);

		org.omg.CORBA.Object rootpoa = orb.resolve_initial_references("RootPOA");
		POA poa = POAHelper.narrow(rootpoa);

		ServeurCalculatricePOATie cal = new ServeurCalculatricePOATie(new ServeurCalculatriceImplTie());
		org.omg.CORBA.Object objCal = poa.servant_to_reference(cal);
		
		HashTableITF serv = HashTableITFHelper.narrow(obj);
		/** utilisation de compte **/
		
		
		
		serv.put("a",objCal);
		System.out.println("Res : " + serv.containKey("a"));

	}

}
