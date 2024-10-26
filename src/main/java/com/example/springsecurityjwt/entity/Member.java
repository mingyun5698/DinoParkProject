package com.example.springsecurityjwt.entity;


import com.example.springsecurityjwt.security.UserRoleEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Getter
@NoArgsConstructor
@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true)
	private String memberName;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	@Enumerated(value = EnumType.STRING)
	private UserRoleEnum role;

	private String name;
	private String email;
	private int age;
	private int career;
	private int salary;
	private String morningTask;
	private String afternoonTask;


	public Member(String memberName, String password, UserRoleEnum role, String name, String email, int age, int career, int salary, String morningTask, String afternoonTask) {
		this.memberName = memberName;
		this.password = password;
		this.role = role;
		this.name = name;
		this.email= email;
		this.age = age;
		this.career = career;
		this.salary = salary;
		this.morningTask = morningTask;
		this.afternoonTask = afternoonTask;

	}

	public Long getId() {
		return id;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getPassword() {
		return password;
	}

	public UserRoleEnum getRole() {
		return role;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(UserRoleEnum role) {
		this.role = role;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public int getCareer() {
		return career;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCareer(int career) {
		this.career = career;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getMorningTask() {
		return morningTask;
	}

	public String getAfternoonTask() {
		return afternoonTask;
	}

	public void setMorningTask(String morningTask) {
		this.morningTask = morningTask;
	}

	public void setAfternoonTask(String afternoonTask) {
		this.afternoonTask = afternoonTask;
	}
}
