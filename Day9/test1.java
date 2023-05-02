package selenium_day9;

import org.testng.annotations.Test;
import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class test1 {
	int a,b,c;
  @Test(dataProvider = "dp")
  public void add(Integer a,Integer b) {
	  c=a+b;
	  Assert.assertEquals(c,6);
	  System.out.println("Add = "+c+" ");
  }
  @Test(dataProvider = "dp")
  public void sub(Integer a,Integer b) {
	  c=a-b;
	  Assert.assertEquals(c,2);
	  System.out.println("subtract = "+c+" ");
  }
  @Test(dataProvider = "dp")
  public void mul(Integer a,Integer b) {
	  c=a*b;
	  Assert.assertEquals(c,8);
	  System.out.println("multiply = "+c+" ");
  }
  @Test(dataProvider = "dp")
  public void div(Integer a,Integer b) {
	  c=a/b;
	  Assert.assertEquals(c,2);
	  System.out.println("division = "+c+" ");
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 4, 2 },
      //new Object[] { 2, 4 },
    };
  }
}
