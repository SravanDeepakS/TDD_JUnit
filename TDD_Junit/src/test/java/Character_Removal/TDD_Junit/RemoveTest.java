package Character_Removal.TDD_Junit;

import junit.framework.TestCase;

public class RemoveTest extends TestCase 
{
	Remove r=new Remove();
	public void testCase1()
	{
		assertEquals("BCD",r.remove("ABCD"));
	}
	public void testCase2()
	{
		assertEquals("CD",r.remove("AACD"));
	}
	public void testCase3()
	{
		assertEquals("BCD",r.remove("BACD"));
	}
	public void testCase4()
	{
		assertEquals("BAA",r.remove("AABAA"));
	}
}
