package Single;

public class Single1 {
	private Single1 single = new Single1();

	private Single1() {
	};

	public Single1 getInstance() {
		return single;
	}
}
