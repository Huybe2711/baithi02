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
import model.SanPham;

/**
 *
 * @author ADMIN
 */
public class SanPhamDao {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public ArrayList<SanPham> getTop9() {
        ArrayList<SanPham> ds = new ArrayList<>();
        String sql = "select top 6 * from Hoa order by gia desc";
        conn = DbContext.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ds.add(new SanPham(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getInt(5), rs.getDate(6)));
            }
        } catch (SQLException ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return ds;
    }
    //Phương thức đọc hoa theo thể loại
    public ArrayList<SanPham> getByCategoryId(int maloai) {
        ArrayList<SanPham> ds = new ArrayList<>();
        String sql = "select * from Hoa where maloai=?";
        conn = DbContext.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, maloai);
            rs = ps.executeQuery();
            while (rs.next()) {
                ds.add(new SanPham(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getInt(5), rs.getDate(6)));
            }
        } catch (SQLException ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return ds;
    }
    public ArrayList<SanPham> getByPage(int pageIndex, int pageSize) {
        ArrayList<SanPham> ds = new ArrayList<>();
        String sql = "select * from Hoa order by mahoa OFFSET ? ROWS FETCH NEXT ? ROWS ONLY ";
        conn = DbContext.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,(pageIndex-1)*pageSize);
             ps.setInt(2, pageSize);
             rs = ps.executeQuery();
            while (rs.next()) {
                ds.add(new SanPham(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getInt(5), rs.getDate(6)));
            }
        } catch (SQLException ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return ds;
    }
    //phuong thuc doc tat ca san pham (Hoa) từ CSDL
    public ArrayList<SanPham> getAll() {
        ArrayList<SanPham> ds = new ArrayList<>();
        String sql = "select * from Hoa";
        conn = DbContext.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ds.add(new SanPham(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getInt(5), rs.getDate(6)));
            }
        } catch (SQLException ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return ds;
    }
    public static void main(String[] args) {
        SanPham sanpham = new SanPham();
        System.out.println("Lay trang 1");
        int pageSize =5;
        ArrayList<SanPham> dsHoa = sanpham.getByPage(2, pageSize);
        for ( SanPham sanpham : dsSanPham) {
            System.out.println(sanpham);
        }


    
}
