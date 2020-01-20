package ru.rozovsky.corus.linkshortener;

import org.springframework.stereotype.Service;
import ru.rozovsky.corus.linkshortener.exception.LinkNotFoundException;

@Service
public class LinkServiceMock implements LinkService {
    @Override
    public Link getLink(int linkId) {
        if (linkId == 123) {
            Link link = new Link("mem");
            link.setId(linkId);
            return link;
        } else {
            throw new LinkNotFoundException(linkId);
        }
    }
}
