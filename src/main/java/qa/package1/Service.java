package qa.package1;

import java.util.HashMap;

public class Service {
	
	
	private HashMap<Integer, Account> hashMap = new HashMap<Integer, Account>();
	
	private static int uniqueID = 1;

	void addCustomer(Account newAccount) {
		
		hashMap.put(uniqueID, newAccount);
		uniqueID ++;
	}
	
	 public void getAccount(int selectedCustomerID) {
		 
		hashMap.get(selectedCustomerID);
		
		//System.out.println(uniqueID);
	}
	 public void removeAccount(int selectedCustomerID) {
		 
		 hashMap.remove(selectedCustomerID);
	 }
}

chad 
-r 
