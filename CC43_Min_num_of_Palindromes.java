
public class CC43_Min_num_of_Palindromes {

	static int[] answer=new int[100];
	
	public static int sol1(String s){
	
		int len=s.length();
		int[] answer=new int[len];
		for(int i=0; i<len; i++) answer[i]=0;
		
		
		return answer[len-1];
		
	}
	
	public static int sol2(String s){
		
		int len=s.length();
		//int[] answer=new int[len];
		//System.out.println(len);
		for(int i=0; i<len; i++)
			answer[i]=i;
		
		for(int i=1; i<len; ++i){
			if(isPalin(s, 0, i)){
				answer[i]=0;
				//System.out.println("hi:"+answer[i]);
			}
			
			for(int j=0; j<i; ++j){
				if(isPalin(s, j+1, i)){// && answer[i]>answer[j]+1){
					//answer[i]=answer[j]+1;
					answer[i]=Math.min(answer[i], answer[j]+1);
				}
			}
		}
		
		return answer[len-1];
		
	}
	
	public static void main(String[] args) {
	
		String s="abbaaca";
		
		//char[] c=s.toCharArray();
		//System.out.println(isPalin(s,0,3));
		int a = sol2(s);
		System.out.println(a);
	}

	public static boolean isPalin(String s, int b, int e){
		
		
		char[] c=s.toCharArray();
		
		for(int i=b; i<e-i+b; ++i){
			if(c[i]!=c[e-i+b])
				return false;
			
		}
		
		return true;
	}
}
