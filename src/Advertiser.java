public class Advertiser extends BaseAdvertising {

    private String name;

    public Advertiser(String name) {
        super();
        this.name = name;
    }

    @Override
    public String describeMe() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
