/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import modelo_persistencia.Producto;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class producto {
    public void InsertarProducto (Producto prod){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.save(prod);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"PRODUCTO Insertado Correctamenete");
    
    }
     public void borrarProducto (Producto prod){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.delete(prod);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"PRODUCTO Eliminado Correctamenete");
    
    }
    
}
