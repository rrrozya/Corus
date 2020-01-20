package ru.rozovsky.corus.linkshortener;

import java.util.Optional;

public interface LinkDao {

    Optional<Link> getLinkById(int id);
}