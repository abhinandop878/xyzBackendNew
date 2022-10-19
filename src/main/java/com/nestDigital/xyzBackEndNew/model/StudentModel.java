package com.nestDigital.xyzBackEndNew.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class StudentModel {
    @Id
    @GeneratedValue
    private int id;
    private  String name;
    private  int rollNo;
    private  String admissionNo;
    private  String college;
    private  String department;
    private  String bloodGroup;
    private  String dob;
    private  String parentName;
    private  String parentEmail;
    private  String guardianName;
    private  String guardianAddress;


    public StudentModel(int id, String name, int rollNo, String admissionNo, String college, String department, String bloodGroup, String dob, String parentName, String parentEmail, String guardianName, String guardianAddress) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.admissionNo = admissionNo;
        this.college = college;
        this.department = department;
        this.bloodGroup = bloodGroup;
        this.dob = dob;
        this.parentName = parentName;
        this.parentEmail = parentEmail;
        this.guardianName = guardianName;
        this.guardianAddress = guardianAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(String admissionNo) {
        this.admissionNo = admissionNo;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianAddress() {
        return guardianAddress;
    }

    public void setGuardianAddress(String guardianAddress) {
        this.guardianAddress = guardianAddress;
    }
}
