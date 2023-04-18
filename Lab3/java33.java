nhập  java . sử dụng . Máy quét ;

lớp  NgayThang
{
    riêng tư
        int  ngay , thang , nam ;
    công cộng
         Máy quét máy quét = Máy quét mới  ( Hệ thống . in );
        void  nhap ()
        {
            Hệ thống . ra . print ( "Nhap ngay:" );
            ngay = máy quét . nextInt ();
            Hệ thống . ra . print ( "Nhap thang:" );
            thang = máy quét . nextInt ();
            Hệ thống . ra . print ( "Nhap nam:" );
            nam = máy quét . nextInt ();
        }
        chuỗi công khai  toString (  )
        {
            return  ngay + " - " + thang + " - " + nam ;
        }
}

lớp  HằngHoa
{
    riêng tư
        Chuỗi  maHang , tenHang , nhaSanXuat ;
        long  gia ;
    công cộng
         Máy quét máy quét = Máy quét mới  ( Hệ thống . in );
        void  nhap ()
        {
            Hệ thống . ra . print ( "Nhap Ma Hang: " );
            maHang = máy quét . nextLine ();
            Hệ thống . ra . print ( "Nhap ten hang: " );
            tenHang = máy quét . nextLine ();
            Hệ thống . ra . print ( "Nhap Nha San Xuat: " );
            nhaSanXuat = máy quét . nextLine ();
            Hệ thống . ra . print ( "Nhap Gia: " );
            gia = máy quét . nextLong ();
        }
        chuỗi công khai  toString (  )
        {
            return  "Ma Hang: " + maHang + "\nTen Hang: " + tenHang + "\nNha San Xuat: " + nhaSanXuat + "\nGia: " + gia ;
        }
}

class  HangThucPham  extends  HangHoa
{
    riêng tư
        NgayThang  NgaySanXuat = new  NgayThang (), NgayHetHan = new  NgayThang ();
    công cộng
        void  nhap ()
        {
            siêu . nhap ();
            Hệ thống . ra . println ( "Nhap Ngay San Xuat: " );
            NgaySanXuat . nhap ();
            Hệ thống . ra . println ( "Nhap Ngay Het Han: " );
            NgayHetHan . nhap ();
        }
        chuỗi công khai  toString (  )
        {
            trở lại  siêu . toString () + "\nNgay San Xuat: " + NgaySanXuat . toString () + "\nNgay Het Han: " + NgayHetHan . toString ();
        }
}

class  HangSanhSu  extends  HangHoa
{
    riêng tư
        Chuỗi  LoaiNguyenLieu ;
    công cộng
         Máy quét máy quét = Máy quét mới  ( Hệ thống . in );
        void  nhap ()
        {
            siêu . nhap ();
            Hệ thống . ra . print ( "Nhap Loai Nguyen Lieu: " );
            LoaiNguyenLieu = máy quét . nextLine ();
        }
        chuỗi công khai  toString (  )
        {
            trở lại  siêu . toString () + "\nLoai Nguyen Lieu: " + LoaiNguyenLieu ;
        }
}  

class  HangDienMay  extends  HangHoa
{
    riêng tư
        Chuỗi  thoiGianBaoHanh ;
        double  dienAp , congSuat ;
    công cộng
         Máy quét máy quét = Máy quét mới  ( Hệ thống . in );
        void  nhap ()
        {
            siêu . nhap ();
            Hệ thống . ra . print ( "Nhap thoi gian Bao Hanh: " );
            thoiGianBaoHanh = máy quét . nextLine ();
            Hệ thống . ra . print ( "Nhap Dien Ap: " );
            dienAp = máy quét . nextDouble ();
            Hệ thống . ra . print ( "Nhap Cong Suat: " );
            congSuat = máy quét . nextDouble ();
        }
        chuỗi công khai  toString (  )
        {
            trở lại  siêu . toString () + "\nThời Gian Bảo Hành: " + thoiGianBaoHanh + "\nDien Ap: " + dienAp + "\nCong Suat: " + congSuat ;
        }
}


 lớp  công Bai3_3
{
     máy quét tĩnh Scanner  = new Scanner ( System . in ); 

    static  void  NhapHang ( HangHoa  Arr [], int  n )
    {
        cho ( int  i = 0 ; i < n ; i ++)
        {   
            int  sl ;
            Hệ thống . ra . print ( "Nhap Loai Hang Hoa: \n1. Hang Thuc Pham\n2. Hang Sanh Su\n3. Hang Dien May\n" );
            làm {
                Hệ thống . ra . print ( "Lua chon: " );
                sl = máy quét . nextInt ();
            } trong khi ( n < 1 || n > 3 );
            công tắc ( sl ){
                trường hợp  1 :
                    Arr [ i ] = new  HangThucPham ();
                    Arr [ i ]. nhap ();
                    phá vỡ ;
                trường hợp  2 :
                    Arr [ i ] = new  HangSanhSu ();
                    Arr [ i ]. nhap ();
                    phá vỡ ;
                trường hợp  3 :
                    Arr [ i ] = new  HangDienMay ();
                    Arr [ i ]. nhap ();
                    phá vỡ ;
            }
        }
    }

    static  void  InDShang ( HangHoa  Arr [], int  n )
    {
        cho ( int  i = 0 ; i < n ; i ++)
        {
            
            Hệ thống . ra . println ( "Hang hoa so " + ( i + 1 ) + ":\n" + Arr [ i ]. toString ());
        }
    }

    public  static  void  main ( String [] args )
    {
        Hệ thống . ra . print ( "Nhap so luong hang hoa: " );
        int  n = máy quét . nextInt ();
        HangHoa  dshh [] = new  HangHoa [ n ];
        NhapHang ( dshh , n );
        TrongDSHang ( dshh , n );
    }
}