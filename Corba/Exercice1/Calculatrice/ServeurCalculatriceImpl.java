package Calculatrice;

import java.io.IOException;

import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;



public class ServeurCalculatriceImpl {

	public static void main(String[] args){

		try {

			ORB orb = ORB.init(args, null);

			org.omg.CORBA.Object rootobj = orb.resolve_initial_references("RootPOA");
			POA poa = POAHelper.narrow(rootobj);
			poa.the_POAManager().activate();

			ServeurCalculatricePOA servant = new ServeurCalculatricePOATie(new ServeurCalculatriceImplTie()); 
			org.omg.CORBA.Object obj = poa.servant_to_reference(servant); 
			
			Tools.saveIOR("compte.ior", orb, obj); 
			
			orb.run();

		} catch (AdapterInactive e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidName e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServantNotActive e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WrongPolicy e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}





	}

}
