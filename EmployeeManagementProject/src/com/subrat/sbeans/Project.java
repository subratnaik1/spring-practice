package com.subrat.sbeans;

public class Project {
	 protected String projectId;
     protected String projectName;
     protected String duration;
     
	 public Project(String projectId, String projectName, String duration) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.duration = duration;
	 }   
	 public void showProjectDetails() {
		 IO.print("project: "+projectName+" "+duration);
	 }
     
}
