package org.test.mytest;

/**
 * Created by Alexander_Petrovskiy on 5/24/2016.
 */
public enum NavigationLinks {
    Regions,
    UsPolitics("U.S. Politics"),
    Money,
    Entertainment,
    Tech,
    Sport,
    Travel,
    Style,
    Features,
    Video;

    public String value;

    NavigationLinks(String value) {
        this.value = value;
    }
    NavigationLinks() {
        this.value = toString();
    }
}
