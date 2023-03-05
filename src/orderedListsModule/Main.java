package orderedListsModule;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Console app to test the efficiency of the lists according to their optimizations

		QuickPushOrderedIntegerList intListPush = new QuickPushOrderedIntegerList();
		QuickPopOrderedIntegerList intListPop = new QuickPopOrderedIntegerList();
		
		System.out.println("We will test the performance of the PUSH and POP operations for both of the optimized lists.");		
		System.out.println("There are no elements in the lists, so let's start with a few PUSH operations.\n");
		
        Scanner scanner = new Scanner(System.in);
        String input = "";

		while(!input.equals("ABORT")) {
			
			System.out.println("If you want to push a number, please type it and press enter.");
			
			System.out.println("If you want to pop a number, please type POP and press enter.");
			
			System.out.println("If you want to stop the execution of the program, type ABORT.\n");
			
			input = scanner.nextLine();
			
			if(input.toUpperCase().equals("POP")) {
		        // Pop in Push optimized
				long startTimePop_PushList = System.nanoTime();
				intListPush.pop();
		        long elapsedTimePop_PushList = System.nanoTime() - startTimePop_PushList; 
		        System.out.println("Total execution time for POP in Push optimized list " + elapsedTimePop_PushList);
		        
		        // Pop in Pop optimized
		        long startTimePop_PopList = System.nanoTime();
		        intListPop.pop();
		        long elapsedTimePop_PopList = System.nanoTime() - startTimePop_PopList;
		        System.out.println("Total execution time for POP in Pop optimized list " + elapsedTimePop_PopList + "\n");
		        
		        System.out.println("Push optimized list content:");
	            intListPush.displayList();
	            System.out.println("Pop optimized list content:");
	            intListPop.displayList();
	            
	            System.out.println();
		        
			} else if (!input.equals("ABORT")) {
		        try {
		            Integer numberToPush = Integer.parseInt(input);
		            System.out.println("Pushing the integer " + numberToPush);
		            
		            // Push in Push optimized
		            long startTimePush_PushList = System.nanoTime();
		    		intListPush.push(numberToPush);
		            long elapsedTimePush_PushList = System.nanoTime() - startTimePush_PushList;
		            System.out.println("Total execution time for PUSH in Push optimized list " + elapsedTimePush_PushList);
		            
		            // Push in Pop optimized
		            long startTimePush_PopList = System.nanoTime();
		    		intListPop.push(numberToPush);
		            long elapsedTimePush_PopList = System.nanoTime() - startTimePush_PopList;
		            System.out.println("Total execution time for PUSH in Pop optimized list " + elapsedTimePush_PopList + "\n");
		            
		            System.out.println("Push optimized list content:");
		            intListPush.displayList();
		            System.out.println("Pop optimized list content:");
		            intListPop.displayList();
		            
		            System.out.println();
		            
		        } catch (NumberFormatException e) {
		            System.out.println("Invalid input: " + input + " is not an integer. Please type a valid number, POP or ABORT");
		        }
			}
		}
		System.out.println("Program terminated by user");	
		scanner.close();
	}
}
