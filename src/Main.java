public class Main {
    public static void main(String[] args) {
        task();
    }

    private static void task() {

        // Задание 1
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // Задание 2
        String fullNameUP = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUP);

        // Задание 3
        fullName = fullName.replace("Иван Иванович", "Семён Семёнович"); // изменил на Семёна чтобы следовать условиям задачи
        System.out.println(fullName);
        if (fullName.contains("ё")) {
            fullName = fullName.replace("ё", "е");
        }
        System.out.println("Данные ФИО сотрудника — " + fullName);

    }

}