package vladislav.templates.proxy;

public class MainApp {
    public static void main(String[] args) {
        Application users = new VkNetworkProxy("Vlad");
        users.read();
    }
}
