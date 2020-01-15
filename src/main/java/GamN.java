
public class GamN {
	private int rawN;

	public GamN(int i) {
		this.rawN = i;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (rawN % 15 == 0) {
			return "fizzbuzz";
		}
		if (rawN % 5 == 0) {
			return "buzz";
		}
		if (rawN % 3 == 0) {
			return "fizz";
		}
		return String.valueOf(rawN);
	}
}
