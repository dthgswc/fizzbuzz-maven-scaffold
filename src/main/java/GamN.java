
public class GamN {
	private int rawN;

	public GamN(int i) {
		this.rawN = i;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String tmp = "";
		if (rawN % 15 == 0) {
			tmp = "fizzbuzz";
		} else if (rawN % 5 == 0) {
			tmp = "buzz";
		} else if (rawN % 3 == 0) {
			tmp = "fizz";
		} else {
			tmp = String.valueOf(rawN);
		}
		return tmp;
	}
}
