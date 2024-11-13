import java.util.ArrayList;

public class TemperatureAdapter {

    private String type; // тип температуры (цельсий, фаренгейт)
    private double temperature; // текущая температура
    private ArrayList<Double> temperatureChanges; // изменения температуры за последние N дней

    //Конструктор
    public TemperatureAdapter(String type, double temperature, ArrayList<Double> temperatureChanges) {
        this.type = type;
        this.temperature = temperature;
        this.temperatureChanges = temperatureChanges;
    }

    // Геттеры и сеттеры
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public ArrayList<Double> getTemperatureChanges() {
        return this.temperatureChanges;
    }

    public void setTemperatureChanges(ArrayList<Double> temperatureChanges) {
        this.temperatureChanges = temperatureChanges;
    }

    // Метод для конвертации градусов Цельсия в градусы Фаренгейта
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Метод для конвертации градусов Фаренгейта в градусы Цельсия
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        // Пример использования
        ArrayList<Double> temperatureChanges = new ArrayList<>();
        temperatureChanges.add(20.0);
        temperatureChanges.add(25.0);
        temperatureChanges.add(18.0);

        TemperatureAdapter adapter = new TemperatureAdapter("celsius", 25.0, temperatureChanges);

        // Выводим все значения температурных изменений за последние N дней
        for (double temp : adapter.getTemperatureChanges()) {
            System.out.println(temp);
        }

        // Преобразуем температуру из градусов Цельсия в градусы Фаренгейта
        double fahrenheit = adapter.celsiusToFahrenheit(25.0);
        System.out.println("Температура в Фаренгейтах: " + fahrenheit);

        // Преобразуем температуру из градусов Фаренгейта в градусы Цельсия
        double celsius = adapter.fahrenheitToCelsius(77.0);
        System.out.println("Температура в Цельсиях: " + celsius);
    }
}