package dto;

import com.github.javafaker.Faker;

public class AccountFactory {

    public static Account getAccount(String type, String industryType) {
        Faker faker = new Faker();
        return new Account(faker.name().name(), faker.name().name(), faker.internet().domainName(), faker.phoneNumber().phoneNumber(),
                faker.phoneNumber().phoneNumber(), faker.artist().name(), faker.address().streetName(), faker.country().capital(), faker.country().name(), faker.country().countryCode2(),
                faker.country().name(), type, industryType, faker.address().cityName(), faker.address().streetName(), faker.address().cityName());
    }
}
