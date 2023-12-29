package task1b;

import java.util.Vector;

public class testLibraryItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<LibraryItem> item = new Vector<>();
		
		item.add(new Magazine("The New Yourker", "David Remnick", 1925, 19, 4.99));
		item.add(new Magazine("Reader's Digest", "DeWitt Wallace", 1922, 15, 3.00));
		item.add(new Magazine("National Geographic", "Susan Goldberg", 1888, 14, 3.99));
	    
	    for (LibraryItem i : item) {
	    	System.out.println(i.toString());
	    	i.discountedPrice();
	    	i.magazinesSold();
	    }
	    	
	}

}
