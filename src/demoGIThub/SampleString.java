package demoGIThub;

public class SampleString {
	
	public static void main(String[] args) {
		String s="samarth kale";
		
		String[] sp = s.split(" ");
		String rev="";
		
		for(int i=sp.length;i<0;i--) {
			
			rev=rev+sp[i];
		}
	}

}
