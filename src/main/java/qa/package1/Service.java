package qa.package1;

import com.google.gson.Gson;
import java.util.HashMap;

public class Service {

	private HashMap<Integer, Account> hashMap = new HashMap<Integer, Account>();

	private static int uniqueID = 1;

	public void addCustomer(Account newAccount) {

		hashMap.put(uniqueID, newAccount);
		printJsonObject(newAccount);

		uniqueID++;

	}

	public void getAccount(int selectedCustomerID) {

		hashMap.get(selectedCustomerID);

	}

	public void removeAccount(int selectedCustomerID) {

		hashMap.remove(selectedCustomerID);

	}

	public HashMap<Integer, Account> getMap() {

		return hashMap;

	}

	public void printJsonObject(Account newAccount) {

		Gson gson = new Gson();

		System.out.println(gson.toJson(newAccount));

	}

}
