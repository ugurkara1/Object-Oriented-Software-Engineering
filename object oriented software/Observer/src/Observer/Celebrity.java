package Observer;

import java.util.ArrayList;

public class Celebrity implements Subject{
	private String celebrityName;  //name of the celebrity
	private ArrayList<Observer> followers;  //list of followers
	public Celebrity(String celebrityName) {
		this.celebrityName = celebrityName;
		followers = new ArrayList<Observer>();
	}
	@Override
	public void register(Observer o) {
		followers.add(o);
		System.out.println(o + " has started following " + celebrityName);		
	}
	@Override
	public void unregister(Observer o) {
		followers.remove(o);
		System.out.println(o + " has stopped following " + celebrityName);		
	}
	@Override
	public void notifyAllObserver(String tweet) {
		for(Observer follower : followers){
			follower.update(celebrityName, tweet);
		}
		System.out.println();		
	}
	 public void tweet(String tweet) {
	        System.out.println("\n" + celebrityName + " has tweeted :: " + tweet + "\n");
	        notifyAllObserver(tweet);
	 }
}