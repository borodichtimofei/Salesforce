package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Account {
    String accountName;
    String parentAccountName;
    String website;
    String phone;
    String fax;
    String employees;
    String revenue;
    String city;
    String state;
    String zipCode;
    String country;
    String type;
    String industryType;
    String descriptionText;
    String billingStreetText;
    String shippingStreetText;
}
