/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class account {
    private String username,password,hoatDong,chucVu;

    public account() {
    }

    public account( String username, String password, String hoatDong,String chucVu) {
        this.chucVu = chucVu;
        this.username = username;
        this.password = password;
        this.hoatDong = hoatDong;
    }

    public String getchucVu() {
        return chucVu;
    }

    public void setchucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHoatDong() {
        return hoatDong;
    }

    public void setHoatDong(String hoatDong) {
        this.hoatDong = hoatDong;
    }
    
    
}
