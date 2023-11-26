import java.util.Arraylist;

public abstract class Post {

    private String username;
    private String filename;
    private String caption;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    public EventPost(String author, String text) {

        username= author;
        message = text;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }

    public void addComment(String text) {
        comments.add(text);
    }

    public long getTimeStamp() {
        return timestamp;
    }

    public void like() {
        likes++;
    }


    public void unlike() {
        if (likes > 0){
            likes--;
        }
    }

    private String timeString() {

        long current = System.currentTimeMillis();
        long pastMillis = current - timestamp;
        long seconds = pastMillis/1000;
        long minutes = seconds/60;
        long hours = minutes/60;
        if (minutes > 0) {
            return minutes + " minutes ago";
        } else if(hours > 0){
            return hours + " hours ago";
        } else {
            return "a few seconds ago";
        }

    }

}