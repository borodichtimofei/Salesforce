package dto;

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

    public Account(String accountName, String parentAccountName, String website, String phone, String fax, String employees, String revenue, String city, String state, String zipCode, String country, String type, String industryType, String descriptionText, String billingStreetText, String shippingStreetText) {
        this.accountName = accountName;
        this.parentAccountName = parentAccountName;
        this.website = website;
        this.phone = phone;
        this.fax = fax;
        this.employees = employees;
        this.revenue = revenue;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.type = type;
        this.industryType = industryType;
        this.descriptionText = descriptionText;
        this.billingStreetText = billingStreetText;
        this.shippingStreetText = shippingStreetText;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getParentAccountName() {
        return parentAccountName;
    }

    public void setParentAccountName(String parentAccountName) {
        this.parentAccountName = parentAccountName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

    public String getBillingStreetText() {
        return billingStreetText;
    }

    public void setBillingStreetText(String billingStreetText) {
        this.billingStreetText = billingStreetText;
    }

    public String getShippingStreetText() {
        return shippingStreetText;
    }

    public void setShippingStreetText(String shippingStreetText) {
        this.shippingStreetText = shippingStreetText;
    }
}
