package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.Tweet;
import android.test.ActivityInstrumentationTestCase2;
import junit.framework.TestCase;


public class AbstactTweetTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public AbstactTweetTest()
	{		
		super(LonelyTwitterActivity.class);
	}
	
	public void testIsFive(){
		assertEquals("five is five", 5, 5);
	}
	
	public void testAbstractTweet() {
		Tweet t = new Tweet("Hello");
		String actual = t.getTweetBody();
		assertEquals("Tweet body is the same", "Hello", actual);
		Tweet t2 = new Tweet("Hello");
		assertEquals("Same Tweets", t, t2);		
		//should fail
		//assertSame("Same Tweets", t, t2);
	}

}
