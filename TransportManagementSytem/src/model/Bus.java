/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.*;

/**
 *
 * @author ingab
 */
@Entity
public class Bus {
    @Id
//    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String bus_id;
    private String plate_no;
    private String regDate;
    private Integer size;
    
   @OneToMany(mappedBy = "thebus")
    private List<Driver> drivers;
    public Bus() {
    }

    public Bus(String bus_id) {
        this.bus_id = bus_id;
    }

    public Bus(String bus_id, String plate_no, String regDate, Integer size, List<Driver> drivers) {
        this.bus_id = bus_id;
        this.plate_no = plate_no;
        this.regDate = regDate;
        this.size = size;
        this.drivers = drivers;
    }

    public String getBus_id() {
        return bus_id;
    }

    public void setBus_id(String bus_id) {
        this.bus_id = bus_id;
    }

    public String getPlate_no() {
        return plate_no;
    }

    public void setPlate_no(String plate_no) {
        this.plate_no = plate_no;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }
    
    
    
}