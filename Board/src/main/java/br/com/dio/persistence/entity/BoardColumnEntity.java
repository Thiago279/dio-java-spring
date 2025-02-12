package br.com.dio.persistence.entity;

import lombok.Data;

@Data
public class BoardColumnEntity {
    public Long id;
    public String name;
    public int order;
    public BoardColumnKindEnum kind;
    private BoardEntity board = new BoardEntity();


}
