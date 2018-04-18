package qa.package1;

import java.util.*;
import java.util.HashMap;

public class Service {
	
	
	private HashMap<Integer, Account> hashMap = new HashMap<Integer, Account>();
	
	private static int uniqueID = 1;

	void addCustomer(Account newAccount) {
		
		hashMap.put(uniqueID, newAccount);
		
		//System.out.println(hashMap.size());
		
		for()
		
		
		
		
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

/*
Map<String,Object> map = new HashMap<>();
//You can convert any Object.
String[] value1 = new String[] { "value11", "value12", "value13" };
String[] value2 = new String[] { "value21", "value22", "value23" };
map.put("key1", value1);
map.put("key2", value2);
map.put("key3","string1");
map.put("key4","string2");

String json = new ObjectMapper().writeValueAsString(map);
System.out.println(json);
*/