package company;

import java.util.Date;

public class Training {
    private String trainingId;
    private String courseName;
    private String skillsAcquired;
    private Date startDate;
    private Date endDate;
    private int labDurationInMinutes;

    

	public Training(String trainingId, String courseName, String skillsAcquired, Date startDate, Date endDate, int labDurationInMinutes) {
        this.trainingId = trainingId;
        this.courseName = courseName;
        this.skillsAcquired = skillsAcquired;
        this.startDate = startDate;
        this.endDate = endDate;
        this.labDurationInMinutes = labDurationInMinutes;
    }

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getSkillsAcquired() {
		return skillsAcquired;
	}

	public void setSkillsAcquired(String skillsAcquired) {
		this.skillsAcquired = skillsAcquired;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getLabDurationInMinutes() {
		return labDurationInMinutes;
	}

	public void setLabDurationInMinutes(int labDurationInMinutes) {
		this.labDurationInMinutes = labDurationInMinutes;
	}

	public void setTrainingId(String trainingId) {
		this.trainingId = trainingId;
	}	
	
    public String getTrainingId() {
        return trainingId;
    }
}
