package az.jdbc;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
    private String email;
    private int emp_id;
    private String first_name;
    private String last_name;
    private String phone_number;
    private LocalDate hire_date;
    private int job_id;
    private double salary;
    private int manager_id;
    private int department_id;


    private Employee(Builder builder) {
        this.email =builder.email;
        this.emp_id = builder.emp_id;
        this.first_name = builder.first_name;
        this.last_name = builder.last_name;
        this.phone_number = builder.phone_number;
        this.hire_date = builder.hire_date;
        this.job_id = builder.job_id;
        this.salary = builder.salary;
        this.manager_id = builder.manager_id;
        this.department_id = builder.department_id;
    }

    public String getEmail() {
        return email;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public LocalDate getHire_date() {
        return hire_date;
    }

    public int getJob_id() {
        return job_id;
    }

    public double getSalary() {
        return salary;
    }

    public int getManager_id() {
        return manager_id;
    }

    public int getDepartment_id() {
        return department_id;
    }
    static class Builder{
        private String email;
        private int emp_id;
        private String first_name;
        private String last_name;
        private String phone_number;
        private LocalDate hire_date;
        private int job_id;
        private double salary;
        private int manager_id;
        private int department_id;

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setEmp_id(int emp_id) {
            this.emp_id = emp_id;
            return this;
        }

        public Builder setFirst_name(String first_name) {
            this.first_name = first_name;
            return this;
        }

        public Builder setLast_name(String last_name) {
            this.last_name = last_name;
            return this;
        }

        public Builder setPhone_number(String phone_number) {
            this.phone_number = phone_number;
            return this;
        }

        public Builder setHire_date(LocalDate hire_date) {
            this.hire_date = hire_date;
            return this;
        }

        public Builder setJob_id(int job_id) {
            this.job_id = job_id;
            return this;
        }

        public Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder setManager_id(int manager_id) {
            this.manager_id = manager_id;
            return this;
        }

        public Builder setDepartment_id(int department_id) {
            this.department_id = department_id;
            return this;
        }
        public Employee build(){
            Employee employee=new Employee(this);
            return employee;
        }

    }
}
