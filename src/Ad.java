public class Ad extends BaseAdvertising {

    private String title;
    private String imgUrl;
    private String links;
    private Advertiser advertiser;


    public Ad(String title, String imgUrl, String links, Advertiser advertiser) {
        this.title = title;
        this.imgUrl = imgUrl;
        this.links = links;
        this.advertiser = advertiser;
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
        return null;
    }
}
