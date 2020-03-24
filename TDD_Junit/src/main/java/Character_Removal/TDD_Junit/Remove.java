package Character_Removal.TDD_Junit;

public class Remove 
{
	public String remove(String s)
	{
		String afterRemoval=null;
		if(s.substring(0,2).equals("AA"))
			afterRemoval=s.substring(2,s.length());
		else if(s.charAt(0)=='A')
			afterRemoval=s.substring(1,s.length());
		else if(s.charAt(1)=='A')
			afterRemoval=s.charAt(0)+s.substring(2,s.length());
		return afterRemoval;
	}
}
