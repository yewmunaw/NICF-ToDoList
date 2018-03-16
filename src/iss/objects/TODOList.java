package iss.objects;

import java.util.ArrayList;
import java.util.List;

public class TODOList {

	List<TODOItem> ls = new ArrayList<TODOItem>();
	
	public void add(String str)
	{
		
		ls.add(new TODOItem(str));
	}
	
	public void add(String str, int priority)
	{
		
		ls.add(new TODOItem(str,priority));
		
		List<TODOItem> lsTemp = new ArrayList<TODOItem>();
		
		
		for(int i=0;i<ls.size();i++)
		{
			TODOItem item = ls.get(i);
			
		}
	}
	
	public List<TODOItem> retrive()
	{
		return ls;
	}
	
	public void remove(String str)
	{
		TODOItem item = new TODOItem(str);
		
		ls.remove(item);
	}
	
	
	
}
