public class CourtCasesCh4
{
	public static void main (String[] args)
	{
		String [][] card = {{"Barron v. Baltimore", ""},
							{"Schenck v. US", ""},
							{"Gitlow v. NY", ""},
							{"Lemon v. Kurtzman", ""},
							{"Everson v Board of Ed.", ""},
							{"Engles v. Vitale", ""},
							{"Wisconson v. Yoder", ""},
							{"Reynold v. US", ""},
							{"Lukumi Babalu Aye, Inc. v City of Hialeah", ""},
							{"Near v Minnesota", ""},
							{"Hazelwood v. Kuhlmeier", ""},
							{"Dennis v. US", ""},
							{"Yates v US", ""},
							{"Brandenburg v. OH", ""},
							{"Roth v US", ""},
							{"Miller v CA", ""},
							{"NY Times v Sullivan", ""},
							{"Hustler Magazine v Falwell", ""},
							{"Tinker v Des Moines", ""},
							{"TX v Johnson", ""},
							{"US v O'Brien", ""},
							{"Buckley v Valeo", ""},
							{"Citizens United v Federal Elections Commission", ""},
							{"Snyder v Phelps", ""},
							{"DC v Heller", ""},
							{"McDonald v Chicago", ""},
							{"Kyllo v US", ""},
							{"Terry v OH", ""},
							{"NJ v T.L.O.", ""},
							{"AZ v Gant", ""},
							{"US v Jones", ""},
							{"Weeks v US", ""},
							{"Mapp v OH", ""},
							{"Nix v Williams", ""},
							{"Miranda v AZ", ""},
							{"Powell v AL", ""},
							{"Betts v Brady", ""},
							{"Gideon v Wainwright", ""},
							{"Hamdam v Rumsfeld", ""},
							{"Boumediene v Bush", ""},
							{"Furman v GA", ""},
							{"Woodson v NC", ""},
							{"Gregg v GA", ""},
							{"McKlesky v Kemp", ""},
							{"Atkins v VA", ""},
							{"Roper v Simmons", ""},
							{"Coker v GA", ""},
							{"Griswold v CT", ""},
							{"Roe v Wade", ""},
							{"Planned Parenthood v Casey", ""},
							{"NAACP v AL",""},
		                    };

		FlashCards gov = new FlashCards (card);
		gov.learn ();
	}
}