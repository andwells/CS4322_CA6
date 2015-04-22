public class AlarmClock
{

	private ACTime time;
	private ACTime alarmTime;
	private ACState currentState;

	public AlarmClock()
	{
		time = new ACTime(0, 0);
		alarmTime = new ACTime(0, 0);
		setState(AlarmOffState.getInstance());
	}

	public ACTime getTime()
	{
		return time;
	}

	public ACTime getAlarmTime()
	{
		return alarmTime;
	}

	public void setTime(ACTime newTime) {
		time = newTime;
		currentState.setTime(this);
	}

	public void setAlarmTime(ACTime newAlarmTime) {
		alarmTime = newAlarmTime;
		currentState.setAlarmTime(this);
	}

	public void turnAlarmOn() {
		currentState.turnAlarmOn(this);
	}

	public void turnAlarmOff() {
		currentState.turnAlarmOff(this);
	}

	public void snooze() {
		currentState.snooze(this);
	}

	void setState(ACState newState)
	{
		if (currentState != null)
		{
			currentState.exit(this);
		}
		currentState = newState;
		if (currentState != null)
		{
			System.out.println(currentState.getClass().getName() + 
					" [" + time + "]");
			currentState.enter(this);
		}
	}
	
}