package LAC1_College_wallah.String_Builder.CODE;

class Employee {
    String name;
    int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    final void displayBasicInfo() {
        System.out.println("Name: " + name + ", ID: " + empId);
    }

    String getRole() {
        return "Generic Employee";
    }
}



class Manager extends Employee {
    String department;

    Manager(String name, int empId, String department) {
        super(name, empId);
        this.department = department;
    }

    @Override
    String getRole() {
        return "Manager of " + department + " department";
    }

    void displayDetails() {
        System.out.println("Role from super: " + super.getRole());
        System.out.println("Manager handles: " + department);
    }
}





class SeniorManager extends Manager {
    int teamSize;

    SeniorManager(String name, int empId, String department, int teamSize) {
        super(name, empId, department);
        this.teamSize = teamSize;
    }

    @Override
    String getRole() {
        return "Senior Manager managing " + teamSize + " members in " + department + " department";
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Also leads " + teamSize + " team members");
    }
}






public class Main {

    public static void main(String[] args) {
        // Basic Employee
        Employee e = new Employee("Rajendra", 101);
        e.displayBasicInfo();
        System.out.println(e.getRole());

        // Manager
        Manager m = new Manager("Anita", 102, "Development");
        m.displayBasicInfo();
        System.out.println(m.getRole());
        m.displayDetails();

        // Senior Manager
        SeniorManager sm = new SeniorManager("Vikram", 103, "QA", 10);
        sm.displayBasicInfo();
        System.out.println(sm.getRole());
        sm.displayDetails();
    }
}









