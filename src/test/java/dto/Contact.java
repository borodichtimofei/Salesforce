package dto;

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

    public Contact(String firstName, String lastName, String phone, String mobile, String typeSalutation, String email, String title, String fax, String typeLeadSource, String text, String accountName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.mobile = mobile;
        this.typeSalutation = typeSalutation;
        this.email = email;
        this.title = title;
        this.fax = fax;
        this.typeLeadSource = typeLeadSource;
        this.text = text;
        this.accountName = accountName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTypeSalutation() {
        return typeSalutation;
    }

    public void setTypeSalutation(String typeSalutation) {
        this.typeSalutation = typeSalutation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTypeLeadSource() {
        return typeLeadSource;
    }

    public void setTypeLeadSource(String typeLeadSource) {
        this.typeLeadSource = typeLeadSource;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
