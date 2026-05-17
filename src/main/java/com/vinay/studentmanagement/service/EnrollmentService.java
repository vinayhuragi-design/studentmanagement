package com.vinay.studentmanagement.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.vinay.studentmanagement.dto.EnrollmentDTO;
import com.vinay.studentmanagement.dto.EnrollmentSummaryDTO;



public interface EnrollmentService {
	
	void enrollStudentToCourses(EnrollmentDTO enrollmentDTO);
	
	Page<EnrollmentSummaryDTO> getEnrolledStudents(int page, int size);
	
	EnrollmentSummaryDTO findEnrolledStudentCourseDetails(Long studentId);
	
	List<EnrollmentSummaryDTO> getRecentlyEnrolledStudents();

}