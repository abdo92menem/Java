import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	/* Constructor */
	public IDandPasswords() {
		
		loginInfo.put("Abdo", "abdo123");
		loginInfo.put("Amr", "amraa");
		loginInfo.put("mohamed", "moh567");
		
	}
	
	protected HashMap<String, String> getLoginInfo() {
		return loginInfo;
		
	}
}
