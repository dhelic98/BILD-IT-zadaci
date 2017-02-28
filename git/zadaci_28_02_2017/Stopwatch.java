package zadaci_28_02_2017;

public class Stopwatch {
	// Data fiels
	private long startTime;
	private long endTime;

	public Stopwatch() {
		// no-args constructor
		//
		startTime = System.currentTimeMillis();
	}

	public void start() {
		this.startTime = System.currentTimeMillis();

	}

	public void end() {
		this.endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {

		return this.endTime - this.startTime;

	}

}
