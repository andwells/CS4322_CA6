class AlarmOffState extends ACState {

	private static AlarmOffState instance = new AlarmOffState();
	public static AlarmOffState getInstance() { return instance; }
	private AlarmOffState() {}

	public void turnAlarmOn(AlarmClock clock) {
		clock.setState(AlarmOnState.getInstance());
	}

}