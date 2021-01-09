public class BaseAdvertising {
    private static int idCounter = 1;
    protected int id;
    protected int views;
    protected int clicks;

    public BaseAdvertising() {
        this.id = idCounter;
        idCounter++;
        this.views = 0;
        this.clicks = 0;
    }

    public int getViews() {
        return views;
    }

    public int getClicks() {
        return clicks;
    }

    public void incViews() {
        this.views++;
    }

    public void incClicks() {
        this.clicks++;
    }

    public String describeMe() {
        return "This is base advertise class";
    }
}
