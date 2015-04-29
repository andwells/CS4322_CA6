class SnoozingState extends ACState {

	private static SnoozingState instance = new SnoozingState();
	public static SnoozingState getInstance() { return instance; }
	private SnoozingState() {}

	private ACTime activateTime;

	public void enter(AlarmClock clock) {
		activateTime = clock.getTime().adjust(9);
	}
	
	public void exit(AlarmClock clock) {
		activateTime = null;
	}

	public void setTime(AlarmClock clock) {
		ACTime currentTime = clock.getTime();
//		if (currentTime.equals(activateTime)) {
//			clock.setState(BuzzingState.getInstance());
//		}
	}

//	public void turnAlarmOff(AlarmClock clock) {
//		clock.setState(AlarmOffState.getInstance());
//	}

}