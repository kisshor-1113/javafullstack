package Mypackage;
class Employ{
	private int employee_id;
	private String employee_name;
	private int employee_salary;
	public int getEmployee_id() {
		return employee_id;}
	public String getEmployee_name() {
		return employee_name;}
	public int getEmployee_salary() {
		return employee_salary;}
	public void setEmployee_id(int newEmployee_id) {
	  if(newEmployee_id>0) {
	this.employee_id=newEmployee_id;
    }}
	public void setEmployee_name(String newEmployee_name) {
		this.employee_name=newEmployee_name;} 
	public void setEmployee_salary(int newEmployee_salary) {
		if(newEmployee_salary>0) {
			this.employee_salary=newEmployee_salary;
		}}
public class Employyy {
	public static void main(String[] args) {
    Employ obj=new Employ();
    obj.setEmployee_id(201);
    obj.setEmployee_name("kisshor");
    obj.setEmployee_salary(45000);
    System.out.println("The employee id is "+obj.getEmployee_id());
    System.out.println("The employee name is "+obj.getEmployee_name());
    System.out.println("The employee salary is "+obj.getEmployee_salary());
	}
  
}
}