package com.datascience.shop.irena.main.entity;

public class User {
    private long userId;
    private com.datascience.shop.irena.main.entity.UserRole userRole;
    private String clientName;
    private String clientOkpo;
    private com.datascience.shop.irena.main.entity.Country clientCountry;
    private com.datascience.shop.irena.main.entity.ContactInfo contactInfo;
    private static long idCurrentUser;

    public User(com.datascience.shop.irena.main.entity.UserRole userRole, String clientName, String clientOkpo, com.datascience.shop.irena.main.entity.Country clientCountry, com.datascience.shop.irena.main.entity.ContactInfo contactInfo) {
        this.userId = setUserId();
        this.userRole = userRole;
        this.clientName = clientName;
        this.clientOkpo = clientOkpo;
        this.clientCountry = clientCountry;
        this.contactInfo = contactInfo;
        }

    public long getUserId() {
        return userId;
    }

    public long setUserId() {
        return idCurrentUser++;
    }

    public com.datascience.shop.irena.main.entity.UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(com.datascience.shop.irena.main.entity.UserRole userRole) {
        this.userRole = userRole;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientOkpo() {
        return clientOkpo;
    }

    public void setClientOkpo(String clientOkpo) {
        this.clientOkpo = clientOkpo;
    }

    public com.datascience.shop.irena.main.entity.Country getClientCountry() {
        return clientCountry;
    }

    public void setClientCountry(com.datascience.shop.irena.main.entity.Country clientCountry) {
        this.clientCountry = clientCountry;
    }

    public com.datascience.shop.irena.main.entity.ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(com.datascience.shop.irena.main.entity.ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
}
