import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Fraction a,b;
		String st = sc.nextLine();
		String st2=st;
		String st3=st;
		for (int i=0;i<st.length();i++)
		{
			if (st.charAt(i)=='/')
			{
					st2=st.substring(0,i);
					st3=st.substring(i+1,st.length());
			}
		}
		st = sc.nextLine();
		String st4=st;
		String st5=st;
		for (int i=0;i<st.length();i++)
		{
			if (st.charAt(i)=='/')
			{
					st4=st.substring(0,i);
					st5=st.substring(i+1,st.length());
			}
		}

		int x1=Integer.valueOf(st2);
		int x2=Integer.valueOf(st3);
		int x3=Integer.valueOf(st4);
		int x4=Integer.valueOf(st5);
			
		a = new Fraction(x1,x2);
		b = new Fraction(x3,x4);

		System.out.println("������ �����: "+a.toString());
		System.out.println("������ �����: "+b.toString());
		System.out.println("���������: "+a.equal(b));
		System.out.println("�����: "+a.sum(b));
	    System.out.println("��������: "+a.minus(b));
	    System.out.println("������������: "+a.mul(b));
	    System.out.println("�������: "+a.div(b));
		

	}

}
