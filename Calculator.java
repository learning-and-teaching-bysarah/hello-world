import java.util.Scanner;

// 
class Calculator{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int choice;

        do {
            System.out.println(
                    "Please select one  operation from the menu list given below that you want to perform  ");
            System.out.println("-----Menu--------");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("To exit the operation enter 0 ");

            
            System.out.print("Enter the operation you want to perform :");
            choice = obj.nextInt();
	    obj.nextLine();
	    if (choice ==0){
	    	 System.out.println("Exited successfully ");
		 break;
	    }

	    System.out.print("Enter the values of number_1 :");            
	    int number_1 = obj.nextInt();
	    obj.nextLine();
            
            System.out.print("Enter the values of number_2 :");
	    int number_2 = obj.nextInt();
	    obj.nextLine();
            
	    
	    switch (choice) {
		    case 1:
			    System.out.println("Addition of the given  two numbers is " + (number_1 + number_2));
			    break;
		    case 2:
			    if (number_1 > number_2) {
				    System.out.println("Subtraction of the given two numbers is " + (number_1 - number_2));
			    }
			    else {
				    System.out.println("Subtraction of the given two numbers is " + (number_2 - number_1));
			    }
			    break;

		    case 3:
			    System.out.println("Multiplication of the given two numbers is " + (number_1 * number_2));
			    break;
		    case 4:
			    if (number_2 != 0) {
				    System.out.println("Division of the given two numbers is " + (number_1 / number_2));
			    } else {
				    System.out.println("Error : Division by zero is not possible ");
			    }
			    break;

		    default:
			    System.out.println("Select the valid operation between 1 to 4 ");
			    break;
	    }
        } while (choice != 0);
        obj.close();

    }
}
