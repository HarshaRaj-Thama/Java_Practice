public class Employee extends Worker {
    private long employeeId;
    private String hireDate;
    private static int employeeno = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.hireDate = hireDate;
        this.employeeId = Employee.employeeno++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "endDate='" + endDate + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", employeeId=" + employeeId +
                "} " + super.toString();
    }
}
