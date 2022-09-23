package database.daoMySql;

import database.dao.DAOException;
import database.dao.PlayerDAO;
import database.models.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MySqlPlayerDAO implements PlayerDAO {
    final String CREATE = "INSERT INTO Players (name,lastname,country,gender) VALUES (?,?,?,?)";
    final String UPDATE = "UPDATE Players SET name=?, lastname=?, country=?, gender=? WHERE id=?";
    final String DELETE = "DELETE FROM Players WHERE id=?";
    final String READ = "SELECT id, name, lastname, country, gender, countries_id FROM Players WHERE id=?";
    final String READALL = "SELECT * FROM Players";

    private Connection connection = null;

    public MySqlPlayerDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Player x) throws DAOException {
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement(CREATE);
            st.setString(1, x.getName());
            st.setString(2, x.getLastname());
            st.setString(3, x.getCountry());
            st.setString(4, x.getGender());
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
    public void delete(Player x) {

    }

    @Override
    public void modify(Player x) {

    }

    @Override
    public Player retrieve(int a) {
        return null;
    }

    @Override
    public List<Player> retrieveAll() {
        return null;
    }
}
