-- Table: public.usersimples

-- DROP TABLE public.usersimples;

CREATE TABLE public.usersimples
(
    id_usersimple bigint NOT NULL DEFAULT nextval('usersimples_id_usersimple_seq'::regclass),
    civilite character varying(255) COLLATE pg_catalog."default",
    email character varying(255) COLLATE pg_catalog."default",
    login character varying(255) COLLATE pg_catalog."default" NOT NULL,
    mdp character varying(255) COLLATE pg_catalog."default" NOT NULL,
    nom character varying(255) COLLATE pg_catalog."default" NOT NULL,
    prenom character varying(255) COLLATE pg_catalog."default" NOT NULL,
    profil character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT usersimples_pkey PRIMARY KEY (id_usersimple),
    CONSTRAINT unicite_login_mdp UNIQUE (login, mdp)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.usersimples
    OWNER to postgres;

-- Index: index_login_mdp

-- DROP INDEX public.index_login_mdp;

CREATE INDEX index_login_mdp
    ON public.usersimples USING btree
    (login COLLATE pg_catalog."default", mdp COLLATE pg_catalog."default")
    TABLESPACE pg_default;

-- Index: index_nom_prenom

-- DROP INDEX public.index_nom_prenom;

CREATE INDEX index_nom_prenom
    ON public.usersimples USING btree
    (nom COLLATE pg_catalog."default", prenom COLLATE pg_catalog."default")
    TABLESPACE pg_default;