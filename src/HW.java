 import java.util.Scanner;
import java.lang.Math;
 public class HW {

	public static void main(String[] args) {
	System.out.println("������� a,b,c");	
		
		Scanner data=new Scanner(System.in);
		float a=data.nextFloat();
		float b=data.nextFloat();
		float c=data.nextFloat();
		float d=0f;
		float x1=0f;
		float x2=0f;
		if(a==0 && c>0 && b!=0 && c!=0){
			x1=(c*-1)/(b);
			System.out.println("�������� ��������� ����"+" "+b+"x"+"+"+c+"=0");
			System.out.println("x="+x1);
			data.close();
			System.exit(0);
		} else if(a==0 && b==0){ System.out.println("�� ���������"); 	data.close();
		System.exit(0);}
		else if(a==0 && c==0) System.out.println("x=0");
		else if(a==0 && b==0 && c==0){ System.out.println("���������� �� ������� ");	data.close();
		System.exit(0);}
		else if(a!=0 && b!=0 && c==0 && b>0)
			System.out.println("�������� ���������� ���������"+" "+a+"x^2"+"+"+b+"x"+"=0");		

		else if(a!=0 && b!=0 && c==0 && b<0)
			System.out.println("�������� ���������� ���������"+" "+a+"x^2"+b+"x"+"=0");
	 else System.out.println("��������� ���� "+a+"x^2"+c+"=0");
	
		d=(float) Math.pow(b,2)-4*a*c;
		System.out.println("������������ ="+d);
		if(d>0){
			x1=(float) (-b+Math.sqrt(d))/(2*a);
			x2=(float) (-b-Math.sqrt(d))/(2*a);	
			System.out.println("D > 0, �� ��������� ����� ��� �������������� �����.");
			System.out.println("x1="+x1);
			System.out.println("x2="+x2);
		} else if(d==0){
			x1=x2=(float) (-b+Math.sqrt(d))/(2*a);
		System.out.println("D = 0, ��������� ����� ���� �������������� ������");
			System.out.println("x1=x2="+x1);
		} else System.out.println("D < 0, ��������� �� ����� �������������� ������;"); 
		
		
		
		}
		
		
		
	}


