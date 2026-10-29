import java.util.Random;

public class Main {

    // Метод, который определяет, можно ли идти гулять
    public static String checkWalkingCondition(int age, int temperature) {
        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "Можно идти гулять";
        } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять";
        } else if (age > 45 && (temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    // Метод для генерации случайного возраста
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100); 
    }

    public static void main(String[] args) {
        // Вызываем метод 5 раз с различными входными данными
        
        System.out.println("Тест 1 (25 лет, 15°C): " + checkWalkingCondition(25, 15));
        System.out.println("Тест 2 (15 лет, 20°C): " + checkWalkingCondition(15, 20));
        System.out.println("Тест 3 (50 лет, -5°C): " + checkWalkingCondition(50, -5));
        System.out.println("Тест 4 (30 лет, -25°C): " + checkWalkingCondition(30, -25));
        
        // Тест с использованием метода генерации случайного возраста (исправленная строка)
        int randomAge = generateRandomAge();
        System.out.println("Тест 5 (случайный возраст " + randomAge + " лет, 10°C): " + checkWalkingCondition(randomAge, 10));
    }
}