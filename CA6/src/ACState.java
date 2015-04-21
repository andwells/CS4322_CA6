class ACState
{
	// called when the state is entered
	public void enter(AlarmClock clock) { }

	// called when the state is exited
	public void exit(AlarmClock clock) { }

	// called when the "current time" changes (i.e., once per minute)
	public void setTime(AlarmClock clock) { }

	// called when the user changes the alarm time
	public void setAlarmTime(AlarmClock clock) { }

	// called when the user presses the "alarm on" button
	public void turnAlarmOn(AlarmClock clock) { }

	// called when the user presses the "alarm off" button
	public void turnAlarmOff(AlarmClock clock) { }

	// called when the user presses the "snooze" button
	public void snooze(AlarmClock clock) { }
}