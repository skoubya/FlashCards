import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.FileReader;
import java.io.IOException;
public class FlashCards{
	private ArrayList<String[]> card;
	private boolean[] right;
	private int count;
	private int currIndex;

	Scanner in = new Scanner (System.in);
	Random randGen = new Random();

	public FlashCards (ArrayList<String[]> word){
		card = word;
		right = new boolean[card.size()];
		currIndex = 0;
		count = card.size();
	}
	
	public FlashCards (String[][] word){
		card = new ArrayList<String[]>(Arrays.asList(word));
		right = new boolean[card.size()];
		currIndex = 0;
		count = card.size();
	}
	
	public FlashCards (FileReader file){
		card = new ArrayList<String[]>();
		String currStr = "";
		String cardParts[] = {"",""};
		//String cardP2 = "";
		char currChar = 0;
		int readInt = -1;
		boolean isPart1 = true;
		boolean started = false;
		try {while((readInt = file.read()) != -1){
			currChar = (char)readInt;
			switch (currChar){ //TODO: Deal with special chars
				case '"': 	started = !started;
							if (!started){ //because flipped
								if (isPart1){
									cardParts[0] = currStr;
								}
								else{
									cardParts[1] = currStr;
								}
								currStr = "";
								isPart1 = !isPart1;
							}
							break;
				case '\n':	card.add(new String[]{cardParts[0],cardParts[1]});
							cardParts[0] = "";
							cardParts[1] = "";
							break;
				default:	if (started) currStr += currChar;
			}
		}}
		catch (IOException e){
			System.out.println(e.toString());
		}
		if ((cardParts[0] != "") && (cardParts[1] != "")){
			card.add(new String[]{cardParts[0],cardParts[1]});
			cardParts[0] = "";
			cardParts[1] = "";
		}
		right = new boolean[card.size()];
		currIndex = 0;
		count = card.size();
	}

	public boolean allGone (){
		for (int x = 0; x < right.length; x++){
			if (!right[x]){
				return false;
			}
		}
		return true;
	}
	
	public void getNewCard(){
		do{
			currIndex = randGen.nextInt (card.size());
		}
		while (right[currIndex]);
	}
	
	public String getFront(){
		return card.get(currIndex)[0];
	}
	
	public String getBack(){
		return card.get(currIndex)[1];
	}
	
	public int getNumLeft(){
		return count;
	}
	
	public void cardCorrect(){
		right[currIndex] = true;
		count--;
	}

	public void learn (){
		for (int x = 0; x < right.length; x++){
			right[x] = false;
		}

		int choice;

		do{ //catch to make invalid options loop to the right question
			getNewCard();
			System.out.println ("Choose an option:");
			System.out.println ("[1] View term first");
			System.out.println ("[2] View definition first");
			System.out.println ("[3] List all terms and definitions");
			System.out.println ("[4] Number of cards left");
			System.out.println ("[-1] Quit");
			try{
				choice = in.nextInt();
			}
			catch (InputMismatchException e){
				in.nextLine ();
				choice = 999;
			}
			System.out.println ();

			switch (choice){
				case 1: System.out.println (getFront());
				        System.out.println ();
				        System.out.println ("Choose an option:");
				        System.out.println ("[1] Show definition");
				        System.out.println ("[2] Back to main menu");
				        try{
							choice = in.nextInt();
						}
						catch (InputMismatchException e){
							in.nextLine ();
							choice = 999;
						}
				        switch (choice){
				        	case 1: System.out.println ();
				        			System.out.println (getBack());
				        			System.out.println ();
				        			System.out.println ("Choose an option:");
				        			System.out.println ("[1] Take out of deck");
				        			System.out.println ("[2] Keep in deck");
			    					try{
										choice = in.nextInt();
									}
									catch (InputMismatchException e){
										in.nextLine ();
										choice = 999;
									}
				        			switch (choice){
										case 1: cardCorrect();
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
				case 2: System.out.println (getBack());
				        System.out.println ();
				        System.out.println ("Choose an option:");
				        System.out.println ("[1] Show term");
				        System.out.println ("[2] Back to main menu");
			  			try{
							choice = in.nextInt();
						}
						catch (InputMismatchException e){
							in.nextLine ();
							choice = 999;
						}
				        switch (choice){
				        	case 1: System.out.println ();
				        			System.out.println (getFront());
				        			System.out.println ();
				        			System.out.println ("Choose an option:");
				        			System.out.println ("[1] Take out of deck");
				        			System.out.println ("[2] Keep in deck");
									try{
										choice = in.nextInt();
									}
									catch (InputMismatchException e){
										in.nextLine ();
										choice = 999;
									}
				        			switch (choice){
										case 1: cardCorrect();
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
				case 3: for (int r = 0; r < card.size(); r++){
							System.out.println (card.get(r)[0] + "-- " + card.get(r)[1]);
						}
					    break;
				case 4: System.out.println (count);
					    break;
				case -1: System.out.println ("Bye");
					     break;
				default: System.out.println ("Invalid option. Try again.");
					     break;
			}
		}
		while (choice != -1 && !this.allGone ());
	}
}