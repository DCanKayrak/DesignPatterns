public class Main {
    public static void main(String[] args) {
        /*Car car = new Car("34 ABC 12",
                "BMW",
                "i320",
                "White",
                "Sport",
                300,
                2000,
                2020);*/

        Car car = new Car.Builder()
                .setPlate("34ABC123")
                .setBrand("Ford")
                .setModel("Mustang")
                .build();
        Test t = new Test.builder()
                .setFirst("asdas")
                .setLast("sadas")
                .build();
    }
}
