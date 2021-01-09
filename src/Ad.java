public class Ad extends BaseAdvertising {

    private String title;
    private String imgUrl;
    private String links;
    private Advertiser advertiser;


    public Ad(int id, String title, String imgUrl, String links, Advertiser advertiser) {
        super();
        this.title = title;
        this.imgUrl = imgUrl;
        this.links = links;
        this.advertiser = advertiser;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public Advertiser getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }

    @Override
    public String describeMe() {
        return "Ad with id:" + this.id;
    }

    @Override
    public void incViews() {
        super.incViews();
        this.advertiser.incViews();
    }

    @Override
    public void incClicks() {
        super.incClicks();
        this.advertiser.incClicks();
    }
}
