package ru.netology.domain;

public class PostSource {
    private String type;
    private String platform;
    private String data;
    private String url;

    public String getType() {
        return type;
    }

    public String getData() {
        return data;
    }

    public String getPlatform() {
        return platform;
    }

    public String getUrl() {
        return url;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
