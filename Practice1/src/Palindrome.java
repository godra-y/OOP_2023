import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String s=input.nextLine();
        
        if(isPalindrome(s)){
            System.out.println("It is a palindrome.");
        } 
        else{
            System.out.println("It is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String s){
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left=0;
        int right=s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
	}

}
