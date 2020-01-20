package ru.rozovsky.corus.linkshortener;

import ru.rozovsky.corus.linkshortener.Link;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class LinkMapper implements RowMapper<Link> {

    @Override
    public Link mapRow(ResultSet rs, int rowNum) throws SQLException {
        Link link = new Link(rs.getString("fullLink"));
        link.setId(rs.getInt("id"));
        link.setFullLink(rs.getString("fullLink"));
        return link;
    }
}