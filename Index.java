// for project - menu choice will invoke another class
import java.util.Scanner;

public class Index{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Select an option (1-13):");
    System.out.println();
    System.out.println("1.  Break");
    System.out.println("2.  Switch");
    System.out.println("3.  Methods");
    System.out.println("4.  Shadowing");
    System.out.println("5.  Overloading");
    System.out.println("6.  First Array");
    System.out.println("7.  Second Array");
    System.out.println("8.  TryCatch");
    System.out.println("9.  EnhancedFor");
    System.out.println("10. SearchStudents");
    System.out.println("11. Converter");
    System.out.println("12. Search");
    System.out.println("13. Exit");

    System.out.println();

    System.out.print("Choice: ");
    int choice = input.nextInt();
    System.out.println();

    switch(choice){
      case 1:
             System.out.println("Break lab");
	     System.out.println();
             Break_Ex2.main(null); //static method call, no instance required.
        break;
      case 2:
             System.out.println("Switch lab");
             System.out.println();
       	     FirstSwitch.main(null);
        break;
      case 3:
	     System.out.println("Methods lab");
             System.out.println();
	     Methods.main(null);
        break;
      case 4:
      	     System.out.println("Shadow lab");
	     System.out.println();
	     Shadow.main(null);
	  break;
      case 5:
	    System.out.println("Overloading lab");
	    System.out.println();
	    Arithmetic.main(null);
	break;
      case 6:
            System.out.println("First Array");
            System.out.println();
	    FirstArray.main(null);
        break;
      case 7:
            System.out.println("Second Array");
            System.out.println();
            SecondArray.main(null);
        break;
      case 8:
	    System.out.println("TryCatch");
	    System.out.println();
	    TryCatch.main(null);
        break;
      case 9:
	    System.out.println("EnhancedFor");
	    System.out.println();
	    EnhancedFor.main(null);
        break;
      case 10:
	    System.out.println("SearchStudents");
	    System.out.println();
	    SearchStudents.main(null);
        break;
      case 11:
	    System.out.println("Converter");
	    System.out.println();
	    Converter.main(null); 
	break;
      case 12:
	    System.out.println("Search");
	    System.out.println();
	    Search.main(null);
	break;
      case 13:
     	    System.out.println("Exiting....");
     	break;
     default:
            System.out.println("Invalid choice");
        break;
    }
    System.out.println();

  }
}
