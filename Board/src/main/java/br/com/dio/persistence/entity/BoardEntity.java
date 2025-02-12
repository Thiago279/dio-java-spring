package br.com.dio.persistence.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BoardEntity {

    public Long id;
    public String name;
    private List<BoardColumnEntity> boardColumns = new ArrayList<>();


}
