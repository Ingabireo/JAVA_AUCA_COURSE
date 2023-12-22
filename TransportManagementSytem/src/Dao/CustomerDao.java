/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import model.Customer;
import org.hibernate.Session;

/**
 *
 * @author ingab
 */
public class CustomerDao {
    public Customer registerCustomer(Customer customerObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(customerObj);
            ss.beginTransaction().commit();
            ss.close();
            return customerObj;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
     public Customer updateCustomer(Customer customerObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(customerObj);
            ss.beginTransaction().commit();
            ss.close();
            return customerObj;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
      public Customer deleteCustomer(Customer customerObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(customerObj);
            ss.beginTransaction().commit();
            ss.close();
            return customerObj;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
      
     public Customer searchCustomer(Customer customerObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Customer thecustomer =(Customer) ss.get(Customer.class, customerObj.getCust_id());
            ss.close();
            return thecustomer;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<Customer> retrieveCustomers(){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Customer> customers =  ss.createQuery("select thecustomer from Customer the customer").list();
            ss.close();
            return customers;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
