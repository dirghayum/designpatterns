package com.dmainali.designpatterns.singleton;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class ProductDao {

    public int save(String item) {
        Connection con = Dbconnection.getConnection();
        try {
            String sql = "INSERT INTO item(id,item_name,category, quantity, price) values(?,?,?,?,?) ";
            PreparedStatement stmt = con.prepareStatement(sql);
            //stmt.setInt(1, item.getId());
            return stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
