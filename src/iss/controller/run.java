package iss.controller;

import java.util.List;
import java.util.Scanner;

import iss.objects.TODOItem;
import iss.objects.TODOList;

public class run {


	private static TODOList TDL = new TODOList();

	public static void main(String[] args) {
		System.out.println("Welcome to TODO List APP...");

		while(true)
		{
			switch( menu1())
			{
			case 1:
				Add();
				break;
			case 2:
				 Remove();
				break;
			case 3:
				break;
			case 4:
				System.out.println("Exiting....");
				System.exit(0);
				break;
			}
		}


	}

	public static void Add()
	{
		// create a scanner so we can read the command-line input
		Scanner scanner = new Scanner(System.in);

		String Name="";
		while(true)
		{
			System.out.println("Please enter the name:");
			Name = scanner.nextLine();

			if(Name.isEmpty())
				System.out.println("Please enter a name");
			else
				break;
		}

		System.out.println("Please enter Priority:");
		String Priority = scanner.nextLine();

		System.out.println("Please enter Date:");
		String Date = scanner.nextLine();

		TODOItem item = new TODOItem(Name);
		if(!Priority.isEmpty()) item.setPriority(Integer.parseInt(Priority));
		if(!Date.isEmpty()) item.setDate(Date);

		TDL.add(item);
	}

	public static void Remove()
	{
		// create a scanner so we can read the command-line input
		Scanner scanner = new Scanner(System.in);
		String Name="";
		while(true)
		{
			System.out.println("Please enter the name:");
			Name = scanner.nextLine();

			if(Name.isEmpty())
				System.out.println("Please enter a name");
			else if(!TDL.isValid(Name))
				System.out.println("Please enter valid name");
			else
				break;
		}

		TDL.remove(Name);

	}


	public static int menu1()
	{
		// create a scanner so we can read the command-line input
		Scanner scanner = new Scanner(System.in);
		show_list();

		System.out.println("Please select the following:");
		System.out.println("1) Add Item");
		System.out.println("2) Remove Item");
		System.out.println("3) edit Item");
		System.out.println("4) Exit");
		System.out.print("Please select 1,2,3 or 4:");

		int opt = scanner.nextInt();

		if(opt<=0 || opt>4)
		{
			System.out.println("Invalid option! please choose again\n\n\n\n\n");

			menu1();
		}

		return opt;


	}

	public static void show_list()
	{
		System.out.println("___________________");
		System.out.println("Current List:");
		
		List<TODOItem> ls = TDL.retrive();

		for(TODOItem TDI : ls)
			System.out.println(TDI);
	}

}
