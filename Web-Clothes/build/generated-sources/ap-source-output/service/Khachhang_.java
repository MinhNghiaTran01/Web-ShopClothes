package service;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import service.Account;
import service.Danhsachhoadon;
import service.Giohang;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-05-09T16:17:42")
@StaticMetamodel(Khachhang.class)
public class Khachhang_ { 

    public static volatile SingularAttribute<Khachhang, String> diaChi;
    public static volatile SingularAttribute<Khachhang, String> sdt;
    public static volatile CollectionAttribute<Khachhang, Giohang> giohangCollection;
    public static volatile SingularAttribute<Khachhang, String> tenKhachHang;
    public static volatile SingularAttribute<Khachhang, String> gioiTinh;
    public static volatile SingularAttribute<Khachhang, String> email;
    public static volatile SingularAttribute<Khachhang, Account> account;
    public static volatile CollectionAttribute<Khachhang, Danhsachhoadon> danhsachhoadonCollection;

}