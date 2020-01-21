//Donark Patel
//CSC-236
//Lab 2A
//Application: lock

import java.util.Scanner;

public class LockDemo
{
	public static void main(String [] arg)
	{
		lockMenu();
	}
	public static void lockMenu()
	{
		int x, y, z;
		Scanner kb = new Scanner(System.in);
		Lock newLock = new Lock();

		System.out.println("\nSelect an option for the lock.\n");
		System.out.println("	1 : Set a new lock combination. ");
		System.out.println("	2 : Close the lock.");
		System.out.println("	3 : Attempt to open the lock.");
		System.out.println("	4 : Check lock status.");
		System.out.println("	5 : Check current top number.");
		System.out.println("	6 : Exit the program");

		char menuOption = kb.next().charAt(0);
		menuOption = Character.toUpperCase(menuOption);

		switch(menuOption)
		{
			case '1':
			{
				System.out.println("Set a new combination for the lock.\n");

				System.out.println("Enter the first number of the combination.");
				x = kb.nextInt();
				System.out.println("Enter the second number of the combination.");
				y = kb.nextInt();
				System.out.println("Enter the third number of the combination.");
				z = kb.nextInt();

				newLock.alter(x,y,z);
				lockMenu();
			}
			case '2':
			{
				System.out.println("You are closing the lock");
				newLock.close();
				newLock.inquire(Lock.locked);
				lockMenu();
			}
			case '3':
			{

				System.out.println("Enter the first number of the combination.");
				x = kb.nextInt();
				System.out.println("Enter the second number of the combination.");
				y = kb.nextInt();
				System.out.println("Enter the third number of the combination.");
				z = kb.nextInt();

				newLock.attempt(x,y,z);
				lockMenu();
			}
			case '4':
			{
				newLock.inquire(Lock.locked);
				lockMenu();
			}
			case '5':
			{
				System.out.println("The top number currently is: " + newLock.currently());
				lockMenu();
			}
			case '6':
			{
				System.out.println("Exiting . . . ");
				System.exit(0);
			}
			default:
			{
				System.out.println("\n INVALID SELECTION ");
				System.out.println("Select from 1 to 6");
			}
		}

	}
}