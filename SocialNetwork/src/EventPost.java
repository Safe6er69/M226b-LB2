import java.util.Arraylist;

public class EventPost {

    private String author;
    private long timeStamp;
    private int pages;
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

    public String getImageFile() {
        return filename;
    }

    public long getTimeStamp() {
        return timestamp;
    }
}