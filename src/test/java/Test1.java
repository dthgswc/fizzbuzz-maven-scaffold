import static org.hamcrest.core.Is.is;

import org.junit.Assert;
import org.junit.Test;
public class Test1 {
	public void chN(int i,String s){
		Assert.assertThat(new GamN(i).toString(), is(s));
	}
	@Test
	public void ch()
	{
		chN(15, "fizzbuzz");
		chN(5, "buzz");
		chN(3, "fizz");
	}
}
