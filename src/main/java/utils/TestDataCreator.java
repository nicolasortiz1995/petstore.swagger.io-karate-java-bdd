package utils;

import com.github.javafaker.Faker;

public class TestDataCreator {

    private static Faker faker = new Faker();

    public static int getID() {
        /**
         * Returns an ID value as an integer
         */
        return faker.number().numberBetween(0,10000);
    }

    public static String getUserName(){
        return faker.name().username();
    }

    public static String getFirstName(){
        return faker.name().firstName();
    }

    public static String getLastName(){
        return faker.name().lastName();
    }

    public static String getEmailAdress(){
        return faker.internet().emailAddress();
    }

    public static String getPassword(){
        return faker.internet().password();
    }

    public static String getPhone(){
        return faker.phoneNumber().phoneNumber();
    }

    public static Faker getFaker() {
        return faker;
    }

    public static void setFaker(Faker faker) {
        TestDataCreator.faker = faker;
    }

    @Override
    public String toString() {
        return "TestDataCreator []";
    }
}
