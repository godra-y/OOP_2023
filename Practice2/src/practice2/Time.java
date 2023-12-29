package practice2;

public class Time implements Comparable<Time>{
	int hour;
	int minute;
	int second;

	public Time(int hour, int minute, int second) {
		if (hour>=0 && hour<24 && minute>=0 && minute<60 && second>=0 && second<60) {
			this.hour=hour;
			this.minute=minute;
			this.second=second;
		} 
		else {
			System.exit(0);
	    }
	}

	public String getToUniversal() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public String getToStandard() {
	    String period;
	    int standardHour;

	    if (hour<12) {
	        period="AM";
	    } 
	    else {
	        period="PM";
	    }

	    if (hour==0 || hour==12) {
	        standardHour=12;
	    } 
	    else {
	        standardHour=hour%12;
	    }
	    return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
	}

	public void add(Time otherTime) {
        int newSecond=this.second+otherTime.second;
        int total=newSecond/60;
        this.second=newSecond%60;

        int newMinute=this.minute+otherTime.minute+total;
        total=newMinute/60;
        this.minute=newMinute%60;

        int newHour=this.hour+otherTime.hour+total;
        this.hour=newHour%24;
    }
	
	@Override
    public int compareTo(Time otherTime) {
        // Compare hours, then minutes, then seconds
        if (this.hour != otherTime.hour) {
            return Integer.compare(this.hour, otherTime.hour);
        } else if (this.minute != otherTime.minute) {
            return Integer.compare(this.minute, otherTime.minute);
        } else {
            return Integer.compare(this.second, otherTime.second);
        }
    }
}
