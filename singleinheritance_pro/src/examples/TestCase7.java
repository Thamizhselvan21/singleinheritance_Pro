package examples;

import java.util.Scanner;

public class TestCase7 {

	public static void main(String[] args) {
		String line;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		line=s.nextLine();
		int a=0,e=0,j=0,o=0,u=0;
		for(int i=0;i<line.length();i++)
		{
			if(line.charAt(i)=='a'||line.charAt(i)=='A')
			{
				a++;
			}
			if(line.charAt(i)=='e'||line.charAt(i)=='E')
			{
				e++;
			}
			if(line.charAt(i)=='i'||line.charAt(i)=='I')
			{
				j++;
			}
			if(line.charAt(i)=='o'||line.charAt(i)=='O')
			{
				o++;
			}
			if(line.charAt(i)=='u'||line.charAt(i)=='U')
			{
				u++;
			}
		}
		System.out.println("a:"+a+"\n e:"+e+"\n i:"+j+"\n o:"+o+"\n u:"+u);
	}

}
