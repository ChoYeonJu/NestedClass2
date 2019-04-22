package NestedClass2;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Practice1_1 in = new Practice1_1() {
			public void bbb() {
				System.out.println("DDD");
			}
			
			public void ddd() {
				System.out.println("ddd");
			}
		};
		
		in.aaa();
		in.bbb();
		in.ccc();
		//in.ddd  익명의 메소드 사용 불가능
	}

}
