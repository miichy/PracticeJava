package ListIPs;

public class DisplayIPs {
	
	public static void main(String[] args) {
		String ip1 = "192.168.1.0";
		String ip2 = "192.168.5.10";
		IPUtil ipU = new IPUtil();
		ipU.displayIPs(ip1, ip2);
		
		
	}

}
