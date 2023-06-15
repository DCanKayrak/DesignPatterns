public class Car {
    private String plate;
    private String brand;
    private String model;

    private Car(Builder builder) {
        this.plate = builder.plate;
        this.brand = builder.brand;
        this.model = builder.model;
    }

    public String getPlate() {
        return plate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public static class Builder {
        private String plate;
        private String brand;
        private String model;

        public Builder setPlate(String plate) {
            this.plate = plate;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
