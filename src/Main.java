public class Main {
    public static void main(String[] args) {
        int[] salary = {35000, 40000, 60000, 70000, 90000};
        int month = 0;
        for (int i = 0; i < salary.length; i++) {
            month = month + salary[i];
        }
        System.out.println("Сумма трат за месяц составила " + month + " рублей");
        int min = salary[0];
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];
            }
        }
        System.out.println("Минимальнаясумма трат за неделю составила " + min + " рублей");

        int max = salary[0];
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > max) {
                max = salary[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");
        double medium = 0;
        for (int i = 0; i < salary.length; i++) {
            medium += salary[i] / salary.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + medium + " рублей");

        char reverseFullName[] = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >=0; i--) {
                System.out.print(reverseFullName[i] + " ");
            }
        }
    }



