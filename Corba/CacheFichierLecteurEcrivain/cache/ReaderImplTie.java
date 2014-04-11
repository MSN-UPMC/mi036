package cache;

import java.util.HashMap;

import org.omg.CORBA.StringHolder;

public class ReaderImplTie implements ReaderItfOperations {

	
	public HashMap<String, String> fileNameToFileData;
	public HashMap<String, Boolean> fileNameToIsValid;
	

	public ReaderImplTie() {
		super();
		fileNameToFileData = new HashMap<String, String>();
		fileNameToIsValid = new HashMap<String, Boolean>();
	}

	@Override
	public boolean read(String fileName, StringHolder data) {
		if(fileNameToIsValid.containsKey(fileName) && 
			(fileNameToIsValid.get(fileName)==true)){

			
			return true;
		}
	}

	@Override
	public void fileDataOutOfDate(String fileName) {
		if(fileNameToIsValid.containsKey(fileName)){
			fileNameToIsValid.put(fileName, false);
		}
	}

}
