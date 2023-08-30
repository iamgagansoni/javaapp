package bl;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import models.Employee;
import models.Training;

public class TrainingManagementSystem {
    private Map<String, Training> trainingMap;
    private Map<String, Employee> employeeMap;

    public TrainingManagementSystem() {
        trainingMap = new HashMap<>();
        employeeMap = new HashMap<>();
    }

    public void createEmployee(String employeeId, String employeeName) throws CustomException {
        if (employeeMap.containsKey(employeeId)) {
            throw new CustomException("Employee already exists.");
        }
        employeeMap.put(employeeId, new Employee(employeeId, employeeName));
    }

    public void createTraining(String trainingId, String courseName, String skillsAcquired, Date startDate, Date endDate, int labDurationInMinutes) throws CustomException {
        if (trainingMap.containsKey(trainingId)) {
            throw new CustomException("Training already exists.");
        }
        trainingMap.put(trainingId, new Training(trainingId, courseName, skillsAcquired, startDate, endDate, labDurationInMinutes));
    }

    public void registerEmployeeForTraining(String employeeId, String trainingId) throws CustomException {
        if (!employeeMap.containsKey(employeeId)) {
            throw new CustomException("Employee does not exist.");
        }

        if (!trainingMap.containsKey(trainingId)) {
            throw new CustomException("Training does not exist.");
        }

        Employee employee = employeeMap.get(employeeId);
        employee.registerTraining(trainingId);
    }

    public Map<String, Employee> getEmployeeMap() {
        return employeeMap;
    }
}
