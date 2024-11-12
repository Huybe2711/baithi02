/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class SanPham {
     private int masp;
    private String tensp;
    private double dongia;
    private String hinh;
    private int maloai;
    private Date ngaycapnhat;
    
    public SanPham(){
        
    }
     public SanPham(int masp) {
        this.masp = masp;
    }
     public SanPham(int masp, String tensp, double dongia, String hinh, int maloai, Date ngaycapnhat) {
        this.masp = masp;
        this.tensp = tensp;
        this.dongia = dongia;
        this.hinh = hinh;
        this.maloai = maloai;
        this.ngaycapnhat = ngaycapnhat;
    }
     public int getMaSanPham() {
        return masp;
    }

    public void setMaSanPham(int masp) {
        this.masp = masp;
    }

    public String getTenSanPham() {
        return tensp;
    }

    public void setTenhoa(String tenhoa) {
        this.tensp = tensp;
    }

    public double getDonGia() {
        return dongia;
    }

    public void setDonGia(double Dongia) {
        this.dongia = dongia;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public int getMaloai() {
        return maloai;
    }

    public void setMaloai(int maloai) {
        this.maloai = maloai;
    }

    public Date getNgaycapnhat() {
        return ngaycapnhat;
    }

    public void setNgaycapnhat(Date ngaycapnhat) {
        this.ngaycapnhat = ngaycapnhat;
    }

    @Override
    public String toString() {
        return "SanPham{" + "masp=" + masp + ", tensp=" + tensp + ", dongia=" + dongia + ", hinh=" + hinh + ", maloai=" + maloai + ", ngaycapnhat=" + ngaycapnhat + '}';
    }

    public ArrayList<SanPham> getByPage(int i, int pageSize) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    
}
