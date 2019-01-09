package com.adapterdp;

public class EmployeeAdapterLdap implements Employee {
	private EmployeeLdap empLdap;
	public EmployeeAdapterLdap(EmployeeLdap empLdap) {
		this.empLdap=empLdap;
	}
	
	@Override
	public String getId() {
		return empLdap.getNo();
	}

	@Override
	public String getName() {
		return empLdap.getNaam();
	}

	@Override
	public String getEmail() {
		return empLdap.getEnrol();
	}

}
