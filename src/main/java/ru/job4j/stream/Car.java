package ru.job4j.stream;

public class Car {
    private String model;

    private String color;

    private String yearProduction;

    private int mileage;

    private boolean registration;

    private boolean crash;

    private int numberOfOwners;

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", color='" + color + '\''
                + ", yearProduction='" + yearProduction + '\''
                + ", mileage=" + mileage
                + ", registration=" + registration
                + ", crash=" + crash
                + ", numberOfOwners=" + numberOfOwners
                + '}';
    }

    public static void main(String[] args) {
        Car car = new Builder().buildModel("BMW 528i")
                .buildColor("Black")
                .buildYearProduction("2018")
                .buildMileage(46500)
                .buildRegistration(true)
                .buildCrash(false)
                .buildNumberOfOwners(1)
                .build();
        System.out.println(car);
    }

    static class Builder {
        private String model;
        private String color;
        private String yearProduction;
        private int mileage;
        private boolean registration;
        private boolean crash;
        private int numberOfOwners;

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Builder buildYearProduction(String yearProduction) {
            this.yearProduction = yearProduction;
            return this;
        }

        Builder buildMileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        Builder buildRegistration(boolean registration) {
            this.registration = registration;
            return this;
        }

        Builder buildCrash(boolean crash) {
            this.crash = crash;
            return this;
        }

        Builder buildNumberOfOwners(int numberOfOwners) {
            this.numberOfOwners = numberOfOwners;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.model = model;
            car.color = color;
            car.yearProduction = yearProduction;
            car.mileage = mileage;
            car.registration = registration;
            car.crash = crash;
            car.numberOfOwners = numberOfOwners;
            return car;
        }
    }
}
