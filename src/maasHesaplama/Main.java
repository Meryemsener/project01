package maasHesaplama;

public class Main {
    public static void main(String[] args) {


    Employee emp1=new Employee(1989,45,2000,"Ayse");
        /*
        System.out.println("vergi : " +emp1.tax());

        System.out.println("bonus  : "+emp1.bonus());
        System.out.println("maas artisi : "+emp1.increase());
        double totalSalary=emp1.salary- emp1.tax()+ emp1.bonus();
        System.out.println(totalSalary);//maas
        System.out.println(emp1.salary+ emp1.increase());//maas arti artis
        */

        //toString methodu ile yukaridaki bilgileri elle tek tek yazmaktan kurtuluyoruz

        emp1.toString(emp1);

        Employee emp2=new Employee(1999,47,2200,"Ali");
        emp1.toString(emp2);

    }
}