//import java.util.*;
public class TestStore {
	public static void main(String[] args){
Customer a = new Customer("Sarthak Srivastava","007",200000);
Item i1 = new Item("iphone X","PR201901",1,70000);
Item i2 = new Item("MacBook Pro","PR201902",1,90000);
a.buyItem(i1);
a.buyItem(i2);
}
}