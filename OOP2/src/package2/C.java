package package2;
import package1.*;

public class C {
	
	// This default modifier is accessed through files of the same package 
	String defaultMessage = "This is default";
	
	// Protected Modifier accessed through files of the extended classes only
	protected String protectedMessage = "This is Protected";
	
	// Public Modifier accessed through files of the same project
	public String publicMessage = "This is public";
	
	// Private Modifier accessed through the container class only
	private String privateMessage = "This is Private";


}
