package service;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import service.Khachhang;
import service.Nhanvien;
import service.Sanpham;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-05-09T16:17:42")
@StaticMetamodel(Danhsachhoadon.class)
public class Danhsachhoadon_ { 

    public static volatile SingularAttribute<Danhsachhoadon, String> ngayBan;
    public static volatile SingularAttribute<Danhsachhoadon, Nhanvien> idNhanVien;
    public static volatile SingularAttribute<Danhsachhoadon, Integer> idDSHD;
    public static volatile SingularAttribute<Danhsachhoadon, Khachhang> soDienThoaiKH;
    public static volatile SingularAttribute<Danhsachhoadon, Sanpham> idSanPham;

}