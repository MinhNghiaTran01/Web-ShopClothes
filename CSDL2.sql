use clothes;

alter table danhsachhoadon
add column thanhtien int;
alter table danhsachhoadon
add column soluong int;
delete from danhsachhoadon where idDSHD=1;

insert into danhsachhoadon(idDSHD, idSanPham, soDienThoaiKH, idNhanVien, ngayBan, thanhtien, soluong) values
(1, 1, '0123456789', 1, '20/4/2021', 800000, 1),
(2, 2, '0123456789', 1, '28/4/2021', 1600000, 2),
(3, 1, '0123456789', 1, '25/2/2022', 800000,1),
(4, 8, '0932123455', 2, '20/4/2021', 1200000,1),
(5, 8, '0932123455', 3, '21/6/2022', 2400000,2),
(6, 25, '0932123455', 1, "16/4/2022", 390000,1),
(7, 25, '0932123455', 2, "20/8/2022", 780000,2),
(8, 1, '0945678901', 1, "25/4/2021", 800000,1),
(9, 2, '0945678901', 1, "28/6/2021", 800000,1),
(10, 25, '0945678901', 1, "12/12/2021", 390000,1),
(11, 27, '0945678901', 1, "1/4/2022", 600000,2),
(12, 40, '0945678901', 1, "20/4/2021", 500000,1),
(13, 41, '0945678901', 1, "20/4/2021", 1286000,1),
(14, 1, '0969357021', 1, "28/7/2021", 800000,1),
(15, 2, '0969357021', 1, "26/5/2021", 800000,1),
(16, 41, '0969357021', 1, "27/8/2021", 1286000, 1),
(17, 3, '0978112233', 3, "20/4/2021", 1000000, 1),
(18, 25, '0978112233', 1, "28/8/2021", 780000, 2),
(19, 40, '0987654321', 2, "12/4/2022", 500000,1),
(20, 41, '0987654321', 3, "12/4/2022", 1286000,1);

SELECT idDSHD, idSanPham, soDienThoaiKH, idNhanVien, ngayBan, thanhtien, soluong FROM danhsachhoadon