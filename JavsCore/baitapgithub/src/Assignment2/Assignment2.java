package Assignment2;

import java.util.Random;

public class Assignment2 {
	// Exercise 1: Tao ten cua sinh vien
	public static void main(String[] args) {

		String[] hos     = { "Nguyen", "Tran", "Ngo", "Le", "Trinh", "Pham", "Vu" };
		String[] tenDems = { "Ngoc", "Van", "Thi", "Thu", "Thao", "Phuong", "Duy" };
		String[] tens    = { "Duc", "Dung", "Manh", "Hanh", "Toan", "Quyet", "Hung" };
		Random 	 random  = new Random();

		String[] hoVaTens = new String[10];
		for (int i = 0; i < hoVaTens.length; i++) {
			int indexHo = random.nextInt(7);
			int indexDem = random.nextInt(7);
			int indexTen = random.nextInt(7);
			hoVaTens[i] = hos[indexHo] + " " + tenDems[indexDem] + " " + tens[indexTen] + "   ";

		}
		// Exercise 2 : Tao ID cua sinh vien

		int numberID = 1111111;
		String ID[] = new String[10];
		for (int i = 0; i < 10; i++) {
			ID[i] = "SV" + numberID + "  ";
			numberID++;

		}
		// Exercise 3 : Tao ngay cua sinh vien

		String[] NgayThangNam = new String[10];
		for (int i = 0; i < 10; i++) {
			int Thangsinh = 2 + random.nextInt(11);
			int Ngaysinh = 0;
			if (Thangsinh == 2) {
				Ngaysinh = 1 + random.nextInt(28);
			}
			if (Thangsinh == 3 || Thangsinh == 5 || Thangsinh == 7 || Thangsinh == 8 || Thangsinh == 10
					|| Thangsinh == 12) {
				Ngaysinh = 1 + random.nextInt(31);
			}
			if (Thangsinh == 4 || Thangsinh == 6 || Thangsinh == 9 || Thangsinh == 11) {
				Ngaysinh = 1 + random.nextInt(30);
			}
			NgayThangNam[i] = Ngaysinh + "/" + Thangsinh + "/" + "1991";

		}
		// Exercise 4 : In thong tin tren ra man hinh
			for(int i = 0; i< 10;i++)
			{					
			System.out.format("%20s%20s%25s\n",hoVaTens[i],ID[i],NgayThangNam[i]);
			}
		

		// ASSGINMENT 3 :
		int RA[] =  { 0, 5, 6, 1, 3, 4, 4, 7, 2, 10 };
		int SD[] =  { 8, 5, 6, 3, 6, 3, 4, 1, 2, 0  };
		int CP[] =  { 2, 5, 2, 7, 3, 3, 3, 9, 6, 0  };
		int CUT[] = { 9, 7, 1, 7, 3, 3, 3, 1, 7, 0  };
		int FMT[] = { 4, 7, 7, 7, 3, 3, 10, 1, 1, 0 };
		float AVG[] = new float[10];
		for (int i = 0; i < 10; i++) {
			AVG[i] = (float) (RA[i] + SD[i] + CP[i] + CUT[i] + FMT[i]) / 5;
		}

		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (AVG[i] < AVG[j]) {
					float tempAvg = AVG[i];
					      AVG[i]  = AVG[j];
					      AVG[j]  = tempAvg;
					
					int tempSD     =   SD[i];
					    SD[i]      =   SD[j];
					    SD[j]      =   tempSD;

					int tempRA = RA[i];
					RA[i] = RA[j];
					RA[j] = tempRA;

					int tempCP = CP[i];
					CP[i] = CP[j];
					CP[j] = tempCP;

					int tempCUT = CUT[i];
					CUT[i] = CUT[j];
					CUT[j] = tempCUT;

					int tempFMT = FMT[i];
					FMT[i] = FMT[j];
					FMT[j] = tempFMT;

					String temphoVaTens = hoVaTens[i];
					hoVaTens[i] = hoVaTens[j];
					hoVaTens[j] = temphoVaTens;

					String tempID = ID[i];
					ID[i] = ID[j];
					ID[j] = tempID;

					String tempNgayThangNam = NgayThangNam[i];
					NgayThangNam[i] = NgayThangNam[j];
					NgayThangNam[j] = tempNgayThangNam;

				}
			}
		}
		// Tao mang rank
		int rank[] = new int[10];
		for (int i = 0; i < 10; i++) {
			rank[i] = i + 1;
		}

		// in ket qua ra ngoai man hinh
		for (int i = 0; i < 10; i++) {

			System.out.printf("%20s%15s%15s%12s%12s%12s%12s%12s%12s%12s\n", hoVaTens[i], ID[i], NgayThangNam[i], RA[i], SD[i], CP[i],

					CUT[i], FMT[i], AVG[i],rank[i]);

		}
	}
	
}
