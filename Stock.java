
public class Stock {

	//attributes
	private int day;
	private int month;
	private int year;
	private String name;
	private int[] values = new int[7];
	
	//constructor
	public Stock(){
		day=1;
		month=1;
		year=1;
		name="";
		//setting to zero
		for (int i=0; i<7; i++) {
			values [i] = 0;
		}
	}
	public Stock(int dayIn, int monthIn, int yearIn, String nameIn, int [] valIn) {
		boolean valid = true;
		setDate(dayIn, monthIn, yearIn);
		if (valIn.length==7) {
			for (int ind=0; ind<7; ind++) {
				if (valIn[ind]<0) {
					valid = false;
				}
			}		
		}
		if(valid && valIn.length==7) {
			for (int ind=0; ind<7; ind++) {
			values[ind]= valIn[ind];
		}
		day=dayIn;
		month=monthIn;
		year=yearIn;
		name=nameIn;
	}
		
	
		
	}
	
	public String getName() {
		return name;
	}

	public int getValue(int ind) {
		if ((ind < 0) || (ind <= values.length )) {
			return values[ind];
		}
		else {
			System.out.println("error");
			return 0;
		}
	}
	
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public boolean setDate(int dayIn, int monthIn, int yearIn) {
		boolean valid = true;
		
		if (monthIn < 13 && monthIn > 0) {
			month = monthIn;

			if (monthIn == 4 && monthIn == 6 && monthIn == 9 && monthIn == 11) {
				if (dayIn < 31 && dayIn > 0) {
					day = dayIn;
				} else {
					System.out.println("Invalid Day");
					valid=false;
				}
			} else if (monthIn == 1 && monthIn == 3 && monthIn == 5 && monthIn == 7 && monthIn == 8 && monthIn == 12) {
				if (dayIn < 32 && dayIn > 0) {
					day = dayIn;
				} else {
					System.out.println("Invalid Day");
					valid=false;
				}
			}

			else {
				if (dayIn < 29 && dayIn > 0) {
					day = dayIn;
				} else {
					System.out.println("Invalid Day");
					valid=false;
				}
			}
		} else {
			System.out.println("Invalid Month");
			valid=false;
		}

		if (yearIn >= 0) {
			year = yearIn;
		} else {
			System.out.println("Invalid Year");
			valid=false;
		}
		return valid;
	}

	public void printDate() {
		System.out.println("" + day + "." + month + "." + year);
	}
	
	public void setName(String nameIn) {
		name=nameIn;
	}
	
	public void setValue(int val, int ind) {
		if (val<0 || ind < 0 || ind > 7) {
			System.out.println("error");
		}
		else {
			values[ind]=val;
		}
	}

	public void printStock() {
		System.out.println(""+ day +""+ month +""+ year +""+ name + "");
		for (int i=0; i< values.length ; i++) {
			System.out.println(values[i]);
		}
	}
	
	public int getMeanValue() {
		int sum=0;
		int mean;
		for (int i=0; i<7; i++) {
			sum=values[i]+sum;
		}
		mean=sum/7;
		return mean;
	}
		
}

