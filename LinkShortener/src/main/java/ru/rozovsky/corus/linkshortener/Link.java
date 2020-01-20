package ru.rozovsky.corus.linkshortener;

public class Link {
    private int id;
    private String fullLink;
    private String shortLink;

    Link(String fullLink) {
        this.fullLink = fullLink;
        this.shortLink = new LinkGenerator().generateShortLink(fullLink);
    }

    public int getId() { return id; }

    public String getFullLink() {
        return fullLink;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullLink(String fullLink) {
        this.fullLink = fullLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

}
