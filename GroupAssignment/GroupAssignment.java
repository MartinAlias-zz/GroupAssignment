/*
 *Programmed By: Martin Horciak, Teague Wingfelder, Justin Sousa
 *Programmed For: Mr.L.Calomeni
 *Course: ICS201
 *Date: Thursday, January 12, 2017.
 *Program Description:	Create an aplication that prompts the user for their name and
 *						then displays a group assignment. The assignment group depends
 *						on the first letter of their last name. A-I is group 1, J-S are
 *						assigned to group 2,T-Z are assigned to group 3.
 */

 import java.util.Scanner; 								//Impportation of the java scanner package

 class GroupAssignment{									//Class decloration w/ opening and closing brace
 	public static void main (String [] args){			//Main method w/ opening and closing brace

 		String firstn;									//String variable decloration
 		String lastn;									//String variable decloration
 		Scanner input = new Scanner(System.in);			//Creation of scanner

 		System.out.print ("Enter your first name: ");	//System output for first name
 		firstn = input.nextLine();						//User input
 		System.out.print ("Enter your last name: ");	//System output for last name
 		lastn = input.nextLine();						//User input
 		input.close();									//Closing scanner

 		/* if and else-if statements grouping the various letters of the lastname*/

 		if ((lastn.compareToIgnoreCase("a") >=0) && (lastn.compareToIgnoreCase ("i") <=0)){			//Comparing lastname letters to groups with else-if statements and if statements
 			System.out.println (firstn + " " + lastn + " go to group 1");		//System out put putting people in group 1
 		}else if ((lastn.compareToIgnoreCase("j") >=0) && (lastn.compareToIgnoreCase ("s") <=0)){
 			System.out.println (firstn + " " + lastn + " go to group 2");		//System out put putting people in group 2
 		}else if ((lastn.compareToIgnoreCase("t") >=0) && (lastn.compareToIgnoreCase ("z") >=0)){
 			System.out.println (firstn + " " + lastn + " go to group 3");		//System out put putting people in group 3
 		}else {
 			System.out.println ("Error: Input a proper answer");				//System output for errors
 		}
 	}
 }