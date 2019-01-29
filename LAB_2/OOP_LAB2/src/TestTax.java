
public class TestTax {
	public static void main(String[] args)
{TaxOnSalary tax1 = new TaxOnSalary(true);
TaxOnSalary tax2 = new TaxOnSalary();
System.out.println("Enter the Salary for tax 1");
tax1.inputSalary();
System.out.println("Enter the Salary for tax 2");
tax2.inputSalary();
System.out.println("Tax for tax1:" + tax1.calculateTax());
System.out.println("Tax for tax2:" + tax2.calculateTax());
}
}