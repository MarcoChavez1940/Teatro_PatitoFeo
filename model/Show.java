/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;

/**
 *
 * @author marco
 */
public class Show {
    
    private int idShow;
    private String name;
    private String description;
    private Time duration;
    private int price;
    private String status;
    private String actors;
    private String publicity;
    private String responsiblePersonalPhone;
    private String responsibleAlternatePhone;
    private String responsibleEmail;

    public int getIdShow() {
        return idShow;
    }

    public void setIdShow(int idShow) {
        this.idShow = idShow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getPublicity() {
        return publicity;
    }

    public void setPublicity(String publicity) {
        this.publicity = publicity;
    }

    public String getResponsiblePersonalPhone() {
        return responsiblePersonalPhone;
    }

    public void setResponsiblePersonalPhone(String responsiblePersonalPhone) {
        this.responsiblePersonalPhone = responsiblePersonalPhone;
    }

    public String getResponsibleAlternatePhone() {
        return responsibleAlternatePhone;
    }

    public void setResponsibleAlternatePhone(String responsibleAlternatePhone) {
        this.responsibleAlternatePhone = responsibleAlternatePhone;
    }

    public String getResponsibleEmail() {
        return responsibleEmail;
    }

    public void setResponsibleEmail(String responsibleEmail) {
        this.responsibleEmail = responsibleEmail;
    }

    
    
}
