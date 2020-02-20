package shruthi.shruthi_cleancode;

//package EpamCleanCode;
import java.util.Scanner;
import java.io.PrintWriter;
class SCInterest2
{
static double s,c;
static double pr, rate, time;
public void simp_intrst() 
	{
PrintWriter writer=new PrintWriter(System.out,true);
Scanner sc=new Scanner (System. in);
writer.println("Enter the amount:");
pr=sc.nextDouble();
writer.printf("Enter the No.of years:");
time=sc.nextDouble();
writer.printf(" Enter the Rate of  interest:");
rate=sc.nextDouble();

   s=(pr*time*rate)/100;
writer.write("simple Interest="+s);
c=pr * Math.pow(1.0+rate/100.0,time) - pr;
writer.write("\ncompound Interest="+c);
writer.close();
} 

public static void main(String args[]) 
	{

	SCInterest2 i=new SCInterest2();
	i.simp_intrst();

	}
}


