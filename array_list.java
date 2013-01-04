import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class array_list {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array1= new  ArrayList<String>();
		String elements;
		String ch;
		int i;
		int choice;
		// Scanner input=new Scanner(System.in);

		do{
			Scanner input=new Scanner(System.in); 


			System.out.println("\nMENU\n-----\n1.Addition\n2.Deletion\n3.Size\n4.Sort\n5.Search\n6.Display\n7.Exit\nEnter your choice:");
			choice=input.nextInt(); 

			switch(choice)
			{
			case 1: System.out.println("\nEnter the element:");
			elements=input.next();
			array1.add(elements);										       //add the elements in an arraylist
			break;

			case 2: System.out.println("\nEnter the element:");                
			elements=input.next();					
			array1.remove(elements);               					       //remove the element form arraylist                             
			System.out.println("Elements deleted");
			//    System.out.println("Elements in array is: " +array1);
			break;

			case 3: System.out.println("Size of the array is: " +array1.size());		//print the size of the array
			break;

			case 4:Collections.sort(array1);
			System.out.println("Sorted array is: " +array1);					//sort the element in the arraylist
			break;

			case 5: System.out.println("\nEnter the element:"); 
			elements=input.next();												//search an element in an arraylist
			if( array1.contains(elements))
			{
				System.out.println("Element found in the position: " +array1.indexOf(elements));
			}

			else
			{
				System.out.println("Element not found");
			}//end if

			break;
			case 6:System.out.println("Elements in array is: " +array1);				//display the elements
			break;
			}//end switch
		}while(choice!=7);//end do-while

	}//end main


}//end class
