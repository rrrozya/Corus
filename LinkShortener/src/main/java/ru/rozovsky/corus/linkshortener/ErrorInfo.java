package ru.rozovsky.corus.linkshortener;

public class ErrorInfo {

    private String message;

    public ErrorInfo(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}