package com.example.networking;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("WeakerAccess")
public class Mountain {

    private String title;
    ArrayList<Mountain> items = new ArrayList<>(Arrays.asList(
            new Mountain("Matterhorn"),
            new Mountain("Mont Blanc"),
            new Mountain("Denali")
    ));

    public Mountain(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}