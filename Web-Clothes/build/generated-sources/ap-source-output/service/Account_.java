package service;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import service.Khachhang;
import service.Nhanvien;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-05-09T16:17:42")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, Khachhang> khachhang;
    public static volatile SingularAttribute<Account, String> password;
    public static volatile SingularAttribute<Account, String> chucvu;
    public static volatile CollectionAttribute<Account, Nhanvien> nhanvienCollection;
    public static volatile SingularAttribute<Account, String> hoatDong;
    public static volatile SingularAttribute<Account, String> username;

}