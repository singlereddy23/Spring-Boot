package com.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
@Data
public class Course
{	
	@Getter @Setter private Integer courseid;
	@Getter @Setter private String coursename;
	@Getter @Setter private String duration;
}