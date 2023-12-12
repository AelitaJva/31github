package com.java.Week14_OOP_Polymorphism;

public class PolymorphismAtMethodParam {
    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        Browser obj = new Safari();
        openWebsiteFromAnyBrowser(chrome, "google.com");
        openWebsiteFromAnyBrowser(obj, "safari.com");
    }

    // I want to be able to openWebsite from any browsers
    // putting here parent class as a param for purpose
    // polymorphism on param method level, where we can define d.t param as the parent class,
    // and which means we can pass any of the child class objects into this method
    // bc overriding and inheriting the common methods we should be able to reuse them here

    public static void openWebsiteFromAnyBrowser (Browser browser, String url) {
        browser.openWebsite(url);
    }
}


// create a program that will dynamically create browsers
// I have Chrome and Safari Browsers
// All browsers should have common methods like
// openWebsite (String url) -> Opening website in Chrome or Safari

// Chrome should have clearCache()
// Safari should have privateBrowsers()


class Browser {
    public void openWebsite (String url) {
        System.out.println("Opening Website in a generic Browser");
    }
}

class Chrome extends Browser  {
    @Override
    public void openWebsite (String url) {
        System.out.println("Opening Website in a Chrome Browser");
    }

    public void clearCache () {
        System.out.println("Clearing cash in Chrome Browser");
    }
}

class Safari extends Browser  {
    @Override
    public void openWebsite (String url) {
        System.out.println("Opening Website in a Safari Browser");
    }

    public void privateBrowsing () {
        System.out.println("PrivatelyBrowsing in Safari");
    }
}