gói  lab3 ;

nhập  java . sử dụng . Máy quét ;
nhập  java . lang thang . Toán ;

lớp  Diễm {
    riêng tư
        gấp đôi  x , y ;
    công cộng
         Đầu vào máy quét = Máy quét mới  ( System . in );
        void  Nhapdiem () {
            Hệ thống . ra . in ( "x=" );
            x = đầu vào . nextInt ();
            Hệ thống . ra . in ( "y=" );
            y = đầu vào . nextInt ();
        }
        double  DoDai ( Diem  A , Diem  B ) {
            trả lại  Toán học . sqrt ( Math . pow (( B . x - A . x ), 2 ) + Math . pow (( B . y - A . y ), 2 ));
        }
}

class  TamGiac  extends  Diem {
    riêng tư
        Diem  A = diem mới  (), B = diem mới (), C = diem mới ();  
    công cộng
         Đầu vào máy quét = Máy quét mới  ( System . in );
        void  NhapTG () {
            A. _ Nhapdiem ();
            B. _ Nhapdiem ();
            C. _ Nhapdiem ();
        }
        boolean  KiemTra () {
            if ( DoDai ( A , B ) + DoDai ( B , C ) > DoDai ( C , A ) && DoDai ( B , C ) + DoDai ( C , A ) > DoDai ( A , B )
            && DoDai ( C , A ) + DoDai ( A , B ) > DoDai ( B , C )) trả về  true ;
            khác  trả về  sai ;
        }
        gấp đôi  ChuVi () {
            trở lại ( DoDai ( A , B ) + DoDai ( B , C ) + DoDai ( C , A ));
        }
        double  DienTich () {
            double  p = (( DoDai ( A , B ) + DoDai ( B , C ) + DoDai ( C , A ))/ 2 );
            trả lại  Toán học . sqrt ( p * ( p - DoDai ( A , B )) * ( p - DoDai ( B , C )) * ( p - DoDai ( C , A )));
        }
}

class  DuongTron  extends  Diem {
    riêng tư
        Diem  O = diem moi  ();
        nhân đôi  r ;
    công cộng
        void  NhapDT () {
            Hệ thống . ra . print ( "Nhap Toa Do Tam: " );
            Ô . Nhapdiem ();
            Hệ thống . ra . print ( "Nhap Ban Kinh: " );
            r = đầu vào . nextDouble ();
        }
        gấp đôi  ChuVi () {
            quay lại ( 2 * 3,14 * r );
        }
        double  DienTich () {
            quay lại ( 3.14 * r * r );
        }
}

 lớp  công khai b32 {
    public  static  void  main ( String [] args ) {
        TamGiac  ABC = new  TamGiac ();
        ABC . NhapTG ();
        if ( ABC . KiemTra () ) System . ra . println ( "ABC la Tam Giác" );
         Hệ thống khác . ra . print ( "ABC Không Phái Tam Giác" );
        Hệ thống . ra . println ( "Chu Vi Tam Giac la:" + ABC . ChuVi ());
        Hệ thống . ra . println ( "Dien Tích Tam Giác la:" + ABC . DienTich ());

        DuongTron  O = new  DuongTron ();
        Ô . NhapDT ();
        Hệ thống . ra . println ( "Chu Vi Duong Trong la:" + O . ChuVi ());
        Hệ thống . ra . println ( "Dien tich Duong tran la:" + O . DienTich ());
    }
}
chân trang
© 2023 GitHub, Inc.
hướng chân trang
Điều kiện
Sự riêng tư
Bảo vệ