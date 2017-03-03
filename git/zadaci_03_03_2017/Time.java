package zadaci_03_03_2017;

public class Time {
	// data fields
	private long hour;
	private long minute;
	private long second;

	public Time() {
		// no args countructor
		long totalSecond = (System.currentTimeMillis() / 1000) + 3600;
		this.second = totalSecond % 60;
		long totalMinutes = totalSecond / 60;
		this.minute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		this.hour = totalHours % 24;
	}

	Time(long timeElapsed) {
		// calling method for setting time with time elapsed as input
		setTime(timeElapsed);
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	public void setTime(long elapseTime) {
		// method that sets time based on input
		long totalSecond = elapseTime / 1000;
		this.second = totalSecond % 60;
		long totalMinutes = totalSecond / 60;
		this.minute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		this.hour = totalHours % 24;

	}

	@Override
	public String toString() {
		return "Time [hour=" + this.hour + ", minute=" + this.minute
				+ ", second=" + this.second + "]";
	}

}
