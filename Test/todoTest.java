import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import iss.objects.TODOItem;
import iss.objects.TODOList;
import junit.framework.TestCase;

public class todoTest  {

	private String s1 = "buy bread";
	private String s2 = "buy bread again";
	
	
	
	public void testAddItem()
	{		 
		System.out.println("Testing Add Item...");
		
		TODOList TDL = new TODOList();
		
		//exercise
		TDL.add(s1);
		
		//verify
		List<TODOItem> actual = TDL.retrive();
		
		
		assertTrue(actual.get(0).toString().equals(s1));
	}
	
	@Test
	public void testRemoveItem()
	{
		System.out.println("Testing Remove Item...");
		TODOList TDL = new TODOList();
		
		//exercise
		TDL.remove(s1);

		//verify
		List<TODOItem> ls = TDL.retrive();

		assertFalse("Item("+s1+") found",ls.contains(new TODOItem(s1)));
	}
	
	@Test
	public void testPriority()
	{
		System.out.println("Testing Priority Item...");
		TODOList TDL = new TODOList();
		
		//exercise
		TDL.add(s1);
		TDL.add(s2);

		//verify
		List<TODOItem> actual = TDL.retrive();

		assertTrue(actual.get(0).toString().equals(s1));
		assertTrue(actual.get(1).toString().equals(s2));
	}
	


}
