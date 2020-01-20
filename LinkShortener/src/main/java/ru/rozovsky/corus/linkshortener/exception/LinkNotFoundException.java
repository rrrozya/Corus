package ru.rozovsky.corus.linkshortener.exception;


public class LinkNotFoundException extends RuntimeException {
    private final int linkId;

    public LinkNotFoundException(int personId) {
        this.linkId = personId;
    }

    @Override
    public String getMessage() {
        return "Link with id = " + linkId + " not found";
    }
}