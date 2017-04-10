public class Student2 {
	private String Sta;
	private int StuNum;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setMe("컴퓨터정보공학과", 20141673);
		System.out.println("학과 = " + s.getSta());
		System.out.println("학번 = " + s.getStuNum());
	}
	
	String getSta(){
		return Sta;
	}
	
	int getStuNum(){		
		return StuNum;
	}
	
	void setMe(String a,int b){
		
		Sta = a;
		StuNum = b;
	
	}	
}
