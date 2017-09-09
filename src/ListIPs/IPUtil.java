package ListIPs;

import java.util.regex.Pattern;

public class IPUtil {
	private static final Pattern IPV4_PATTERN = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
	
	public boolean validate(String ipStr){
		return IPV4_PATTERN.matcher(ipStr).matches();
	}
	
	public int iP2int(String ip) throws Exception{
		if(!validate(ip)){
			throw new Exception ("not a validate ip string");
		}
		int num ;
		String ipMeta[] = ip.split("\\."); 
		int meta0 = Integer.valueOf(ipMeta[0]);
		int meta1 = Integer.valueOf(ipMeta[1]);
		int meta2 = Integer.valueOf(ipMeta[2]);
		int meta3 = Integer.valueOf(ipMeta[3]);
		num = meta0*256*256*256 + meta1*256*256 + meta2*256 + meta3;
		num = num >>> 0;
		return num;
	}
	
	public String int2Ip(int num){
		String[] arr = new String[4];
		String str = "";
		arr[0] = Long.toString((num >>> 24));
		arr[1] = Long.toString((num << 8) >>> 24) ;
		arr[2] = Long.toString((num << 16) >>> 24);
		arr[3] = Long.toString((num << 24) >>> 24);
		str = arr[0] + "." + arr[1] + "." + arr[2] + "." + arr[3];
		return str;
	}
	
	public void displayIPs(String ip1,String ip2){
		int ip1Int = 0;
		int ip2Int = 0;
		try{
			ip1Int = iP2int(ip1);
			ip2Int = iP2int(ip2);
		}catch (Exception e) {
			e.printStackTrace();
		}
		if (ip1Int > ip2Int){
			System.out.println("put the first");
		}else if(ip1Int == ip2Int){
			System.out.println("You put the same two ip");
		}else {
			for (int i = ip1Int+1; i < ip2Int;i++){
				System.out.println(int2Ip(i));
			}
		}
	}

}
