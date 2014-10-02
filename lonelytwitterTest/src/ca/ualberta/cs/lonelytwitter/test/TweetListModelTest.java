package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;
import ca.ualberta.cs.lonelytwitter.AbstractTweet;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.Tweet;
import ca.ualberta.cs.lonelytwitter.data.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;




public class TweetListModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{
	private TweetListModel testList;
	public TweetListModelTest()
	{
		super(LonelyTwitterActivity.class);		
	}	
	
	public void testCount()
	{
		assertEquals("Test counter1", 1, testList.getCount());
	}
	
	public void testDuplicate()
	{					
		testList.addTweet(new Tweet("Test1"));		
		assertEquals("Test counter2", 1, testList.getCount());
	}		
	
	public void testHas()
	{
		assertTrue("Test Has", testList.hasTweet(new Tweet("Test1")));
	}
	
	public void testGetAll()
	{		
		AbstractTweet[] tweets = {new Tweet("Test1"), new Tweet("Test0")};
		testList.addTweet(new Tweet("Test0"));
		AbstractTweet[] actualTweets = testList.getTweets();
		int counter = 0;
		for (AbstractTweet test : tweets)
		{
			assertEquals(actualTweets[counter], test);
			counter++;
		}
	}
	
	public void testRemove()
	{
		testList.addTweet(new Tweet("Test0"));
		assertTrue("Test remove", testList.hasTweet(new Tweet("Test0")));		
		testList.removeTweet(new Tweet("Test0"));		
		assertTrue("Test remove", !testList.hasTweet(new Tweet("Test0")));
	}
	
	@Override
    protected void setUp() throws Exception
    {
    	testList = new TweetListModel(new ArrayList<AbstractTweet>());
    	testList.addTweet(new Tweet("Test1"));
    }
	
	
}