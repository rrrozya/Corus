package ru.rozovsky.corus.linkshortener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/link", produces = MediaType.APPLICATION_JSON_VALUE)
public class LinkController {
    private final LinkService linkService;

    @Autowired
    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping(value = "/{linkId:\\d+}")
    public Link getLink(@PathVariable int linkId) {
        return linkService.getLink(linkId);
    }
}
