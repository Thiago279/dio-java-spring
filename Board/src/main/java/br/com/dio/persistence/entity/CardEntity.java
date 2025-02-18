package br.com.dio.persistence.entity;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class CardEntity {

    public Long id;
    public String title;
    public String description;
    private BoardColumnEntity boardColumn = new BoardColumnEntity();
}
