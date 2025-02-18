--liquibase formatted sql
--changeset thiago:202502121429
-- comment : set unblock_reason nullable

ALTER TABLE BLOCKS MODIFY COLUMN unblock_reason VARCHAR(255) NULL;


--rollback DROP TABLE BLOCKS