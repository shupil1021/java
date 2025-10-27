package cote.exam1027;

public class MyStick implements Usb{
	public long size = 8 * 1073741824L;
	public long currentUsage = 0;
	
	public MyStick() {}
	public MyStick(int size) {this.size = size * 1073741824L;}
	
	public String read() {
		return "총 " + currentUsage + "바이트 사용";
	}
	
	public void write(long dataSize) {
		long leftSize = size - currentUsage;
		if(dataSize <= leftSize) {
			currentUsage += dataSize;
		}
	}
	
}
