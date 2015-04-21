class AlarmOnState extends ACState 
{

	private static AlarmOnState instance = new AlarmOnState();
	public static AlarmOnState getInstance() { return instance; }
	private AlarmOnState() {}

	public void setTime(AlarmClock clock) {
		ACTime currentTime = clock.getTime();
		ACTime alarmTime = clock.getAlarmTime();
		if (currentTime.equals(alarmTime)) {
			clock.setState(BuzzingState.getInstance());
		}
	}

	public void turnAlarmOff(AlarmClock clock) {
		clock.setState(AlarmOffState.getInstance());
	}

}