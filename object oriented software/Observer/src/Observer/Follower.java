package Observer;

public class Follower implements Observer {
    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    // This method will be called to update all followers regarding the new tweet posted by the celebrity.
    @Override
    public void update(String celebrityName, String tweet) {
        System.out.println(followerName + " has received " + celebrityName + "'s tweet :: " + tweet);
    }

    @Override
    public String toString() {
        return followerName;
    }

}
