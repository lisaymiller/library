package library;

public class PublishingCompany {

    private String name, website;

    PublishingCompany(String name, String website) {
        this.name = name;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Published by " + this.name + ", you can find more of their publishings at " + this.website;
    }
}