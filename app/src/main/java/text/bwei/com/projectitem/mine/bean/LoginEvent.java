package text.bwei.com.projectitem.mine.bean;



public class LoginEvent {
    private String username;

    public LoginEvent(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
