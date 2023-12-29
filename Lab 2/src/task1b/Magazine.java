package task1b;

public class Magazine extends LibraryItem{
	int issueNumber;
	double price;
	static int numOfMagazinesSold = 1;
	
	public Magazine(String title, String author, int publicationYear, int issueNumber, double price) {
		super(title, author, publicationYear);
		this.issueNumber = issueNumber;
		this.price = price;
	}
	
	public void discountedPrice() {
		double discPrice = price - (price * 0.25);
		System.out.println("Magazine price with 25% discount: " + discPrice + " $");
	}
	
	public void magazinesSold() {
		System.out.println("Number of magazines sold: " + numOfMagazinesSold++);
	}
	
	public String toString() {
		return "Title: " + title + "\nAuthor: " + author + "\nPulication year: " + publicationYear + "\nIssue number: " + issueNumber + "\nPrice: "
 + price + " $";}
}
