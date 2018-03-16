package iss.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TODOList {

	List<TODOItem> ls = new ArrayList<TODOItem>();

	public void add(String str)
	{

		ls.add(new TODOItem(str));
	}

	public void add(TODOItem item)
	{

		ls.add(item);



		Collections.sort(ls, new Comparator<TODOItem>() {
			public int compare(TODOItem o1, TODOItem o2) {

				int p1 = o1.getPriority();
				int p2 = o2.getPriority();

				if(p1<p2)
					return -1;
				else if (p1==p2)
					return 0;
				else
					return 1;
			}
		});
	}

	public List<TODOItem> retrive()
	{
		return ls;
	}

	public void remove(String name)
	{
//		for(TODOItem item : ls)
		for(int i=0;i<ls.size();i++)
		{
			TODOItem item = ls.get(i);
			if(item.getDescription().equalsIgnoreCase(name))
				ls.remove(item);
		}

		
	}
	
	public boolean isValid(String name)
	{
		for(TODOItem item : ls)
		{
			if(item.getDescription().equalsIgnoreCase(name))
				return true;
		}
		
		return false;
		
	}



}
