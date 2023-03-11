public class Car extends Transport implements Checkable {


    public Car(String name, int wheels) {
        super(name, wheels);
    }

    public void check() {
        System.out.println("Проверяем двигатель");
    }

}