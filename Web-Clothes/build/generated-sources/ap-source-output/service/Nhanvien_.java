package service;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import service.Account;
import service.Chucvu;
import service.Danhsachhoadon;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-05-09T16:17:42")
@StaticMetamodel(Nhanvien.class)
public class Nhanvien_ { 

    public static volatile SingularAttribute<Nhanvien, String> soDienThoai;
    public static volatile SingularAttribute<Nhanvien, String> diaChi;
    public static volatile SingularAttribute<Nhanvien, String> tenNhanVien;
    public static volatile CollectionAttribute<Nhanvien, Chucvu> chucvuCollection;
    public static volatile SingularAttribute<Nhanvien, Integer> idNhanVien;
    public static volatile SingularAttribute<Nhanvien, String> email;
    public static volatile CollectionAttribute<Nhanvien, Danhsachhoadon> danhsachhoadonCollection;
    public static volatile SingularAttribute<Nhanvien, Account> username;

}