create table account
(
    id varchar not null
        constraint account_pk
            primary key
);

create table transaction
(
    id  varchar not null
        constraint transaction_pk
            primary key,
    account_id varchar
        constraint transaction_account_id_fk
            references account
);

INSERT INTO public.account (id) VALUES ('1');

INSERT INTO public.transaction (id, account_id) VALUES ('1', '1');