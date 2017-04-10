public class SalaryMan {
	int salary = 1000000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryMan s = new SalaryMan();
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2_000_000).getAnnualGross());
	}
	
	public SalaryMan(){
		
	}
	
	public SalaryMan(int salary){
		this.salary = salary;
	}
	
	int getAnnualGross(){
		return (salary + (salary*5));
	}
}
