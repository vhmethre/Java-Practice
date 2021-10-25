
public class AustralianTraffic implements CentralTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralTraffic a = new AustralianTraffic();
		a.greenGo();
		a.redStop();
		a.yellowWait();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("GreenGo Implementation");

	}

	@Override
	public void yellowWait() {
		// TODO Auto-generated method stub
		System.out.println("yellow Wait Implementation");

	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red stop Implementation");
	}

}
