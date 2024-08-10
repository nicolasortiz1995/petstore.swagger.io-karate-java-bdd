package utils;

import com.github.javafaker.Faker;

/**
 * The {@code TestDataCreator} class is a utility class that provides methods
 * for generating
 * random test data using the Faker library. This class includes methods for
 * creating
 * random IDs, usernames, first names, last names, email addresses, passwords,
 * and phone numbers.
 * The generated data can be used in testing scenarios where unique or random
 * values are needed.
 */
public class TestDataCreator {

    /**
     * An instance of the Faker class used to generate random data.
     */
    private static Faker faker = new Faker();

    /**
     * Generates a random integer ID between 0 and 10,000.
     *
     * @return a random integer ID.
     */
    public static int getID() {
        return faker.number().numberBetween(0, 10000);
    }

    /**
     * Generates a random username.
     *
     * @return a random username as a {@code String}.
     */
    public static String getUserName() {
        return faker.name().username();
    }

    /**
     * Generates a random first name.
     *
     * @return a random first name as a {@code String}.
     */
    public static String getFirstName() {
        return faker.name().firstName();
    }

    /**
     * Generates a random last name.
     *
     * @return a random last name as a {@code String}.
     */
    public static String getLastName() {
        return faker.name().lastName();
    }

    /**
     * Generates a random email address.
     *
     * @return a random email address as a {@code String}.
     */
    public static String getEmailAdress() {
        return faker.internet().emailAddress();
    }

    /**
     * Generates a random password.
     *
     * @return a random password as a {@code String}.
     */
    public static String getPassword() {
        return faker.internet().password();
    }

    /**
     * Generates a random phone number.
     *
     * @return a random phone number as a {@code String}.
     */
    public static String getPhone() {
        return faker.phoneNumber().phoneNumber();
    }

    /**
     * Returns the current {@code Faker} instance.
     *
     * @return the current {@code Faker} instance.
     */
    public static Faker getFaker() {
        return faker;
    }

    /**
     * Returns the current {@code Faker} instance.
     *
     * @return the current {@code Faker} instance.
     */
    public static int[] getStatusInt() {
        return new int[] { 0, 1, 2 };
    }

    /**
     * Sets a new {@code Faker} instance.
     *
     * @param faker the new {@code Faker} instance to set.
     */
    public static void setFaker(Faker faker) {
        TestDataCreator.faker = faker;
    }

    /**
     * Returns a string representation of the {@code TestDataCreator} class.
     *
     * @return a string representation of the {@code TestDataCreator} class.
     */
    @Override
    public String toString() {
        return "TestDataCreator []";
    }
}
