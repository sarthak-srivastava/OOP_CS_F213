import java.util.*;
public class TaxOnSalary {
private double salary;
private boolean isPANsubmitted;
public TaxOnSalary()
{
	salary =  0;
	isPANsubmitted = false;}

public TaxOnSalary(boolean isPANsubmitted)
{
	salary =  1000;
	this.isPANsubmitted = isPANsubmitted;}
public double getSalary()
{
	return this.salary;}
public boolean getisPANsubmitted()
{
	return this.isPANsubmitted;}


public  void setSalary(double s)
{
	this.salary = s;}
public void setisPANsubmitted(boolean a)
{
	this.isPANsubmitted = a;}
public void inputSalary()
{
	Scanner sc = new Scanner(System.in);
	this.salary = sc.nextInt();
	sc.nextLine();
//	sc.close();
	}
public double calculateTax()
{
	if(this.salary<180000 && isPANsubmitted == true)
		return 0;
	else if(this.salary < 180000 && isPANsubmitted == false)
		return 0.05*this.salary;
	else if(this.salary>180000 && this.salary<500000)
		return 0.1*this.salary;
	else if(this.salary>500000 && this.salary<100000)
		return 0.2*this.salary;
	else 
		return 0.3*this.salary;
		}

}

