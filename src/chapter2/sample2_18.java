package chapter2;

import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.io.BufferedReader;
import java.io.IOException;

public class sample2_18 
{
	public static void main(String[] args) 
	{
		int test[] = {80,60,22,50,75};
		
		for(int i = 0; i < 5; i++) {
			System.out.println("第"+ (i+1) +"個人的分數是"+ test[i] +"分");
		}
	}
}
