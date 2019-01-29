//import java.util.*;
public class Customer {
private String Name;
private String idNo;
private double balance;
private Item i;
public Customer(String Name, String id, double balance)
{
	this.Name = Name;
	this.idNo = id;
	this.balance = balance;}

public Customer(String Name, String id)
{
	this.Name = Name;
	this.idNo = id;
	this.balance = 5000;}
public String getName()
{
	return this.Name;}
public String getidNo()
{
	return this.idNo;
	}
public double getBalance()
{
	return this.balance;
	}

public void setName(String nm)
{
	this.Name = nm;}
public void setidNo(String id)
{  this.idNo = id;
	}
public void print()
{	System.out.println("Item name:"+i.getItemName());
	System.out.println("Item Id:"+i.getItemidNo());
	System.out.println("Item Quantity:"+i.getItemQuantity());
	System.out.println("Item price:"+i.getItemPrice());
	System.out.println("Remaining balance for you:" +(this.balance));
	}
public void buyItem(Item it)
{	this.i = it;
	if(this.balance<it.getItemPrice()){
		System.out.println("Insufficient Balance");}
else if(it.getItemQuantity()<1)
{	System.out.println("Invalid Qunatity of item entered!");
	}
else
{	this.balance -=(it.getItemPrice()*it.getItemQuantity());
	print();
	}
}
}
