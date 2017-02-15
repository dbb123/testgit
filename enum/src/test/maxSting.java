package test;

public class maxSting {
	public static void main(String[] args) {
		String a="abcdefgfasfa";
		String b="abcdefg";
		int max=a.length()<b.length()?b.length():a.length();
		int i=0;
		int result=0;
		try {
			for(;i<max;i++)
			{
				if(a.charAt(i)==b.charAt(i))
				{
					 continue;
				}else if(a.charAt(i)>b.charAt(i)){
				}else{
				}
				
			}
			
		} catch (Exception e) {
			System.out.println(i);
			System.out.println(a.length());
			System.out.println(b.length());
			//越界了之后i的值会增加一,所以跟最短的字符串是相等的,也就是i==a.length()的话,就说明b字符串比较长,所以返回-1
			if(i==a.length())
			{
				
				result= -1;
			}else if(i==b.length()){
				result=1;
			}
		}
		
		System.out.println(result);
		System.out.println(a.compareTo(b));
		}
	}
	
