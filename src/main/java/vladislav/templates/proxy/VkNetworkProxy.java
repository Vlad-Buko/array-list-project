package vladislav.templates.proxy;

public class VkNetworkProxy implements Application{
    private String nameUser;
    private VkNetworkReal vkNetworkReal;

    public VkNetworkProxy(String nameUser) {
        this.nameUser = nameUser;
    }

    @Override
    public void read() {
        if (vkNetworkReal == null) {
            vkNetworkReal = new VkNetworkReal("Vlad");
        }
        vkNetworkReal.read();
    }
}
