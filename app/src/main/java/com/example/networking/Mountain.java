package com.example.networking;

public class Mountain {
    private String ID;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    private int size;
    private int cost;
    private AuxData auxdata;

    public static class AuxData {
        private String wiki;
        private String img;

        public String getWiki() { return wiki; }
        public void setWiki(String wiki) { this.wiki = wiki; }
        public String getImg() { return img; }
        public void setImg(String img) { this.img = img; }
    }
}