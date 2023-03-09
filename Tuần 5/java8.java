gói  Chung ;
nhập  java . sử dụng . Máy quét ;
 lớp  công Bai8 {

	public  static  void  main ( String [] args ) {
		Máy quét  sc = Máy quét mới  ( Hệ thống . in );
		 Hệ thống . ra . println ( "nhap n vao: " );
		 int  n = sc . nextInt ();
		 int  a []= new  int [ n ];
		 phao  tb = 0 ;
		 cho ( int  i = 0 ; i < n ; i ++) {
			 Hệ thống . ra . println ( "nhap ptu thu a[" + i + "]" );
		 một [ i ]= sc . nextInt ();
		 tb += a [ i ];
		}
		 tb = tb / n ;
		 Hệ thống . ra . println ( tb );
		
	}
}