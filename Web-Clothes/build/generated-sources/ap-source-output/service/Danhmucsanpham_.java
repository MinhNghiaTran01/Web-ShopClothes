package service;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import service.Sanpham;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-05-09T16:17:42")
@StaticMetamodel(Danhmucsanpham.class)
public class Danhmucsanpham_ { 

    public static volatile SingularAttribute<Danhmucsanpham, String> theloai;
    public static volatile SingularAttribute<Danhmucsanpham, String> tenLoaiSanPham;
    public static volatile CollectionAttribute<Danhmucsanpham, Sanpham> sanphamCollection;
    public static volatile SingularAttribute<Danhmucsanpham, Integer> idDanhMucSanPham;

}