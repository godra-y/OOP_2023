package task2;

public class testPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1=new Phone(Brands.APPLE, "14 Pro", "256Gb", "USA", 2022);
		Phone p2=new Phone(Brands.SAMSUNG, "Galaxy A54", "128Gb", "South Korea", 2023);
		Phone p3=new Phone(Brands.HUAWEI, "Nova 10 Pro", "128Gb", "China", 2022);
		Phone p4=new Phone(Brands.SONY, "Xperia 5 III", "256Gb", "Japan", 2021);
		Phone p5=new Phone(Brands.NOKIA, "5310", "28Mb", "Finland", 2022);
		Phone p6=new Phone(Brands.XIAOMI, "12 Pro", "256Gb", "China", 2022);
		
		p1.setPrice(580094);
		p2.setPrice(162039);
		p3.setPrice(104990);
		p4.setPrice(649990);
		p5.setPrice(17858);
		p6.setPrice(337443);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		System.out.println(p5.toString());
		System.out.println(p6.toString());
		
		System.out.println("Total count of phones: " +Phone.count);
	}

}
