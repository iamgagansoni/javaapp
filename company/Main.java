package company;
import java.util.Date;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TrainingManagementSystem tms = new TrainingManagementSystem();

        try {
            tms.createEmployee("E001", "Aashi");
            tms.createEmployee("E002", "Rashi");
            tms.createEmployee("E002", "Rashi");
        }
        catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            tms.createTraining("T001", "Conceptual Training", "Conceptual Skills", new Date(), new Date(), 0);
            tms.createTraining("T002", "Practical Training", "Practical Skills", new Date(), new Date(), 120);
            tms.createTraining("T002", "Practical Training", "Practical Skills", new Date(), new Date(), 120);
        }
        catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            tms.registerEmployeeForTraining("E001", "T001");
            tms.registerEmployeeForTraining("E002", "T002");

            System.out.println("Employees and their registered trainings:");

            for (Map.Entry<String, Employee> entry : tms.getEmployeeMap().entrySet()) {
                Employee employee = entry.getValue();
                System.out.println("Employee ID: " + employee.getEmployeeId());
                System.out.println("Employee Name: " + employee.getEmployeeName());
                System.out.println("Registered Trainings: " + employee.getRegisteredTrainingIds());
                System.out.println("------------------------");
            }
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
