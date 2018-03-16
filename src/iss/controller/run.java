package iss.controller;

import java.util.Scanner;

public class run {



	public static void main(String[] args) {
		System.out.println("Welcome to TODO List APP...");


		show_list();
		menu1();


	}


	public static int menu1()
	{
		// create a scanner so we can read the command-line input
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please select the following:");
		System.out.println("1) Add Item");
		System.out.println("2) Remove Item");
		System.out.println("3) edit Item");

		int opt = scanner.nextInt();

		if(opt<=0 || opt>3)
		{
			System.out.println("Invalid option! please choose again");
			menu1();
		}


		return opt;


	}

	public static void show_list()
	{
		System.out.println("Current List:");

	}

}
