package lk.ijse.pos.dao;

import lk.ijse.pos.db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CrudUtil {

    private static PreparedStatement getPreparedStatement(String sql,Object...params) throws Exception {
        Connection connection= DBConnection.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);

        for (int i = 0; i <params.length ; i++) {
            stm.setObject((i+1),params[i]);

        }
        return stm;
    }

    public static boolean executeUpdate(String sql,Object...params) throws Exception {
        PreparedStatement stm=getPreparedStatement(sql,params);
        return stm.executeUpdate()>0;
    }
    public static ResultSet executeQuery(String sql,Object...params) throws Exception {
        PreparedStatement stm=getPreparedStatement(sql,params);
        return stm.executeQuery();
    }
}
