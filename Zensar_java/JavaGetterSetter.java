/*
 * Setter Method : start with 'set' followed by method name,this method take argument and assign it to the member.
 * Getter Method : start with 'get'  followed by method name,this method return value .
 */
public class JavaGetterSetter {

	public static void main(String[] args) {
		Empolyee obj=new Empolyee();
		obj.setEmpid(1);
		obj.setEmpname("Anirudha");
		obj.setEmpdesignation("Trainer");
		obj.setEmpcompany("Asperings");
		
		System.out.println("Employee Details : "+obj.getEmpid()+" "+obj.getEmpname()+" "+obj.getEmpdesignation()+" "+obj.getEmpcompany());

	}//Main()

}//end class


class Empolyee{
	private int empid;
	private String empname;
	private String empdesignation;
	private String empcompany;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
	public String getEmpcompany() {
		return empcompany;
	}
	public void setEmpcompany(String empcompany) {
		this.empcompany = empcompany;
	}
		
	
} // end Empolyee
