package prob01;

public class StringUtil 
{
	//문자열을 결합하여 리턴 하는 메소드 구현
	public static String concatenate(String[] str) 
	{
        String totalStr = "";
        
        for(int i=0; i<str.length; i++)
        {
        	totalStr += str[i];
        }
        
        return totalStr;
    }
}
