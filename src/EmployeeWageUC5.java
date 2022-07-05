public class EmployeeWageUC5 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;

    public EmployeeWageUC5() {
    }

    public static int computeEmpWage() {
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;

        for(int day = 0; day < 2; ++day) {
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
            }

            totalEmpWage += empWage;
            System.out.println("Total Emp Wage: " + totalEmpWage);
        }

        empWage = empHrs * 20;
        System.out.println("Total Emp Wage: " + empWage);
        return empHrs;
    }

    public static void main(String[] args) {
        computeEmpWage();
    }
}
