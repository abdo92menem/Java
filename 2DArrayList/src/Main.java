import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// 2D ArrayList
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		//declare 1D ArrayList 
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		// Iterate through arrayList
//		for (String i : bakeryList) {
//			System.out.println(i);
//		}
		
		//declare 1D ArrayList 
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers"); 
		
		// Iterate through arrayList
//		for (String i : produceList) {
//			System.out.println(i);
//		}
//		
		//declare 1D ArrayList 
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		// Iterate through arrayList
//		for (String i : drinksList) {
//			System.out.println(i);
//		}
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		// Iterate through 2D arrayList
		for (ArrayList<String> i : groceryList) {
			System.out.println(i);
		}
		
		//System.out.println(groceryList);
		//System.out.println(groceryList.get(0).get(0));
		
	}
}
