package lesson_10.model;

public class Builder {

    private String title;
    private String text;
    private String photo;

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getPhoto() {
        return photo;
    }

    public Builder title(String title) {
        this.title = title;
        return this;
    }

    public Builder text(String text) {
        this.text = text;
        return this;
    }

    public Builder photo(String photo) {
        this.photo = photo;
        return this;
    }

    public Post build() {
        Builder builder = this;
        return new Post(builder);
    }

}
