package com.vti.backend;

public class HinhTron extends HinhHoc {
	public static final float PI=3.14f;
	public static int count2 = 0;
	public HinhTron()
	{
		count2++;
	}
	
	@Override
	public float tinhChuVi(float a, float b) {
		return 2*PI*a;
	}

	@Override
	public float tinhDienTich(float a, float b) {
		return PI*a*a;
	}
	
	public float dienTichHinhTron(float R)
	{
		return this.tinhDienTich(R, R);		
	}
	
	public float chuViHinhChuNhat(float R)
	{
		return this.tinhChuVi(R, R);
	}
	
}
