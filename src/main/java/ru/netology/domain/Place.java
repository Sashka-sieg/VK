package ru.netology.domain;

public class Place {
    private int id;
    private String title;
    private int latitude;
    private int longitude;
    private int created;
    private String icon;
    private String checkins;
    private int updated;
    private int type;
    private int contry;
    private int city;
    private String address;

    public int getId() {
        return id;
    }

    public int getCity() {
        return city;
    }

    public int getContry() {
        return contry;
    }

    public int getCreated() {
        return created;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public int getType() {
        return type;
    }

    public int getUpdated() {
        return updated;
    }

    public String getAddress() {
        return address;
    }

    public String getCheckins() {
        return checkins;
    }

    public String getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCheckins(String checkins) {
        this.checkins = checkins;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public void setContry(int contry) {
        this.contry = contry;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }
}
