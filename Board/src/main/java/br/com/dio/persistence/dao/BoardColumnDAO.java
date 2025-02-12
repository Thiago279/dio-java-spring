package br.com.dio.persistence.dao;

import br.com.dio.persistence.entity.BoardColumnEntity;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class BoardColumnDAO {

    private Connection connection;
    public BoardColumnEntity insert(final BoardColumnEntity entity) throws SQLException{
        var sql = "INSERT INTO BOARDS_COLUMNS (name, `order`, kind, board_id) VALUES (? , ?, ?, ?);";
        try (var statement = connection.prepareStatement(sql)){
            var i = 1;
            statement.setString(i++, entity.getName());
            statement.setInt(i++, entity.getOrder());
            statement.setString(i++,entity.getKind().name());
            statement.setLong(i++,entity.getBoard().getId());
            statement.executeUpdate();
        }
        return entity;
    }

    public List<BoardColumnEntity> findById(final Long id) throws SQLException{

    }

}
