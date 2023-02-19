package ServiceModule;

import DtoModule.EmployeeDto;

public class SalaryDetailsGeneratorImpl implements SalaryDetailsGenerator {

	public void generateSalaryDetails(EmployeeDto dto) {
		
		float grossSalary = dto.getBsalary() + (dto.getBsalary()*0.2F);
		float netSalary = grossSalary-(dto.getBsalary()*0.2f);
		
		dto.setGrossSalary(grossSalary);
		dto.setNetSalary(netSalary);
		
	}

}
