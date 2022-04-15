package dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Contact {
    String firstName;
    String lastName;
    String phone;
    String mobile;
    String typeSalutation;
    String email;
    String title;
    String fax;
    String typeLeadSource;
    String text;
    String accountName;
}
