import java.util.Scanner;
public class DataTypes {

	public static void main(String[] args) {
		//Data Types
		byte a=1;
		int a1=2;
		short a2=3;
		long a3=1234;
		double a4=12345678;
		char a5='a';
		float a6=7;
		System.out.println("byte value :"+a);
		System.out.println("int value :"+a1);
		System.out.println("short value :"+a2);
		System.out.println("long value :"+a3);
		System.out.println("double value :"+a4);
		System.out.println("char value :"+a5);
		System.out.println("float value :"+a6+"\n");
		
		//Array Operations
		int[] arr= {1,2,3,4,5};
		System.out.println("value in 1st index :"+arr[1]);
		arr[2]=7;//change array element
		System.out.println("After changing 3rd element :"+arr[2]);
		int d=arr.length;//length of array
		System.out.println("length of the array : " +d);
		for(int i=0;i<=d;i++) {
			System.out.println("array elements :" +i);//print data in array
		}
		System.out.println("\n");
		System.out.println("Elements in multi dimensional array");
		int[][] arr2= {{1,2,3},{4,5,6}};
		for(int j=0;j<arr2.length;j++) {
			for(int k=0;k<arr2[j].length;k++) {
				System.out.println(arr2[j][k]);
			}
		}
		System.out.println("\n");
		
		//Type Casting
		int f=7;
		double g=f; //Automatic casting
		System.out.println("Before type casting :"+f);
		System.out.println("After type casting :"+g);
		
		double h=9.78d;
		int i=(int) h; //Manual casting
		System.out.println("Before type casting manually :"+h);
		System.out.println("After type casting manually :"+i);
		System.out.println("\n");
		//String Concatenation
		String l="Chandra";
		String m="Shekar";
		System.out.println(l+" "+m); //using + operator
		
		String o="Durga";
		String p=" Dhanush";
		System.out.println(o.concat(p)); //using concat() method
		System.out.println("\n");
		
		
		
		//Taking user input
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string :");
		String c=sc.nextLine();
		System.out.println(c);
				
		System.out.println("enter number :");
		int b=sc.nextInt();
		System.out.println(b);
		sc.close();

	}

}
