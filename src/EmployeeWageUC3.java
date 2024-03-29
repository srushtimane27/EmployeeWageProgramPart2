public class EmployeeWageUC3 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public EmployeeWageUC3() {
    }

    public static int computeEmpWage() {
        int empHrs = 0;
        int empWage = 0;
        int empCheck = (int)Math.floor(Math.random() * 10.0) % 3;

        if (empCheck == 1) {
            empHrs = 4;
        } else if (empCheck == 2) {
            empHrs = 8;
        } else {
            empHrs = 0;
        }

         empWage = empHrs * 20;
        System.out.println("Emp Wage: " + empWage);
        return empHrs;
    }

    public static void main(String[] args) {
        computeEmpWage();
    }
}
