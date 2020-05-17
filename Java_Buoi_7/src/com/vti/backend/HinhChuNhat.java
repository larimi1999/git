package com.vti.backend;

public class HinhChuNhat extends HinhHoc  {
	
	public static int count1 = 0;
	public HinhChuNhat()
	{
		count1++;
	}
	
	
	@Override
	public float tinhChuVi(float a,float b) {
		return (a+b)*2;
	}

	@Override
	public float tinhDienTich(float a, float b) {
		return (a*b);
	}

}
