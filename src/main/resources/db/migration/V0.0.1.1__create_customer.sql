
CREATE TABLE public.customer
(
    id_customer bigint NOT NULL DEFAULT nextval('customer_id_customer_seq'::regclass),
    name_customer character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT customer_pkey PRIMARY KEY (id_customer)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.customer
    OWNER to postgres;