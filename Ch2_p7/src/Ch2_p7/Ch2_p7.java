package Ch2_p7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch2_p7 {
	public static void main(String[] args) throws IOException 
	{
		System.out.println("�п�J���");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		if(num==1)
		{
			System.out.println("��J����ƬO"+num);
			System.out.println("��ܪ���ƬO"+num);
		}

			System.out.println("�����B�z");
		
	}
}
