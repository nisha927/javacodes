import java.util.Scanner;

class Licence {
    public static void main(String[] args) {
        Scanner lic = new Scanner(System.in);

        System.out.print("Enter the name of the person: ");
        String name = lic.nextLine();

        System.out.print("Enter the age of the person: ");
        int age = lic.nextInt();
        lic.nextLine(); // Consume the newline left by nextInt()

        System.out.print("Enter the date of birth (DOB): ");
        String DOB = lic.nextLine();

        System.out.print("Enter the marital status (m/u): ");
        String marriageStatus = lic.nextLine().toLowerCase();

        System.out.print("Enter the gender (male/female): ");
        String gender = lic.nextLine().toLowerCase();

        if (gender.equals("male")) {
            if (age >= 21) {
                if (marriageStatus.equals("m")) {
                    System.out.println(name + " is eligible for a license.");
                    System.out.println("Pay ₹2500.");
                } else {
                    System.out.println(name + " is eligible for a license.");
                    System.out.println("Pay ₹4000.");
                }
            } else {
                System.out.println(name + " is not eligible for a license.");
            }
        } else if (gender.equals("female")) {
            if (age >= 18) {
                if (marriageStatus.equals("m")) {
                    System.out.println(name + " is eligible for a license.");
                    System.out.println("Pay ₹1800.");
                } else {
                    System.out.println(name + " is eligible for a license.");
                    System.out.println("Pay ₹2000.");
                }
            } else {
                System.out.println(name + " is not eligible for a license.");
            }
        } else {
            System.out.println("Invalid gender input.");
        }

        lic.close();
    }
}
