package Ch2_p8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch2_p8 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入整數");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		if(num==1)
		
			System.out.println("輸入的整數是"+num);
			System.out.println("選擇的整數是"+num);
		
			System.out.println("結束處理");
		
	}
}
