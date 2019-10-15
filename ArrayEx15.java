
public class ArrayEx15 {

	public static void main(String[] args) {
		
		// 모르스부호
		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.", "-..", "." //a,b,c,d,e
				,"..-.","--.","....","..",".---"//f,g,h,i,j
				,"-.-",".-..","--","-.","---"//k,l,m,n,o
				,".--.","--.-",".-.","...","-"//p,q,r,s,t
				,"..-","...-",".--","-..-","-.--"//u,v,w,x,y
				,"--.."//z
		};
		String result = "";
		
		for (int i =0; i < source.length(); i++) {
			result += morse[source.charAt(i)-'A'];
		}
		System.out.println("source:"+source);
		System.out.println("morse:"+result);

	}

}
