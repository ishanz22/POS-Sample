package lk.ijse.pos.dao;

import lk.ijse.pos.db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CrudUtil {

    private static PreparedStatement getPreparedStatement(String sql, Object... param) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);

        for (int i=0; i<param.length; i++) {
            pstm.setObject((i+1), param[i]);
        }

        return pstm;
    }

    public static boolean executeUpdate(String sql, Object...param) throws Exception {
        return getPreparedStatement(sql,param).executeUpdate()>0;
    }

    public static ResultSet executeQuery(String sql, Object... param) throws Exception {
        return getPreparedStatement(sql, param).executeQuery();
    }
}