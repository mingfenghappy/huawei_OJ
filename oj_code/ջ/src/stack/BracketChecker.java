package stack;

public class BracketChecker {
	private String in;
	public BracketChecker(String in ){
		this.in = in;
		
	}
	public String check(){
		int max = in.length();
		StackX stack = new StackX(max);
		for(int i =0;i < in.length();i++){
			char ch = in.charAt(i);
			switch(ch){
			case '{':
			case '[':
			case '(':
				stack.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				char chx = stack.pop();
				if(!stack.isEmpty()){
				if((chx!='{'&&ch=='}')||(chx!='['&&ch==']')||(chx!='('&&ch==')')){
					return "error"+ch+"at"+i;
				}else{
					return "success";
				}
				}else{
					return "error is empty";
				}
			}
			
		}
		
		if(!stack.isEmpty()){
			//ִ�е��ˣ�����ж�Ӧ�ķ��ţ�Ӧ��ȫ������������Ϊ�գ�˵����߷���û����Ӧ���ұߵķ���
			//System.out.println("Error: missing right bracket.");
			return "Error: missing right bracket.";
		}
		return "";
	}
}
