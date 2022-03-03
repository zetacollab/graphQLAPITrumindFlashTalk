package com.ap.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;
	  
	  @Column(name = "name", nullable = false)
	  private String name;
	  
	  @Column(name = "age")
	  private Integer age;
	  
	  @Column(name = "shortDesciption")
	  private String shortDesciption;
	  
	  @Column(name = "location")
	  private String location;
	  
	  @Column(name = "telephoneNumber")
	  private Integer telephoneNumber;
	  
	  @Column(name = "emailId")
	  private String emailId;
	  
	  
	  @Column(name = "averageRatings")
	  private Integer averageRatings;
	  
	  
	  @Column(name = "interestAreas")
	  private String interestAreas;
	  
	  @Column(name = "universityName")
	  private String universityName ;
	  
	  
	  @Column(name = "yearOfExperience")
	  private Integer yearOfExperience;
	  
	  
	  @Column(name = "organisationName")
	  private String organisationName;
	  
	  @Column(name = "designation")
	  private String designation;
	  
	  @Column(name = "noOfShortCourses")
	  private Integer noOfShortCourses;
	  
	  @Column(name = "noOfLongCourses")
	  private Integer noOfLongCourses;
	  
	  @Column(name = "noOfTalks")
	  private Integer noOfTalks;
	  
	  @Column(name = "noOfFiveStarRatings")
	  private Integer noOfFiveStarRatings;
	  
	  public Author(Long authorId) {
		this.id=authorId;
	}
	  
	  public Author() {
		// TODO Auto-generated constructor stub
	}
	  
	 
	  

	public Author(Long id, String name, Integer age, String shortDesciption, String location, Integer telephoneNumber,
			String emailId, Integer averageRatings, String interestAreas, String universityName,
			Integer yearOfExperience, String organisationName, String designation, Integer noOfShortCourses,
			Integer noOfLongCourses, Integer noOfTalks, Integer noOfFiveStarRatings) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.shortDesciption = shortDesciption;
		this.location = location;
		this.telephoneNumber = telephoneNumber;
		this.emailId = emailId;
		this.averageRatings = averageRatings;
		this.interestAreas = interestAreas;
		this.universityName = universityName;
		this.yearOfExperience = yearOfExperience;
		this.organisationName = organisationName;
		this.designation = designation;
		this.noOfShortCourses = noOfShortCourses;
		this.noOfLongCourses = noOfLongCourses;
		this.noOfTalks = noOfTalks;
		this.noOfFiveStarRatings = noOfFiveStarRatings;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getShortDesciption() {
		return shortDesciption;
	}

	public void setShortDesciption(String shortDesciption) {
		this.shortDesciption = shortDesciption;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(Integer telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getAverageRatings() {
		return averageRatings;
	}

	public void setAverageRatings(Integer averageRatings) {
		this.averageRatings = averageRatings;
	}

	public String getInterestAreas() {
		return interestAreas;
	}

	public void setInterestAreas(String interestAreas) {
		this.interestAreas = interestAreas;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public Integer getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(Integer yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public String getOrganisationName() {
		return organisationName;
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getNoOfShortCourses() {
		return noOfShortCourses;
	}

	public void setNoOfShortCourses(Integer noOfShortCourses) {
		this.noOfShortCourses = noOfShortCourses;
	}

	public Integer getNoOfLongCourses() {
		return noOfLongCourses;
	}

	public void setNoOfLongCourses(Integer noOfLongCourses) {
		this.noOfLongCourses = noOfLongCourses;
	}

	public Integer getNoOfTalks() {
		return noOfTalks;
	}

	public void setNoOfTalks(Integer noOfTalks) {
		this.noOfTalks = noOfTalks;
	}

	public Integer getNoOfFiveStarRatings() {
		return noOfFiveStarRatings;
	}

	public void setNoOfFiveStarRatings(Integer noOfFiveStarRatings) {
		this.noOfFiveStarRatings = noOfFiveStarRatings;
	}




	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", age=" + age + ", shortDesciption=" + shortDesciption
				+ ", location=" + location + ", telephoneNumber=" + telephoneNumber + ", emailId=" + emailId
				+ ", averageRatings=" + averageRatings + ", interestAreas=" + interestAreas + ", universityName="
				+ universityName + ", yearOfExperience=" + yearOfExperience + ", organisationName=" + organisationName
				+ ", designation=" + designation + ", noOfShortCourses=" + noOfShortCourses + ", noOfLongCourses="
				+ noOfLongCourses + ", noOfTalks=" + noOfTalks + ", noOfFiveStarRatings=" + noOfFiveStarRatings + "]";
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
