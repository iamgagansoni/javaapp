package models;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String employeeId;
    private String employeeName;
    private List<String> registeredTrainingIds;

    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.registeredTrainingIds = new ArrayList<>();
    }
    
    public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<String> getRegisteredTrainingIds() {
		return registeredTrainingIds;
	}

	public void setRegisteredTrainingIds(List<String> registeredTrainingIds) {
		this.registeredTrainingIds = registeredTrainingIds;
	}

	public void registerTraining(String trainingId) {
        registeredTrainingIds.add(trainingId);
    }
}
