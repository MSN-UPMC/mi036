package hashtable;

import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			ORB orb = ORB.init(args, null);

			org.omg.CORBA.Object rootns = orb.resolve_initial_references("NameService");
			org.omg.CORBA.Object rootpoa = orb.resolve_initial_references("RootPOA");
			NamingContext nc = NamingContextHelper.narrow(rootns);
			POA poa = POAHelper.narrow(rootpoa);
			poa.the_POAManager().activate();

			HashTableITFPOA servant = new HashTableITFPOATie(new HashTableImplTie()); 
			org.omg.CORBA.Object obj = poa.servant_to_reference(servant); 
			
			
			NameComponent[] names =
					new NameComponent[] { new NameComponent("Hash", "") };
			nc.rebind(names, obj);

			
			
			orb.run();

		} catch (AdapterInactive e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidName e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServantNotActive e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WrongPolicy e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CannotProceed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (org.omg.CosNaming.NamingContextPackage.InvalidName e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
