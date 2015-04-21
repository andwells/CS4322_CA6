class BuzzingState extends ACState {

	private static BuzzingState instance = new BuzzingState();
	public static BuzzingState getInstance() { return instance; }
	private BuzzingState() {}

	public void turnAlarmOff(AlarmClock clock) {
		clock.setState(AlarmOffState.getInstance());
	}

	public void snooze(AlarmClock clock) {
		clock.setState(SnoozingState.getInstance());
	}
	
}