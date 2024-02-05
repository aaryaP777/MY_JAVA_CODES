public class social_platform {
    private String user;
    private int followers;
    private int posts;
    private String comments;

    public String getUser() {
        return user;
    }

    public int getPosts() {
        return posts;
    }

    public int getFollowers() {
        return followers;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void display() {
        System.out.println("Username is: " + user);
        System.out.println("Followers : " + followers);
        System.out.println("Posts: " + posts);
        System.out.println("Comments: " + comments);
    }

    public static void main(String[] args) {
        social_platform user1 = new social_platform();
        user1.setUser("OP_dude");
        user1.setComments("None");
        user1.setFollowers(400);
        user1.setPosts(40);
        user1.display();
    }

}
