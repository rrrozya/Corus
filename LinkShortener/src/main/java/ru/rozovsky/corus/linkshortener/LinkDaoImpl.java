package ru.rozovsky.corus.linkshortener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class LinkDaoImpl implements LinkDao {

    private static final String SQL_GET_LINK_BY_ID =
            "select id, fullLink, shortLink from links where id = :id";

    private final LinkMapper linkMapper;
    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public LinkDaoImpl(
            LinkMapper linkMapper,
            NamedParameterJdbcTemplate jdbcTemplate
    ) {
        this.linkMapper = linkMapper;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Optional<Link> getLinkById(int id) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);
        try {
            return Optional.ofNullable(
                    jdbcTemplate.queryForObject(
                            SQL_GET_LINK_BY_ID,
                            params,
                            linkMapper
                    )
            );
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }
}