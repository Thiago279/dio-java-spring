--liquibase formatted sql
--changeset thiago:202502121341
-- comment : board table create
CREATE TABLE IF NOT EXISTS BOARDS(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
) ENGINE=InnoDB;

--rollback DROP TABLE BOARDS