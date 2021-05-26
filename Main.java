package com.company;

import com.company.models.*;

class Main {

    public static void main(String[] args) {


        // Spec 1 .. 2
        Specialist specialist1 = new Specialist(1, "Igor", 22, 25412, 5);
        specialist1.workWithClients();
        specialist1.print();


        Specialist specialist2 = new Specialist(2, "Alex", 18, 2412, 2);
        specialist2.workWithClients();
        specialist2.print();

        // Dev 3 .. 4
        Developer developer1 = new Developer(3, "Tom", 25, 5222, "senior");
        developer1.writeCode();
        developer1.print();

        Developer developer2 = new Developer(4, "Tommy", 27, 52222, "senior");
        developer2.writeCode();
        developer2.print();

        Manager manager1 = new Manager(5,"Banzhar", 25, 5222, true );
        manager1.writeProcedures();
        manager1.print();

        CEO ceo = new CEO(5,"Sanzhar", 25, 5222, true, false);
        ceo.writeProcedures();
        ceo.print();
        Employee[] employees = {specialist1, specialist2, developer1, developer2, manager1, ceo};
        Vocation vocation = new Vocation();
        System.out.println("----------------------------");

        vocation.goToVacation(employees);
        System.out.println("+++++++++++++++++++++++++++++++");
        specialist1.goToDayOff();
        specialist2.goToDayOff();
        developer1.goToDayOff();
        developer2.goToDayOff();
        manager1.goToDayOff();
        ceo.goToDayOff();

    }
 }

