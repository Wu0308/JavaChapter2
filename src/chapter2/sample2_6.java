package chapter2;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class sample2_6 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入a或b");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter = str.charAt(0);
		
		switch(letter)
		{
			case 'a':{
				System.out.println("輸入的是a");
				break;
			}
			case 'b':{
				System.out.println("輸入的是b");
				break;
			}
			default:{
				System.out.println("請輸入a或b");
				break;
			}
		}

	}
}
