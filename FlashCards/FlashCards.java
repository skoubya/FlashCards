import java.util.Scanner;
import java.util.Random;
public class FlashCards
{
	private String[][] card;
	private boolean[] right;
	private int count;

	Scanner in = new Scanner (System.in);
	Random randGen = new Random();

	public FlashCards (String[][] word)
	{
		card = word;
		right = new boolean[card.length];
	}

	public boolean allGone ()
	{
		for (int x = 0; x < right.length; x++)
		{
			if (!right[x])
			{
				return false;
			}
		}
		return true;
	}

	public void learn ()
	{
		for (int x = 0; x < right.length; x++)
		{
			right[x] = false;
		}

		int choice;
		int choiceShow;
		int choiceRight;

		do
		{
			int index;
			do
			{
				index = randGen.nextInt (card.length);
			}
			while (right[index]);
			System.out.println ("Choose an option:");
			System.out.println ("[1] View term first");
			System.out.println ("[2] View definition first");
			System.out.println ("[3] List all terms and definitions");
			System.out.println ("[4] Number of cards left");
			System.out.println ("[-1] Quit");
			choice = in.nextInt();
			System.out.println ();

			switch (choice)
			{
				case 1: System.out.println (card[index][0]);
				        System.out.println ();
				        System.out.println ("Choose an option:");
				        System.out.println ("[1] Show definition");
				        System.out.println ("[2] Back to main menu");
				        choiceShow = in.nextInt();
				        switch (choiceShow)
				        {
				        	case 1: System.out.println ();
				        			System.out.println (card[index][1]);
				        			System.out.println ();
				        			System.out.println ("Choose an option:");
				        			System.out.println ("[1] Take out of deck");
				        			System.out.println ("[2] Keep in deck");
				        			choiceRight = in.nextInt ();
				        			switch (choiceRight)
				        			{
										case 1: right[index] = true;
												break;
										case 2: break;
										default: System.out.println ("Invalid option. Try again.");
												 break;
									}
				        	        break;
				        	case 2: break;
				        	default: System.out.println ("Invalid option. Try again.");
				        	         break;
						}
					    break;
				case 2: System.out.println (card[index][1]);
				        System.out.println ();
				        System.out.println ("Choose an option:");
				        System.out.println ("[1] Show term");
				        System.out.println ("[2] Back to main menu");
				        choiceShow = in.nextInt();
				        switch (choiceShow)
				        {
				        	case 1: System.out.println ();
				        			System.out.println (card[index][0]);
				        			System.out.println ();
				        			System.out.println ("Choose an option:");
				        			System.out.println ("[1] Take out of deck");
				        			System.out.println ("[2] Keep in deck");
				        			choiceRight = in.nextInt ();
				        			switch (choiceRight)
				        			{
										case 1: right[index] = true;
												break;
										case 2: break;
										default: System.out.println ("Invalid option. Try again.");
												 break;
									}
				        	        break;
				        	case 2: break;
				        	default: System.out.println ("Invalid option. Try again.");
				        	         break;
						}
					    break;
				case 3: for (int r = 0; r < card.length; r++)
						{
							System.out.println (card[r][0] + "-- " + card[r][1]);
						}
					    break;
				case 4: count = 0;
						for (int r = 0; r < card.length; r++)
						{
							if (!right[r])
							{
								count++;
							}
						}
						System.out.println (count);
					    break;
				case -1: System.out.println ("Bye");
					     break;
				default: System.out.println ("Invalid option. Try again.");
					     break;
			}
			System.out.println ();
		}
		while (choice != -1 && !this.allGone ());
	}
}