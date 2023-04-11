gói  lab3 ;

nhập  java . sử dụng . Máy quét ;

lớp  Sách 
    {
         Đầu vào máy quét = Máy quét mới  ( System . in );
        riêng tư
            Chuỗi  ma , ten , tg ;
            int  trang , tap , gia ;
            Xâu  loai , nxb ;
        công cộng
            void  NhapSach ()
            {
                Hệ thống . ra . print ( "Nhap Ma Sach: " );
                ma = đầu vào . nextLine ();
                Hệ thống . ra . print ( "Nhap ten sach: " );
                mười = đầu vào . nextLine ();
                Hệ thống . ra . print ( "Nhap ten Tac Gia: " );
                tg = đầu vào . nextLine ();
                Hệ thống . ra . print ( "Nhap loai sach: " );
                loai = đầu vào . nextLine ();
                Hệ thống . ra . print ( "NXB Nhap Ten: " );
                nxb = đầu vào . nextLine ();
                Hệ thống . ra . print ( "Nhap so trang: " );
                trang = đầu vào . nextInt ();
                Hệ thống . ra . print ( "Nhap so tap: " );
                nhấn = đầu vào . nextInt ();
                Hệ thống . ra . print ( "Nhap gia: " );
                gia = đầu vào . nextInt ();
            }
            void  InSach () {
                Hệ thống . ra . println ( "Ma Sách: " + ma );
                Hệ thống . ra . println ( "Ten sach: " + ten );
                Hệ thống . ra . println ( "Ten tac gia: " + tg );
                Hệ thống . ra . println ( "Loai sach: " + loai );
                Hệ thống . ra . println ( "Nha Xuan Ban: " + nxb );
                Hệ thống . ra . println ( "So trang: " + trang );
                Hệ thống . ra . println ( "So tap: " + tap );
                Hệ thống . ra . println ( "Gia: " + gia );
            }
    }

 lớp  công khai b31 {
     đầu vào Máy quét tĩnh  công khai = Máy quét mới ( Hệ thống . in );  
    public  static  void  main ( String [] args ) {
        // Sach SACH = new Sach();
        // SACH.NhapSach();
        // SACH.InSach();
        Hệ thống . ra . print ( "Nhap so luong sach:" );
        int  n = đầu vào . nextInt ();
        Sách  DsSach [] = Sách mới  [ n ] ;
        cho ( int  i = 0 ; i < n ; i ++) {
            DsSach [ i ] = Sach moi  ();
            Hệ thống . ra . println ( "Nhap thong tin sach thu " + ( i + 1 ));
            DsSach [ i ]. NhapSach ();
        }
        cho ( int  i = 0 ; i < n ; i ++) {
            Hệ thống . ra . println ( "Thong tin quyen sach thu " + ( i + 1 ));
            DsSach [ i ]. InSach ();
        }
    }
}