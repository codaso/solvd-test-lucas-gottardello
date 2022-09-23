package database.dao;

import java.util.List;

public interface DAO<T> {
    void insert(T x) throws DAOException;

    void delete(T x) throws DAOException;

    void modify(T x) throws DAOException;

    T retrieve(int a) throws DAOException;

    List<T> retrieveAll() throws DAOException;
}
