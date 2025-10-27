package cote.exam1027;

public class PCExample {

	public static void main(String[] args) {
		Usb myStick = new MyStick();
		Usb myDisk = new MyDisk();
		
		PC pc = new PC();
		pc.setPort1(myStick);
		System.out.println(pc.port1.read());
		pc.setPort2(myDisk);
		System.out.println(pc.port2.read());

	}

}
