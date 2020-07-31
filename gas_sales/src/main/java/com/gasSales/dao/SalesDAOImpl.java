package com.gasSales.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gasSales.entity.Results;
import com.gasSales.entity.Sales;

@Repository
public class SalesDAOImpl implements SalesDAO {

	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Sales> getSales() {

		Session currentSession = sessionFactory.getCurrentSession();	
		Query<Sales> theQuery = 
				currentSession.createQuery("from Sales order by lastName",
											Sales.class);
		List<Sales> sales = theQuery.getResultList();
					
		return sales;
	}

	@Override
	public void saveSale(Sales sale) {

		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(sale);
		
	}

	@Override
	public Sales getSale(int theId) {

		Session currentSession = sessionFactory.getCurrentSession();
		Sales sale = currentSession.get(Sales.class, theId);
		
		return sale;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void deleteSale(int theId) {

		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = 
				currentSession.createQuery("delete from Sales where idsales=:idsales");
		theQuery.setParameter("idsales", theId);
		theQuery.executeUpdate();
	}
	
	@Override
	public void saveResult(Results result) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(result);
	}
	
	@Override
	public Results getResult(String theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Results result = currentSession.get(Results.class, theId);
		
		return result;
	}

}











