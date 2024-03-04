import java.util.Scanner;

public class Podatoci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Внеси ги податоците за име, возраст, висина, крвна група и килажата
        System.out.print("Внесете го името: ");
        String name = "Влатко"; // Пример: "Влатко";

        System.out.print("Внесете ги годините: ");
        int age = 20; // Пример: 20;
        
        System.out.print("Внесете ја висината (во см): ");
        double height = 176; // Пример: 176;
        
        scanner.nextLine(); // За да се избегне прескокнување на редот

        System.out.print("Внесете ја крвната група: ");
        String bloodType = "А-"; // Пример: "А-";

        System.out.print("Внесете ја килажата (во кг): ");
        double weight = 80; // Пример: 80;

        // Пресметај BMI (Индекс на телесна маса)
        double bmi = calculateBMI(height, weight);

        // Пресметај идеалната тежина за внесената висина и возраст
        double idealWeight = calculateIdealWeight(height, age);

        // Пресметај колку треба да ослабнеш (во кг)
        double weightToLose = weight - idealWeight;

        // Испис на информациите
        System.out.println("Име: " + name);
        System.out.println("Години: " + age);
        System.out.println("Висина: " + height + " см");
        System.out.println("Крвна група: " + bloodType);
        System.out.println("Килажа: " + weight + " кг");
        System.out.println("BMI: " + bmi);
        System.out.println("Колку треба да ослабнеш: " + weightToLose + " кг");

        // Затвори го scanner
        scanner.close();
    }

    // Метод за пресметување на BMI
    public static double calculateBMI(double height, double weight) {
        return weight / ((height / 100) * (height / 100));
    }

    // Метод за пресметување на идеална тежина базирана на висината и возраста
    public static double calculateIdealWeight(double height, int age) {
        // Пресметка на идеалната тежина може да се разликува според стандардите
        // Ова е само еден пример, можете да го промените според вашите потреби
        if (age < 19) {
            return 0; // Не е препорачано за лица помлади од 19 години
        } else if (age >= 19 && age <= 24) {
            return 0.85 * (height - 100);
        } else if (age >= 25 && age <= 34) {
            return 0.85 * (height - 100);
        } else if (age >= 35 && age <= 44) {
            return 0.8 * (height - 100);
        } else if (age >= 45 && age <= 54) {
            return 0.8 * (height - 100);
        } else if (age >= 55 && age <= 64) {
            return 0.75 * (height - 100);
        } else {
            return 0.75 * (height - 100);
        }
    }
}
