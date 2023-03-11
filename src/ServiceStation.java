public class ServiceStation {
private void checkVehicle(Transport transport){
    System.out.println("Обслуживаем " + transport.getModelName());
    for (int i = 0; i < transport.wheelsCount; i++) {
transport.updateTyre();
    }
}

    public void check(Bicycle bicycle){
        checkVehicle(bicycle);
    }
    public void check(Car car){
        checkVehicle(car);
        car.check();
    }public void check(Truck truck){
        checkVehicle(truck);
        truck.check();
    }
}