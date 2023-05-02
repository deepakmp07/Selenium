package selenium_day7;
import java.util.*;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_2 {
	private static final String priority = null;
	static int a,b,c;
	@BeforeTest
	public static void  getdata() {
		System.out.print("Enter the values to calculate");
		Scanner sc = new Scanner(System.in);
		 a = sc.nextInt();
		 b = sc.nextInt();
		 
	}
  @Test(priority =1)
  public void add() {
	  c = a + b;
	  Assert.assertEquals(c, 11);
  }
  @Test(priority =3)
  public void multiply() {
	  c = a*b;
	  Assert.assertEquals(c, 28);
  }
  @Test(priority =2)
  public void subraction() {
	  c = a-b;
	  Assert.assertEquals(c, 3);
  }
  @Test(priority =4)
  public void division() {
	  c = a/b;
	  Assert.assertEquals(c, 1);
  }
}
