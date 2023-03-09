gói  Chung ;
nhập  java . sử dụng . Máy quét ;
 lớp  công Bai5 {

	public  static  void  main ( String [] args ) {
		Máy quét  sc = Máy quét mới  ( Hệ thống . in );
		 tổng int = 0 ;
		Hệ thống . ra . print ( "nhap cac so tu nhien vao: " );
		cho ( int  i = 0 ; i <= 200 ; i ++) {
		tôi = sc . nextInt ();
		tổng += i ;
		Hệ thống . ra . println ( "tong hien cac so vua nhap vao la:" + sum );
		nếu ( tổng >= 100 )
			phá vỡ ;
		}
		Hệ thống . ra . println ( "tong cac so da nhap vao va lon hon 100 la: " + sum );
	}
}