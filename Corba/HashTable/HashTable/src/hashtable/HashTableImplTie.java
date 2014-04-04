package hashtable;

import java.util.Hashtable;

import org.omg.CORBA.Object;

public class HashTableImplTie implements HashTableITFOperations {

	private Hashtable<String, org.omg.CORBA.Object> hash = new Hashtable<>();
	
	public HashTableImplTie() {
		super();
	}

	@Override
	public boolean containKey(String key) {
		// TODO Auto-generated method stub
		return hash.contains(key);
	}

	@Override
	public Object get(String key) {
		// TODO Auto-generated method stub
		return hash.get(key);
	}

	@Override
	public boolean put(String key, Object o) {
		// TODO Auto-generated method stub
		System.out.println("debil");
		return (hash.put(key, o)==null) ;
	}

}
