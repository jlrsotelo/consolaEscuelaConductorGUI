package persistence;

import clases.Establishment;
import util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstablishmentDBImpl implements EstablishmentDB {
    private final String SQL_INSERT ="insert into ESTABLISHMENT(CESTABLISHMENT, CUBIGEO, NRUC, TYPE, NAME, ADDRESS, STATE, EMAIL, PHONE) values (SEQ_ESTABLISHMENT.NEXTVAL,?,?,?,?,?,?,?,?)";
    private final String SQL_SELECT_ALL ="{call PKG_ESTABLISHMENT.SP_LIST_ALL(?)}";
    @Override
    public List<Establishment> list() throws SQLException {
        DBUtil db = new DBUtil();
        try{
            Connection cn = db.conectar();
            CallableStatement cs = cn.prepareCall(SQL_SELECT_ALL);
            cs.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            cs.executeQuery();
            ResultSet rs = (ResultSet) cs.getObject(1);
            List<Establishment> establishments = new ArrayList<>();
            while (rs.next()) {
                Establishment establishment = new Establishment();
                establishment.setcEstablishment(rs.getLong("CESTABLISHMENT"));
                establishment.setcUbigeo(rs.getString("CUBIGEO"));
                establishment.setnRuc(rs.getString("NRUC"));
                establishment.setType(rs.getString("TYPE"));
                establishment.setName(rs.getString("NAME"));
                establishment.setAddress(rs.getString("ADDRESS"));
                establishment.setState(rs.getString("STATE"));
                establishment.setEmail(rs.getString("EMAIL"));
                establishment.setPhone(rs.getString("PHONE"));
                establishments.add(establishment);
            }
            rs.close();
            cs.close();
            cn.close();
            return establishments;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Boolean add(Establishment establishment) throws SQLException {
        DBUtil db = new DBUtil();
        try {
            Connection cn = db.conectar();
            PreparedStatement ps = cn.prepareStatement(SQL_INSERT);
            ps.setString(1, establishment.getcUbigeo());
            ps.setString(2, establishment.getnRuc());
            ps.setString(3, establishment.getType());
            ps.setString(4, establishment.getName());
            ps.setString(5, establishment.getAddress());
            ps.setString(6, establishment.getState());
            ps.setString(7, establishment.getEmail());
            ps.setString(8, establishment.getPhone());
            ps.executeUpdate();
            ps.close();
            cn.close();
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
