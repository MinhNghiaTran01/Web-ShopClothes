package service;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import service.Chitiethoadon;
import service.Danhmucsanpham;
import service.Danhsachhoadon;
import service.Giohang;
import service.Kichco;
import service.Mau;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-05-09T16:17:42")
@StaticMetamodel(Sanpham.class)
public class Sanpham_ { 

    public static volatile SingularAttribute<Sanpham, String> img;
    public static volatile CollectionAttribute<Sanpham, Chitiethoadon> chitiethoadonCollection;
    public static volatile SingularAttribute<Sanpham, Float> giaBan;
    public static volatile SingularAttribute<Sanpham, Float> giamGia;
    public static volatile SingularAttribute<Sanpham, String> title;
    public static volatile SingularAttribute<Sanpham, String> ngayNhap;
    public static volatile CollectionAttribute<Sanpham, Danhsachhoadon> danhsachhoadonCollection;
    public static volatile SingularAttribute<Sanpham, Integer> idSanPham;
    public static volatile SingularAttribute<Sanpham, Mau> idMau;
    public static volatile CollectionAttribute<Sanpham, Giohang> giohangCollection;
    public static volatile CollectionAttribute<Sanpham, Kichco> kichcoCollection;
    public static volatile SingularAttribute<Sanpham, String> moTa;
    public static volatile SingularAttribute<Sanpham, Danhmucsanpham> idDanhMucSanPham;

}