import java.util.Arraylist;

public class EventPost {

    private String author;
    private long timeStamp;
    private int pages;
    private int likes;
    private ArrayList<String> comments;
    private ArrayList<EventPost> events;

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

    public String getImageFile() {
        return filename;
    }

    public long getTimeStamp() {
        return timestamp;
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