package edu.kubie.test;
import java.util.*;

public class Collections {

	public static void main(String[] args) {
			
		  // Variables for storing first and last names
		  String firstName;
		  String lastName;
		  String continueQuit;
	      
	      // Queue 
	      // Create variable to hold original queue size
	      Queue<String> queue = new LinkedList<String>();
	      
	      // Add patients to have a few names in the queue
    	  queue.add("Wes Kubie");
    	  queue.add("Craig Kubie");
    	  queue.add("Tiffany Kubie");
    	  queue.add("Cami Kubie");
    	  queue.add("Krystin Kubie");
    	  queue.add("Will Kubie");
    	  queue.add("David Kubie");
    	  queue.add("Joanna Bambo");
    	  queue.add("Mario Bambo");
    	  queue.add("Diana Kubie");
    	  
	      
	      // Create a do while loop to keep asking if they want to enter someone into the queue or quit
    	  Scanner userInput = new Scanner(System.in);
	      do {
	    	  // Get input from user to add a someone to the queue
	    	  
	    	  System.out.println("Enter a first and last name to be entered into the queue.");
	    	  firstName = userInput.next();
	    	  lastName = userInput.nextLine().trim();
		  
	    	  // Take user input and add new patient
	    	  Patient nextPatient = new Patient();
	    	  nextPatient.firstName = firstName;
	    	  nextPatient.lastName = lastName;
	    	  
	    	  
	    	  
	    	  //Print out original list to see the change
	    	  System.out.println("Queue before addition of new patient and removal of the top patient:");
	    	  System.out.println(queue);
	    	  System.out.println('\t');
		  
	    	  // Add patient to queue
	    	  queue.add(nextPatient.firstName + " " + nextPatient.lastName);
	    	  // Then remove the first patient from the queue
	    	  queue.poll();
	    	  // Check results by printing the queue
	    	  System.out.println("Queue after addition of new patient and removal of the top patient:");
	    	  System.out.println(queue);
	    	  System.out.println('\t');
	    	  // Check to see if the user would like to continue to add patients
	    	  System.out.println("To add more patients type continue, otherwise type break to quit");
	    	  continueQuit = userInput.next();
	    	 
	      } while (continueQuit.equals("continue"));
	      
	      
	      
	      
	      // List
	      int number = 0;	      
	      List<Object> list = new ArrayList<Object>(number);
	      
	      // Create a loop to populate the list
	      for(int i = 1; i <= 10; i++){
	    	  number = i;
	    	  list.add(number);
	      }
	      System.out.println("Array List");
	      System.out.println(list);
	      System.out.println('\t');
	      
		  // Map
	      // Create variables for the map
	      String name;
	      int queueNumber;
	      Object[] nameArray = queue.toArray();
	      Object[] numberArray = list.toArray();
	      // Map the numbers in the ArrayList to the names in the queue
	      Map<Object, Object> map = new HashMap<Object, Object>();
	      
	      // Create a loop to put each number with a name
	      for(int i = 0; i <= 9; i++){
	    	  name = (String) nameArray[i];
	    	  queueNumber = (int) numberArray[i];
	    	  map.put(name, queueNumber);
	      }
	      
	      //Print out the map list
	      System.out.println("Map");
	      System.out.println(map);
	      System.out.println('\t');
		  
		  // Set
	      // Put all list numbers into a set list 
	      Set<Integer> setList = new HashSet<Integer>();
	      // Loop to populate setList
	      for(int i = 0; i <= 9; i++){
	    	  setList.add((Integer) numberArray[i]);
	      }
	      System.out.println("Set");
	      System.out.println(setList);
	      System.out.println('\t');
	      
	      // Create variable to break loop
	      String exitLoop;
	      
	      // Ask for user Input
	      System.out.println("Enter a number (If you enter a number that is already in the list, it will not be added)");
    	  Scanner numberScanner = new Scanner(System.in);

    	  Scanner breakLoop = new Scanner(System.in);
	      do {
	    	  // Variables for setList
	    	  int userNumber;
	    	  // Show that when if the same number is put into the list, it does not work	      
	    	  
	    	  userNumber = numberScanner.nextInt();
	    	  setList.add(userNumber);
	    	  
	    	  System.out.println("If you entered a number that was not in the list it will show up below");
	    	  System.out.println(setList);
	    	  System.out.println('\t');
	    	  
	    	  System.out.println("To add another number, type add, otherwise type b to break");
	    	  exitLoop = breakLoop.next();
	    	 
	      } while(exitLoop.equals("add"));
	      
	     
	      
	      // Tree
	      // Show that a TreeSet will sort numbers 
	      // Create an array with random numbers
	      int[] numArray = new int[10];
	      for(int i = 0; i <= 9; i++){
	    	  int num = (int)(Math.random() * 100) + 1;
	    	  numArray[i] = num;
	      }

    	  System.out.println('\t');
    	  System.out.println("List not sorted");
    	  
    	  Set<Integer> set = new HashSet<Integer>();
    	    	 	      
	      for (int i = 0; i < numArray.length; i++){
	    	  System.out.print(numArray[i] + ", ");
	    	  set.add(numArray[i]);
	      }
	      TreeSet<Integer> sortedList = new TreeSet<Integer>(set);
    	  System.out.println('\t');
	      System.out.println("Tree");
    	  System.out.println("List sorted");
	      System.out.println(sortedList);
	      
	      // Close all scanners
	      userInput.close();
	      numberScanner.close();
	      breakLoop.close();
	}

}
