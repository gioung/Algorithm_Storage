
public class QueueTest {
	public int solution(String arg) {
		int answer=0;
		int stack=0;
		char[] index=new char[2];
		for(int i=0;i<arg.length();i++) {
			
				index[0]=index[1];
				index[1]=arg.charAt(i);
			
			if(index[1]=='(')
				stack+=1;
			else if(index[1]==')') {
				stack-=1;
				if(index[0]=='(')
					answer+=stack;
				else
					answer+=1;
			}
			
										}
		return answer;
	}

	public static void main(String[] args) {
		int x=new QueueTest().solution("()(((()())(())()))(())");
		System.out.println(x);
	}

}
