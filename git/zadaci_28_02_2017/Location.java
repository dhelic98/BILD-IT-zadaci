package zadaci_28_02_2017;

public class Location {
	// Data fields
	public int row;
	public int column;
	public double maxValue;

	public Location() {

	}

	Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;

	}

	@Override
	public String toString() {
		return "Location [row=" + row + ", column=" + column + ", maxValue="
				+ maxValue + "]";
	}

}
