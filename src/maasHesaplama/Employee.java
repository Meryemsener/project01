package maasHesaplama;

public class Employee {
    public String name;
    public double salary;
    public int workHours, hireYear;

    Employee(int hireYear, int workHours, double salary, String name) {
        this.hireYear = hireYear;
        this.workHours = workHours;
        this.salary = salary;
        this.name = name;
    }

    public double tax() {

        if (this.salary >= 1000) {
            return salary * 0.03;
        }

        return 0.0;
    }

    public double bonus() {
        int extraHours=this.workHours-40;
        if(extraHours>0){
            return 30*extraHours;
        }
        return 0.0;
    }

    public double increase() {
        int year = 2022 - this.hireYear;
        if (year <= 9) {
            return salary * 0.05;
        } else if (year >= 10 && year <= 19) {
            return salary * 0.10;
        } else return salary * 0.15;
    }


    public void toString(Employee emp) {
        System.out.println("vergi : " +emp.tax());

        System.out.println("bonus  : "+emp.bonus());
        System.out.println("maas artisi : "+emp.increase());
        double totalSalary=emp.salary- emp.tax()+ emp.bonus();
        System.out.println(totalSalary);//maas
        System.out.println(emp.salary+ emp.increase());//maas arti artis
        System.out.println("deneme");
        System.out.println("deneme burcu");
        System.out.println("new branch deneme brc ");
    }


}

