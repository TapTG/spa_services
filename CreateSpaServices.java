// Chapter 3 Exercise - 05.11.23, Teri T

import java.util.Scanner;

public class CreateSpaServices
{
	public static void main(String[] args) 
	{
		// Variables and constants
		String service;
		double price;
		Scanner keyboard = new Scanner(System.in);
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();

		// Input phase
		System.out.print("Please enter name of service >>");
		service = keyboard.nextLine();
		System.out.print("Please enter the price of that service >>");
		price = keyboard.nextDouble();
		// Implement out custom SpaService class methods
		firstService.setServiceDescription(service);
		firstService.setPrice(price);
		// keyboard buffer for the Scanner oject
		keyboard.nextLine();
		System.out.print("Next, please enter the name of a second service >>");
		service = keyboard.nextLine();
		System.out.print("Please enter the price of that service >>");
		price = keyboard.nextDouble();
		secondService.setServiceDescription(service);
		secondService.setPrice(price);

		// Output phase
		System.out.println("First service details:");
		System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
		System.out.println("Second service details:");
		System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());

	}	// end of main()
}	// end of class