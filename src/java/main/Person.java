import java.util.ArrayList;


public class Person {

	private String name;
	private String surname;
	private int year;
	private int month;
	private int day;
	public static ArrayList<String> SortArguments;
	
	public Person(String name, String surname, int year, int month, int day){
		this.name=name;
		this.surname = surname;
		this.year = year;
		this.month = month;
		this.day  = day;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}


	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}


	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}


	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}


	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}


	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}


	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}


	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}
	
	@Override
	public String toString(){
		return this.name+";"+this.surname+";"+this.year+";"+this.month+";"+this.day;
		
	}
	
	public int myComparator(Person other){
		
		for(String a : SortArguments){
			if(a.equalsIgnoreCase("N")){
				if(this.getName().compareTo(other.getName()) == 0)
					continue;
				else
					return this.getName().compareTo(other.getName());
			}
			else if(a.equalsIgnoreCase("S")){
				if(this.getSurname().compareTo(other.surname)==0)
					continue;
				else
					return this.getSurname().compareTo(other.getSurname());
			}
			else if(a.equalsIgnoreCase("Y")){
				if(this.getYear() == other.getYear() )
					continue;
				else 
					return this.getYear() - other.getYear();
			}
			else if(a.equalsIgnoreCase("M")){
				if(this.getMonth() == other.getMonth())
					continue;
				else 
					return this.getMonth() - other.getMonth();
			}
			else if(a.equalsIgnoreCase("D")){
				if(this.getDay() == other.getDay())
					continue;
				else 
					return this.getDay() - other.getDay();
			}
			
			
		}
		/* Just in case everything is same */
		return 0;
		
		
	}
	
	
}
