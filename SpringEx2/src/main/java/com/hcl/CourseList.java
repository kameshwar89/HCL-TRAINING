package com.hcl;

import java.util.ArrayList;

public class CourseList {
	ArrayList<Course> courseList = new ArrayList();

	public void insert(Course course) {
		courseList.add(course);
	}

	public ArrayList<String> noOfCourse(Double budget) {
		ArrayList<String> list = new ArrayList();
		for (Course course : courseList) {
			if (budget >= course.getFee()) {
				int value= (int) (budget / course.getFee());
				String str = course.getName() + "-" + value;
				list.add(str);
			}
		}
		return list;
	}

}
