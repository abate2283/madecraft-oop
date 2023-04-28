package JDBC;

import java.util.List;
import java.util.Optional;
import java.util.TimerTask;

public interface DAO<T> {
    void save (T t);
    Optional<T> retrieveVersionNumber(int id);
    void update(T t); // will update an object with the id = t;
    void delete(T t);
    List<T> getAll();
}
