package com.zensar.model;

public class Student {
      private int studId;
      private String studName;
      private String qualification;
      private String placed;
      
      public Student() {
    
      }
	public Student(int studId, String studName, String qualification, String placed) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.qualification = qualification;
		this.placed = placed;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getPlaced() {
		return placed;
	}
	public void setPlaced(String placed) {
		this.placed = placed;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", qualification=" + qualification + ", placed="
				+ placed + "]";
	}
     
}
