public class EmployeeWageUC1 {
    public static int IS_FULL_TIME = 1;

    public static int computeEmpWage(){
        double empCheck = Math.floor(Math.random()*10)%2;
        if (empCheck == IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Abcent");
        return 0;
    }

    public static void main(String[] args) {
        computeEmpWage();
    }
}
