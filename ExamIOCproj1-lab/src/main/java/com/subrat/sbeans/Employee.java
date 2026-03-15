package com.subrat.sbeans;

import java.io.Serializable;

import lombok.Data;
@Data
public class Employee implements Serializable{
private int eno;
private String ename;
private String job;
private int salary;
private int deptno;
}
