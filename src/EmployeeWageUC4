public class EmployeeWageUC4 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public EmployeeWageUC4() {
    }

    public static int computeEmpWage() {
        int empHrs = 0;
        int empWage = 1;
        int empCheck = (int)Math.floor(Math.random() * 10.0) % 3;

        switch (empCheck) {
            case 1:
                empHrs = 4;
                break;
            case 2:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
                empWage = empHrs * 20;
                System.out.println("Emp Wage: " + empWage);
        }

        return empHrs;
    }

    public static void main(String[] args) {
        computeEmpWage();
    }
}
