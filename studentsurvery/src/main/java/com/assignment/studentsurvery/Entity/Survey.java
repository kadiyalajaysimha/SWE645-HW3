package com.assignment.studentsurvery.Entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "Survey")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "survey_id")
    int surveyId;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "street_address")
    String streetAddress;

    @Column(name = "city")
    String city;

    @Column(name = "state")
    String state;

    @Column(name = "zip")
    String zip;

    @Column(name = "telephone")
    String telephone;

    @Column(name = "email")
    String email;

    @Column(name = "survey_date")
    Date surveyDate;

    @Column(name = "liked")
    String liked;

    @Column(name = "interested")
    String interested;

    @Column(name = "recommendation")
    String recommendation;

//    @Column(name = "additional_comments")
//    String additionalComments;

    public int getSurveyId() {
        return surveyId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public Date getSurveyDate() {
        return surveyDate;
    }

    public String getLiked() {
        return liked;
    }

    public String getInterested() {
        return interested;
    }

    public String getRecommendation() {
        return recommendation;
    }

//    public String getAdditionalComments() {
//        return additionalComments;
//    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSurveyDate(Date surveyDate) {
        this.surveyDate = surveyDate;
    }

    public void setLiked(String liked) {
        this.liked = liked;
    }

    public void setInterested(String interested) {
        this.interested = interested;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

//    public void setAdditionalComments(String additionalComments) {
//        this.additionalComments = additionalComments;
//    }

    @Override
    public String toString() {
        return "Survey{" +
                "surveyId=" + surveyId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", surveyDate=" + surveyDate +
                ", liked='" + liked + '\'' +
                ", interested='" + interested + '\'' +
                ", recommendation='" + recommendation + '\'' +
//                ", additionalComments='" + additionalComments + '\'' +
                '}';
    }
}
