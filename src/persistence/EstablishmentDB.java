package persistence;

import clases.Establishment;

import java.sql.SQLException;
import java.util.List;

public interface EstablishmentDB {
    List<Establishment> list() throws SQLException;

    Boolean add(Establishment establishment) throws SQLException;

}
