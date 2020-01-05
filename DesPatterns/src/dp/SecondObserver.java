package dp;

public class SecondObserver implements Observer {

	@Override
	public void update(String oldValue, String newValue) {
		System.out.println("Old value: " + oldValue + ", new value: " + newValue);

	}

}
