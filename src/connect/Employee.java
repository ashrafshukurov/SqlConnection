package connect;

import java.time.LocalDate;

public class Employee {
    private int emp_id;
    private String first_Name;
    private String last_Name;
    private String email;
    private String phone_Number;
    private LocalDate hire_Date;
    private int job_id;
    private double salary;
    private int manager_id;
    private int department_id;

    private Employee(Builder builder) {
        this.emp_id = builder.emp_id;
        this.first_Name =builder.first_Name;
        this.last_Name = builder.last_Name;
        this.email = builder.email;
        this.phone_Number = builder.phone_Number;
        this.hire_Date = builder.hire_Date;
        this.job_id = builder.job_id;
        this.salary = builder.salary;
        this.manager_id = builder.manager_id;
        this.department_id = builder.department_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public LocalDate getHire_Date() {
        return hire_Date;
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

    public static class Builder{
        private int emp_id;
        private String first_Name;
        private String last_Name;
        private String email;
        private String phone_Number;
        private LocalDate hire_Date;
        private int job_id;
        private double salary;
        private int manager_id;
        private int department_id;

        public Builder setEmp_id(int emp_id) {
            this.emp_id = emp_id;
            return this;
        }

        public Builder setFirst_Name(String first_Name) {
            this.first_Name = first_Name;
            return this;
        }

        public Builder setLast_Name(String last_Name) {
            this.last_Name = last_Name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone_Number(String phone_Number) {
            this.phone_Number = phone_Number;
            return this;
        }

        public Builder setHire_Date(LocalDate hire_Date) {
            this.hire_Date = hire_Date;
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
            Employee em=new Employee(this);
            return em;
        }
    }
}
