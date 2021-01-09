public class Advertiser extends BaseAdvertising {

    private String name;
    private static int totalClicks = 0;

    public Advertiser(int id, String name) {
        super();
        this.name = name;
        this.id = id;
    }

    @Override
    public String describeMe() {
        return "This class is for an Advertiser";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String help() {
        return "Fields of this class are name,id,clicks ,and views ";
    }

    public static int getTotalClicks() {
        return totalClicks;
    }

    @Override
    public void incClicks() {
        super.incClicks();
        totalClicks++;
    }
}
