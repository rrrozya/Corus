package ru.rozovsky.corus.linkshortener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.rozovsky.corus.linkshortener.exception.LinkNotFoundException;

@Primary
@Service
public class LinkServiceImpl implements LinkService {

    private final LinkDao linkDao;

    @Autowired
    public LinkServiceImpl(LinkDao linkDao) {
        this.linkDao = linkDao;
    }

    @Override
    public Link getLink(int linkId) {
        return linkDao.getLinkById(linkId)
                .orElseThrow(() -> new LinkNotFoundException(linkId));
    }
}