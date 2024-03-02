// Base class Post
class Post {
    public void publish() {
        System.out.println("Post published successfully.");
    }
}

// Subclass TextPost
class TextPost extends Post {
    @Override
    public void publish() {
        System.out.println("Text Post published successfully.");
    }
}

// Subclass ImagePost
class ImagePost extends Post {
    @Override
    public void publish() {
        System.out.println("Image Post published successfully.");
    }
}

// Subclass VideoPost
class VideoPost extends Post {
    @Override
    public void publish() {
        System.out.println("Video Post published successfully.");
    }
}

// Main class
public class PostPublisher {
    public static void main(String[] args) {
        // Example of Post subclasses
        Post textPost = new TextPost();
        textPost.publish();

        Post imagePost = new ImagePost();
        imagePost.publish();

        Post videoPost = new VideoPost();
        videoPost.publish();
    }
}
