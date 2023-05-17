gói  Chung ;
nhập  java . sử dụng . Máy quét ;
public  class  Bai1 {

	public  static  void  main ( String [] args ) {
		Máy quét  sc = Máy quét mới  ( Hệ thống . in );
		Hệ thống . ra . print ( "Nhap so thu nhat: " );
		int  a = sc . nextInt ();
		Hệ thống . ra . print ( "nhap so thu hai: " );
		int  b = sc . nextInt ();
		Hệ thống . ra . println ( "tong 2 so la: " +( a + b ));
		Hệ thống . ra . println ( "hieu 2 so la: " +( a - b ));
		Hệ thống . ra . println ( "tich 2 so la: " +( a * b ));
		Hệ thống . ra . println ( "thuong 2 so la: " +( a / b ));
		Hệ thống . ra . println ( "chia lay du la: " +( a % b ));
		nếu ( a > b )
			Hệ thống . ra . println ( "a lon hon b" );
		khác 
			Hệ thống . ra . println ( "nho hon b" );
		nếu ( a == b )
			Hệ thống . ra . println ( "a bang b" );
		khác
			Hệ thống . ra . println ( "a khac b" );
	}

