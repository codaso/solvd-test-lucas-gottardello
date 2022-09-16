package com.lucas.solvd.database.daoMySql;

import com.lucas.solvd.database.dao.DAOException;
import com.lucas.solvd.database.dao.PlayerDAO;
import com.lucas.solvd.database.models.Players;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MySqlPlayersDAO implements PlayerDAO {
    final String CREATE = "INSERT INTO Players (name,lastname,country) VALUES (?,?,?)";
    final String UPDATE = "UPDATE Players SET name=?, lastname=?, country=? WHERE id=?";
    final String DELETE = "DELETE FROM Players WHERE id=?";
    final String READ = "SELECT id, name, lastname, country, countries_id FROM Players WHERE id=?";
    final String READALL = "SELECT * FROM Players";

    private Connection connection = null;

    public MySqlPlayersDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Players x) throws DAOException {
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement(CREATE);
            st.setString(1, x.getName());
            st.setString(2, x.getLastname());
            st.setString(3, x.getCountry());
            if (st.executeUpdate() == 0) {
                throw new DAOException("SQL error on statement: executeUpdate");
            }
        } catch (SQLException e) {
            throw new DAOException("SQL error: ", e);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    throw new DAOException("SQL error on statement: close", e);
                }
            }
        }
    }

    @Override
    public void delete(Players x) {

    }

    @Override
    public void modify(Players x) {

    }

    @Override
    public Players retrieve(int a) {
        return null;
    }

    @Override
    public List<Players> retrieveAll() {
        return null;
    }
}
