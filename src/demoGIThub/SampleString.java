package demoGIThub;

public class SampleString {
	
	public static void main(String[] args) {
		String s="samarth kale";
		
		String[] sp = s.split(" ");
		String rev="";
		
		for(int i=sp.length;i<0;i--) {
			
			rev=rev+sp[i];
		}
		
		int ar[]= {3,4,5,6,78,9,};
		
		for(int a:ar) {
			
			System.out.println(a);
		}
		
		
	}

}
