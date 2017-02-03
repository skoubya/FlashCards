public class CourtCasesCh5
{
	public static void main (String[] args)
	{
		String [][] card = {{"Dred Sccott v. Sanford", ""},
							{"Civil Rights Cases", ""},
							{"Plessy v. Ferguson", ""},
							{"Sweatt v. Painter", ""},
							{"Brown v. Board of Education", ""},
							{"Brown v. Board of Education 2", ""},
							{"Alexander v. Holmes County Board of Education", ""},
							{"Swan v. Charlotte Mecklenburg County Schools", ""},
							{"Guinn v. US", ""},
							{"Harper v. VA Board of Elections", ""},
							{"Smith v. Allwright", ""},
							{"Shaw v. Reno", ""},
							{"Santa Clara Pueblo v. Martinez", ""},
							{"Hernandez v. TX", ""},
							{"Korematsu v. US", ""},
							{"Muller v. Oregon", ""},
							{"Reed v. Reed", ""},
							{"Craig v Boren", ""},
							{"Dothard v. Rawlinson", ""},
							{"US v. VA", ""},
							{"Meritor Savings Bank v, Vinson", ""},
							{"Bowers v. Hardwick", ""},
							{"Boy Scouts of America v. Dale", ""},
							{"Lawrence v. TX", ""},
							{"Regents of the University of CA v Bakke", ""},
							{"Adarand Constructors v. Pena", ""},
							{"Grutter v. Bollinger", ""},
							{"Gratz v. Bollinger", ""}};

		FlashCards gov = new FlashCards (card);
		gov.learn ();
	}
}