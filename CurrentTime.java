
public class CurrentTime {
	private long milliSeconds;
	private final int MILLI_CONVERSION = 1000;
	
	public CurrentTime() {
		milliSeconds = System.currentTimeMillis();
	}
	
	public CurrentTime(long input) {
		milliSeconds = input;
	}
	
	@Override
	public String toString() {
		return "Time: " + getCurrentHours() + ":" + getCurrentMinutes() + ":" + getCurrentSeconds();
	}
	
	public long getSeconds() {
		return milliSeconds / MILLI_CONVERSION;
	}

	public long getCurrentSeconds() {
		return getSeconds() % 60;
	}

	public long getMinutes() {
		return getSeconds() / 60;
	}

	public long getCurrentMinutes() {
		return getMinutes() % 60;
	}

	public long getHours() {
		return getMinutes() / 60;
	}

	public long getCurrentHours() {
		return getHours() % 60;
	}
}
