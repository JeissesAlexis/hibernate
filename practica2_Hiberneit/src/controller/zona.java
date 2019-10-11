/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import modelo_persistencia.Zona;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class zona {
     public void InsertarZona (Zona zona){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.save(zona);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"Zona Insertado Correctamenete");
    
    }   
  
      public Zona buscarZona(String zona){
  Zona zon;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    zon=(Zona)session.get(Zona.class,zona);
    tx.commit();
    session.close();
    
    return zon;
    }
      public void borrarZona (Zona zona){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.delete(zona);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"Zona Eliminado Correctamenete");
    
    }  
}
