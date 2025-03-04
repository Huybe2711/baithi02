/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DbContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.TheLoai;

/**
 *
 * @author ADMIN
 */
public class TheLoaiDao { Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public ArrayList<TheLoai> getAll() {
        ArrayList<TheLoai> ds = new ArrayList<>();
        String sql = "select * from Loai";
        conn = DbContext.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ds.add(new TheLoai(rs.getInt(1),rs.getString(2)));
            }
        } catch (SQLException ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return ds;
    }
    
}
