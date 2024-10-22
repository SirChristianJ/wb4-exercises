package com.pluralsight;

public class Main {
    public static void main(String[] args) throws Exception {
        Reservation r = new Reservation("blue",4,true);
        r.setRoomType("king");
        //r.setIsWeekend(false);

        System.out.printf("\n%s %s is: $%.2f","The base price per night for",r.getRoomType(), r.getPrice());
        System.out.printf("\n%s: $%.2f","The total for the reservation is",r.getReservationTotal());

        Employee e = new Employee("Christian","Cleaning",20,39);
        /*System.out.printf("\n%s $%.2f an hour","The employee gets paid",e.getPayRate());
        System.out.printf("\n%s: $%.2f for %.2f hours worked.","The total pay is",e.getTotalPay(),e.getHoursWorked());*/

        Employee e2 = new Employee("Bill","Cleaning",20,49);
        /*System.out.printf("\n%s $%.2f an hour","The employee gets paid",e2.getPayRate());
        System.out.printf("\n%s: $%.2f for %.2f hours worked.","The total pay is",e2.getTotalPay(),e2.getHoursWorked());*/
        System.out.println();
        displayEmployee(e2);
        displayEmployee(e);


    }

    public static void displayEmployee(Employee em){
        System.out.printf("\nThe employee (ID: %d Name: %s) gets paid $%.2f an hour ", em.getEmployeeId(),em.getName() ,em.getPayRate());
        System.out.printf("\n%s: $%.2f for %.2f hours worked.\n","The total pay is",em.getTotalPay(),em.getHoursWorked());
    }
}