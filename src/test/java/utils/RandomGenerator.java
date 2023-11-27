package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomGenerator {
    public static String generateRandomAlphanumericString10() {
    String generatedString = RandomStringUtils.randomAlphanumeric(10);

    return generatedString;
}
}
