public class Main {
    public static void main(String[] args) {
        task_1_2_3();
    }

    public static void task_1_2_3() {
        /*Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
        Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
        BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
        Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
        Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год.*/
        Car firstCar = new Car("  ", "", -2015,null, "", -1.7); // пример для некорректной работы
        System.out.println(firstCar.toString());
        Car secondCar = new Car("Audi", "A8 50 L TDI quattro", 2020,"Германия", "черный", 3.0);
        System.out.println(secondCar.toString());
        Car thirdCar = new Car("BMW", "Z8", 2021,"Германия", "черный", 3.0);
        System.out.println(thirdCar.toString());
        Car fourthCar = new Car("Kia", "Sportage 4-го поколения", 2018,"Южная Корея", "красный", 2.4);
        System.out.println(fourthCar.toString());
        Car fifthCar = new Car("Hyundai", "Avante", 2016,"Южная Корея", "оранжевый", 1.6);
        System.out.println(fifthCar.toString());
    }

}