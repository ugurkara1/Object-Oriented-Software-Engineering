package Observer;

public class Main {

	public static void main(String[] args) {
        Celebrity celebrity = new Celebrity("John Doe");
        Follower follower1 = new Follower("Alice");
        Follower follower2 = new Follower("Bob");
        
        celebrity.register(follower1);
        celebrity.register(follower2);
        
        celebrity.tweet("Hello, world!");
        
        celebrity.unregister(follower1);
        
        celebrity.tweet("Goodbye, world!");
    }
}
