public class EmployeeWageUC6 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int MAX_HRS_IN_MONTH = 10;

    public EmployeeWageUC6() {
    }

    public static int computeEmpWage() {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        int empCheck;
        while(totalEmpHrs <= 10 && totalWorkingDays < 2) {
            ++totalWorkingDays;
            empCheck = (int)Math.floor(Math.random() * 10.0) % 3;

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

            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }

        empCheck = totalEmpHrs * 20;
        System.out.println("Total Emp Wage: " + empCheck);
        return empCheck;
    }

    public static void main(String[] args) {
        computeEmpWage();
    }
}
