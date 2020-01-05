package com.joydeep.hibernate.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.joydeep.hibernate.model.UserDetails;
import com.joydeep.hibernate.model.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user1=new UserDetails();
		user1.setUserName("Joydeep");
		UserDetails user2=new UserDetails();
		user2.setUserName("Pramit");
		Vehicle vehicleUser1=new Vehicle();
		vehicleUser1.setVehicleName("Ferrari");
		Vehicle vehicleUser2=new Vehicle();
		vehicleUser2.setVehicleName("Audi");
		user1.getVehicle().add(vehicleUser1);
		user1.getVehicle().add(vehicleUser2);
		user2.getVehicle().add(vehicleUser2);
		vehicleUser1.getUserList().add(user1);
		vehicleUser2.getUserList().add(user1);
		vehicleUser2.getUserList().add(user2);
		
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        session.beginTransaction();
        session.save(user1);
        session.save(user2);
        session.save(vehicleUser1);
        session.save(vehicleUser2);
        session.getTransaction().commit();
        session.close();
	}

}
