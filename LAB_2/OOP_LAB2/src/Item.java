//import java.util.*;
public class Item {
private String itemName;
private String itemidNo;
private int itemQuantity;
private double itemPrice;
public Item(String itemname,String itemidno,int itemquantity ,double itemprice)
{
	this.itemidNo = itemidno;
	this.itemName = itemname;
	this.itemQuantity = itemquantity;
	this.itemPrice = itemprice;}

public Item(String itemname,String itemidno,int itemquantity)
{
	this.itemidNo = itemidno;
	this.itemName = itemname;
	this.itemQuantity = itemquantity;
	this.itemPrice = 500;
	}
public Item(String itemname,String itemidno)
{
	this.itemidNo = itemidno;
	this.itemName = itemname;
	this.itemQuantity = 1;
	this.itemPrice = 500;
	}
public String getItemName()
{ return this.itemName;
	}
public String getItemidNo()
{ return this.itemidNo;
	}
public int getItemQuantity()
{ return this.itemQuantity;
	}
public Double getItemPrice()
{ return this.itemPrice;
	}

public void getItemName(String itemn)
{ this.itemName = itemn;
	}
public void setItemidNo(String itemid)
{this.itemidNo = itemid;
	}
public void setItemQuantity(int quantity)
{ this.itemQuantity = quantity;
	}
public void setItemPrice(Double price)
{ this.itemPrice = price;
	}
}
