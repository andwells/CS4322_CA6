public class ACTime 
{

	private int hour;
	private int minute;
	
	public ACTime(int hour, int minute)
	{
		this.hour = hour;	
		this.minute = minute;
	}

	public int getHour()
	{ 
		return hour; 
	}
	
	public int getMinute()
	{ 
		return minute;
	}

	public ACTime adjust(int delta)
	{
		int adjustedHour = hour;
		int adjustedMinute = minute + delta;
		while (adjustedMinute >= 60)
		{
			adjustedMinute -= 60;
			++adjustedHour;
			if (adjustedHour == 24)
			{
				adjustedHour = 0;
			}
		}
		return new ACTime(adjustedHour, adjustedMinute);
	}

	public boolean equals(Object o)
	{
		if (o != null && o instanceof ACTime)
		{
			ACTime other = (ACTime)o;
			return (hour == other.hour && 
					minute == other.minute);
		}
		return false;
	}

	public String toString()
	{
		return hour + ":" + minute;
	}

}