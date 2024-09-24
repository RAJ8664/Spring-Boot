package roy.raj.demo.practice.RESTAPI.SocialMediaRestAPI;

public class Post {
    private int PostId;
    private String PostMessage;

    public Post() {}
    public Post(int PostId, String PostMessage) {
        this.PostId = PostId;
        this.PostMessage = PostMessage;
    } 

    public int getPostId() {
        return this.PostId;
    }
    public String getPostMessage() {
        return this.PostMessage;
    }

    public void setPostId(int PostId) {
        this.PostId = PostId;
    } 
    public void setPostMessage(String PostMessage) {
        this.PostMessage = PostMessage;
    }

    @Override
    public String toString() {
        return "(" + PostId + " " + PostMessage + ")";
    }
}
