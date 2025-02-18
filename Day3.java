import java.util.Scanner;
public class Day3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String string1=sc.nextLine();
		//String Manipulation
		System.out.println("Case conversion to upper case : "+string1.toUpperCase());
		System.out.println("Case conversion to lower case :"+string1.toLowerCase());
		System.out.println("Size of the string : "+string1.length());
		System.out.println(string1.replace("a", "$"));
		System.out.println("\n");
		//Using StringBuilder for String reversal
		System.out.println("Enter string to check palindrome : ");
		String string2=sc.nextLine();
		StringBuilder sb=new StringBuilder(string2);
		String reverse=sb.reverse().toString();
		System.out.println("Reversed String : "+reverse);
		if(string2.equalsIgnoreCase(reverse)) {
			System.out.println("It's Palindrome");
		}
		else {
			System.out.println("It's not Palindrome");
		}
		System.out.println("\n");
		
		//StringBuffer Operations
		StringBuffer sb1=new StringBuffer("Good");
		System.out.println("Before appending :"+sb1);
		sb1.append(" Morning");
		sb1.append(" Chandu");
		System.out.println("After appending :"+sb1);
		sb1.insert(13,"Dhanush and ");
		System.out.println("After inserting at 13 index :"+sb1);
		System.out.println("\n");
		
		//Type Casting
		int value1 = 7;
		double value2 = value1;
		System.out.println("After converting to double : "+value2);
		double value3 = 36.79;
		int value4 =  (int) value3;
		System.out.println("After converting double to int : "+value4);
		char surname = 'K';
		int toint= (int) surname;
		System.out.println("After converting char to int : "+toint);
		int number = 86;
		char tochar= (char) number;
		System.out.println("After converting int to char : "+tochar);
		System.out.println("\n");
		
		//AutoBoxing and unboxing
		int value5=77;
		Integer value6=value5;
		System.out.println("AutoBoxing value from int to integer : "+value6);
		int value7=value6;
		System.out.println("Unboxing value from integer to int : "+value7);
		String num="456";
		int parsed=Integer.parseInt(num);
		System.out.println("String to Integer : "+parsed);
		Integer roll=768;
		String conv=roll.toString();
		System.out.println("Integer to string : "+conv);
		System.out.println("\n");
		
		//String Comparision
		String str1="Quest";
		String str2="Quest";
		System.out.println("Direct declaration of string1 : "+str1);
		System.out.println("Direct declaration of string2 : "+str2);
		System.out.println("Using == parameter : "+(str1==str2));
		System.out.println("Using equals() parameter : "+str1.equals(str2));
		
		String str3=new String("QuestK2");
		String str4=new String("QuestK2");
		System.out.println("Using new keyword of string3 : "+str3);
		System.out.println("Using new keyword of string4 : "+str4);
		System.out.println("Using == parameter : "+(str3==str4));
		System.out.println("Using equals() parameter : "+str3.equals(str4));
		sc.close();
	}

}
