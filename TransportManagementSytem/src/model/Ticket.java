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
public class Ticket {
    @Id
    private String ticketId;
    
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer thecustomer;
    @OneToOne
    @JoinColumn(name = "journey_id")
    private String journeyId;

    public Ticket() {
    }

    public Ticket(String ticketId) {
        this.ticketId = ticketId;
    }

    public Ticket(String ticketId, Customer thecustomer, String journeyId) {
        this.ticketId = ticketId;
        this.thecustomer = thecustomer;
        this.journeyId = journeyId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public Customer getThecustomer() {
        return thecustomer;
    }

    public void setThecustomer(Customer thecustomer) {
        this.thecustomer = thecustomer;
    }

    public String getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(String journeyId) {
        this.journeyId = journeyId;
    }
    
}
