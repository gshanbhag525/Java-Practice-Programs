
public class DayOfWeek {

	enum Day {
		sunday, monday, tuesday, wednesday, thursday, friday, saturday
	}
	public boolean Workday(String name) {
		Day ob = Day.valueOf(name);
		switch(ob)
		{
			case monday :  
			case tuesday :
			case wednesday : 
			case thursday :
			case friday : return true;
			default : return false;
		}
	}
}
