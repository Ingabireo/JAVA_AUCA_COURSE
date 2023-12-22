/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.*;

/**
 *
 * @author ingab
 */
@Entity
public class Journey {
    @Id
    private String journey_id;
    private String journey_date;
    private Double price;
    private String jour_dest_name;
    private String jour_source_name;
    private String jour_departure_time;
    private String jour_arrival_time;    
    @OneToOne
    @JoinColumn(name = "driver_id")
    private Driver thedriver;
    @OneToOne
    @JoinColumn(name = "jour_bus_no")
    private Bus thebus;

    public Journey() {
    }

    public Journey(String journey_id) {
        this.journey_id = journey_id;
    }

    public Journey(String journey_id, String journey_date, Double price, String jour_dest_name, String jour_source_name, String jour_departure_time, String jour_arrival_time, Driver thedriver, Bus thebus) {
        this.journey_id = journey_id;
        this.journey_date = journey_date;
        this.price = price;
        this.jour_dest_name = jour_dest_name;
        this.jour_source_name = jour_source_name;
        this.jour_departure_time = jour_departure_time;
        this.jour_arrival_time = jour_arrival_time;
        this.thedriver = thedriver;
        this.thebus = thebus;
    }

    public String getJourney_id() {
        return journey_id;
    }

    public void setJourney_id(String journey_id) {
        this.journey_id = journey_id;
    }

    public String getJourney_date() {
        return journey_date;
    }

    public void setJourney_date(String journey_date) {
        this.journey_date = journey_date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getJour_dest_name() {
        return jour_dest_name;
    }

    public void setJour_dest_name(String jour_dest_name) {
        this.jour_dest_name = jour_dest_name;
    }

    public String getJour_source_name() {
        return jour_source_name;
    }

    public void setJour_source_name(String jour_source_name) {
        this.jour_source_name = jour_source_name;
    }

    public String getJour_departure_time() {
        return jour_departure_time;
    }

    public void setJour_departure_time(String jour_departure_time) {
        this.jour_departure_time = jour_departure_time;
    }

    public String getJour_arrival_time() {
        return jour_arrival_time;
    }

    public void setJour_arrival_time(String jour_arrival_time) {
        this.jour_arrival_time = jour_arrival_time;
    }

    public Driver getThedriver() {
        return thedriver;
    }

    public void setThedriver(Driver thedriver) {
        this.thedriver = thedriver;
    }

    public Bus getThebus() {
        return thebus;
    }

    public void setThebus(Bus thebus) {
        this.thebus = thebus;
    }
    
    
    

}