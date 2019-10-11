/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import modelo_persistencia.Presentacion;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class presentacion {
     public void insertarPresentaciob (Presentacion prest){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.save(prest);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"Presentacion Insertado Correctamenete");
    
    }
       public Presentacion buscarPresentacion(String presenta){
  Presentacion pre;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    pre=(Presentacion)session.get(Presentacion.class,presenta);
    tx.commit();
    session.close();
    
    return pre;
    }
       
             public void BorrarPresentacion (Presentacion prest){
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.delete(prest);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog(null,"Presentacion Eliminado Correctamenete");
    
    }
}
