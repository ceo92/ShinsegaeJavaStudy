package assignment._0628assignment.employee;

import java.time.LocalDateTime;

public class Employee {

  private String name;
  private int age;
  private String phone;
  private String addr;

  private LocalDateTime empDate;

  private String dept;

  private boolean marriage;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public LocalDateTime getEmpDate() {
    return empDate;
  }

  public void setEmpDate(LocalDateTime empDate) {
    this.empDate = empDate;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public boolean isMarriage() {
    return marriage;
  }

  public void setMarriage(boolean marriage) {
    this.marriage = marriage;
  }
}
