begin;

CREATE TABLE links
(
  id serial NOT NULL,
  fullLink character varying(50) NOT NULL,
  shortLink character varying(50) NOT NULL,
  CONSTRAINT profile_id_pk PRIMARY KEY (id)
);

insert into links (fullLink, shortLink) values ('mem', 'lol');

commit;