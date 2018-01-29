
public class Activity {

	private int day;
	private int month;
	private int year;
	
	public Activity () {
		day=1;
		month=1;
		year=1;
		
	}
	//constructor
	public Activity(int dayIn, int monthIn, int yearIn) {
		day=1;
		month=1;
		year=1;
		setDate(dayIn, monthIn, yearIn);
		
		}
	
	
	
	public int getDay()
	{
		return day;
	}
	
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	
	
	
	public void setDate(int dayIn,int monthIn, int yearIn) {
		if (monthIn < 13 && monthIn > 0) {
			month = monthIn;
			
			if (monthIn == 4 && monthIn == 6 && monthIn == 9 && monthIn == 11) {
				if (dayIn < 31 && dayIn > 0) {
					day = dayIn;
				}
				else {
					System.out.println("Invalid Day");
				}
			}
			else if (monthIn == 1 && monthIn == 3 && monthIn == 5 && monthIn == 7 && monthIn == 8 && monthIn == 12){
				if (dayIn < 32 && dayIn > 0) {
					day = dayIn;
				}
				else {
					System.out.println("Invalid Day");
				}
			}
				
			else {
				if (dayIn < 29 && dayIn > 0) {
					day = dayIn;
				}
				else {
					System.out.println("Invalid Day");
				}
			}
		}
		else {
			System.out.println("Invalid Month");
		}
		
		if (yearIn >= 0) {
			year = yearIn;
		}
		else {
			System.out.println("Invalid Year");
		}
	}

	public void printDate() {
		System.out.println(""+ day +"." + month + "." + year);
	}
}
