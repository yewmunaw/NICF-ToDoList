package iss.objects;

import java.util.Comparator;

public class TODOItem implements Comparator<TODOItem>{

	private String description;
	private int priority=0;
	private String date;
	
	
	public TODOItem(String str)
	{
		description=str;
	}
	
	public TODOItem(String str, int priority)
	{
		description=str;
		this.priority=priority;
	}
	
	public String toString()
	{
		return "- "+description +" | Date:"+date+" | Priority:"+priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
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

	
	
}
