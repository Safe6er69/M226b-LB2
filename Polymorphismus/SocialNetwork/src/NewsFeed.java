import java.util.ArrayList;

public class NewsFeed {
	
	
	private ArrayList<MessagePost> messages;
	private ArrayList<PhotoPost> photos;
	
	
	public NewsFeed() {
		
		messages = new ArrayList<>();
		photos = new ArrayList<>();
	}


	public void addPost(Post newpost) { posts.add(newpost); }
	
	public void show() {
		
		for(MessagePost message : messages) {
			message.display();
			System.out.println();
		}
		
		for(PhotoPost photo : photos) {
			photo.display();
			System.out.println();
		}
		
	}

}
