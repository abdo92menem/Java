
public class Main {

	public static void main(String[] args) {
		
		IDandPasswords idandpasswords = new IDandPasswords(); 
		
		LoginPage login = new LoginPage(idandpasswords.getLoginInfo());

	}

}
