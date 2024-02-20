public class Main {

    public static void main(String[] args) {
        System.out.println(permission(40, 15));
        System.out.println(permission(10, 30));
        System.out.println(permission(50, -15));
        System.out.println(permission(35, 20));
        System.out.println(permission(25, 30));
        System.out.println();
        System.out.println(permission(generateRandomAge(), 15));
        System.out.println(permission(generateRandomAge(), 30));
        System.out.println(permission(generateRandomAge(), 60));
        System.out.println(permission(generateRandomAge(), 26));
        System.out.println(permission(generateRandomAge(), 10));
    }

    public static String permission(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        return (int) (Math.random() * 100);
    }
}