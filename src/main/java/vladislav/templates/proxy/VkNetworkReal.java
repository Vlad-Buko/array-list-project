package vladislav.templates.proxy;

public class VkNetworkReal implements Application{
    private String nameUser;

    public VkNetworkReal(String nameUser) {
        this.nameUser = nameUser;
        loadMessage();
    }

    public void loadMessage () {
        System.out.println("User " + nameUser + " will be loaded");
    }

    @Override
    public void read() {
        System.out.println("Message will be reading");
    }
}
