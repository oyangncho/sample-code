//Enter 5 elements of the list 1 : 1 2 3 4 5
//Enter 5 elements of the list 2 : 1 2 3 4 5
//Two lists are strictly identical


//Sample two
//Enter 5 elements of the list 1 : 23 55 31 2 10
//Enter 5 elements of the list 2 : 23 55 3 2 10
//Two list are not strictly identical



//Sample one
//Enter 5 elements of the list 1 : 23 55 31 2 10
//Enter 5 elements of the list 2 : 23 55 31 2 10
//Two lists are strictly identical

	import java.util.Scanner;

	class StrictlyIdentical{

	public static boolean equals(int arr1[], int arr2[]){
	for(int i=0;i<arr1.length;i++){
	if(arr1[i]!=arr2[i]){
	return false;
	}
	}
	return true;
	}
	  
	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	System.out.print("Enter 5 elements of the list 1 : ");
	int l1[] = new int[5];
	int l2[] = new int[5];
	for(int i=0;i<5;i++){
	l1[i] = obj.nextInt();
	}
	System.out.print("Enter 5 elements of the list 2 : ");
	for(int i=0;i<5;i++){
	l2[i] = obj.nextInt();
	}
	boolean ans = equals(l1,l2);
	if(ans){
	System.out.println("Two lists are strictly identical");
	}
	else{
	System.out.println("Two list are not strictly identical");
	}
	}
	}

