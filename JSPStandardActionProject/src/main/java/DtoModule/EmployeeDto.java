package DtoModule;

import java.io.Serializable;

public class EmployeeDto implements Serializable {
	
	private String ename;
	private Integer eno;
	private Integer bsalary;
	private Float grossSalary;
	private Float netSalary;
	
	
	public EmployeeDto() {
		System.out.println("Zero parameter constructor");
	}


	 
	
	public String getEname() {
		return ename;
	}




	public void setEname(String ename) {
		this.ename = ename;
	}




	public Integer getEno() {
		return eno;
	}




	public void setEno(Integer eno) {
		this.eno = eno;
	}




	public Integer getBsalary() {
		return bsalary;
	}




	public void setBsalary(Integer bsalary) {
		this.bsalary = bsalary;
	}




	public Float getGrossSalary() {
		return grossSalary;
	}




	public void setGrossSalary(Float grossSalary) {
		this.grossSalary = grossSalary;
	}




	public Float getNetSalary() {
		return netSalary;
	}




	public void setNetSalary(Float netSalary) {
		this.netSalary = netSalary;
	}




	@Override
	public String toString() {
		return "EmployeeDto [ename=" + ename + ", eno=" + eno + ", bsalary=" + bsalary + ", grossSalary=" + grossSalary
				+ ", netSalary=" + netSalary + "]";
	}
	
	
	

}
