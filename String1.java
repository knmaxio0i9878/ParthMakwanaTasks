import java.util.Scanner;
class String1{

	public static void main(String args[]){
	
	// In Java Strings are immutable;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String:");
	String str = sc.nextLine();
	char str1[] = str.toCharArray();
	for(int i=str1.length-3;i<=str1.length-1;i++){
		System.out.println("The String:"+str1[i]);
	}

	// Using substring
	System.out.println("The String:"+str.substring(str.length()-3,str.length()));

	
	}
}

/*

.equalsIgnoreCase
.equals
.charAt
.indexOf
.compareTo  // Write a java program to sort five strings where city name passes from command line.
.substring


*/
