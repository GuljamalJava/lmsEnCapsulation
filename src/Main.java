import java.sql.Struct;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 /*todo       University, School, Car жана Person деген класс тузунуз
                  Алардын свойстваларын ойлоп табыныз
             Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
          Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
        Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз */

        University university1 = new University("IUK", 1990, "Bishkek");


        University university2 = new University("Manas", 1997, "Bishkek");


        University university3 = new University("KRAO", 2000, "Bishkek");

        University[] universities = {university1, university2, university3};
        for (University university : universities) {
            System.out.println("Universitet aty:" + university.getName() + "\n achilgan jyly:" + university.getDateOfStart() + "\n Jaygashkan jeri: " + university.getPlace());

        }


        School School1 = new School("SOSH:54", 1998, "Batken");

        School School2 = new School("SOSH:41", 1980, "Batken");

        School School3 = new School("SOSH:63", 1970, "Batken");

        School[] schools = {School1, School2, School3};
        for (School school : schools) {
            System.out.println("Mekteptin aty: " + school.getName() + "\n Achylgan jyly: " + school.getDateOfStart() + "\n Jaygashkan jeri:" + school.getPlace());
        }


        Car Car1 = new Car("Fit", 2002, 22000, "Ainura");

        Car Car2 = new Car("Mazda", 2010, 27000, "Gulmira");

        Car Car3 = new Car("Fit", 2016, 15000, "Aijan");

        Car[] cars = {Car1, Car2, Car3};
        for (Car car : cars) {
            System.out.println("Mashinanyn aty: " + car.getName() + "\n Chygarylgan jyly: " + car.getDateProduction() + "\nJurgon KM" + car.getKm() + "\n Mashynanyn eesi: " + car.getOwner());

        }


        Person Person1 = new Person("Ainura", "Aitbaeva", LocalDate.of(1992, 10, 3));
        Person Person2 = new Person("Gulmira", "Atabaeva", LocalDate.of(1997, 1, 7));
        Person Person3 = new Person("Aijan", "Turgunova", LocalDate.of(1999, 12 , 8));

        Person[] people = {Person1, Person2, Person3};
        for (Person person : people) {
            System.out.println("Aty: " + person.getName()+"\n Familia: "+ person.getSurname() + "\n jashy : " + person.getAge());

        }

    }
}