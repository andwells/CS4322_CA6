import java.io.File;
import java.io.PrintWriter;

public class ACProxy extends ACState {
	
	private PrintWriter write;
	private ACState currentState;
	private AlarmClock clock;
	
	public ACProxy(AlarmClock clock) {
		this.clock = clock;
		AlarmOffState off = AlarmOffState.getInstance();
		AlarmOnState on = AlarmOnState.getInstance();
		BuzzingState buzz = BuzzingState.getInstance();
		SnoozingState snooze = SnoozingState.getInstance();
		currentState = off;
		try {
			write = new PrintWriter("ClockLog.txt");
		}
		catch(Exception ex) {
			System.out.println("File Not Found " + ex.getMessage());
		}
	}
	
	void setState(ACState newState) {
		if (currentState != null) {
			currentState.exit(clock);
		}
		currentState = newState;
		if (currentState != null) {
			log();
			currentState.enter(clock);
		}
	}
	
	public void turnAlarmOff(AlarmClock clock) {
		//clock.setState(AlarmOffState.getInstance());
		setState(AlarmOffState.getInstance());
	}
	
	public void turnAlarmOn(AlarmClock clock) {
		//clock.setState(AlarmOnState.getInstance());
		setState(AlarmOnState.getInstance());
	}
	
	public void buzz(AlarmClock clock) {
		if (clock.getTime().equals(clock.getAlarmTime())) {
			//clock.setState(BuzzingState.getInstance());
			setState(BuzzingState.getInstance());
		}
	}
	
	public void snooze(AlarmClock clock) {
		//clock.setState(SnoozingState.getInstance());
		setState(SnoozingState.getInstance());
	}
	
	public void log() {
		write.println("State: "+currentState.getClass().getSimpleName()+"\tTime: "+clock.getTime()+"\tAlarmTime: "+clock.getAlarmTime());
		write.flush();
	}
}