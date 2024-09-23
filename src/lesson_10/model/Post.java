package lesson_10.model;

public class Post {

    private String title;
    private String text;
    private String photo;

    public Post(Builder builder) {
        this.title = builder.getTitle();
        this.text = builder.getText();
        this.photo = builder.getPhoto();
    }



}
