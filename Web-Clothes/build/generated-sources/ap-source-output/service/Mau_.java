package service;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import service.Sanpham;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-05-09T16:17:42")
@StaticMetamodel(Mau.class)
public class Mau_ { 

    public static volatile SingularAttribute<Mau, Integer> idMau;
    public static volatile SingularAttribute<Mau, String> mau;
    public static volatile CollectionAttribute<Mau, Sanpham> sanphamCollection;

}