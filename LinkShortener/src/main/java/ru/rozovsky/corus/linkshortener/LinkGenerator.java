package ru.rozovsky.corus.linkshortener;

public class LinkGenerator {
    private static final long b = 378551L & 0xffffffffL;

    public String generateShortLink(String link) {
        long a = 63689L & 0xffffffffL;
        long hash = 0;
        for (int i = 0; i < link.length(); i++) {
            hash = (hash & 0xffffffffL) * (a & 0xffffffffL);
            hash = (hash & 0xffffffffL) + (link.charAt(i) & 0xffffffffL);
            a = (a & 0xffffffffL) * (b & 0xffffffffL);
        }
        return Long.toHexString(hash);
    }
}
