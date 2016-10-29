package hello;

/**
 * DTO
 * Created by Vladimir on 29.10.2016.
 */
class Greeting {
    private int id;
    private String content;

    Greeting(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
