import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/* Deserialization = The reverse process of converting byte stream into an object
								
		 *  			   Steps to Deserialize
		 *  			   -------------------------------------------------------------	
		 *  			   1. Declare your object without instantiate
		 *  			   2. Your object class should implement Serializable interface
		 *  			   3. add import java.io.Serializable;
		 *  			   4. FileInputStream fileIn = new FileInputStream(file path)
		 *  			   5. ObjectInputStream in = new ObjectInputStream(fileIn)
		 *  			   6. objectName = (Class) in.readObject();
		 *  			   7. in.close(); fileIn.close;							
					
		*/
		
		User user = null;
		
		FileInputStream fileIn = new FileInputStream("C:/Users/mmmm/eclipse-workspace/Serialization/UserInfo.ser");
		
		ObjectInput in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		
		user.sayHello();
	}

}
