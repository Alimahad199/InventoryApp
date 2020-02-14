package com.qa.ims.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.persistence.dao.Dao;
import com.qa.ims.persistence.domain.Items;

@RunWith(MockitoJUnitRunner.class)
public class ItemServicesTest {
	
	@Mock
	private Dao<Items> itemsDao;
	
	@InjectMocks
	private ItemServices itemsServices;
	
	@Test
	public void itemsServicesCreate() {
		Items items = new Items("Water bottle", 5.49);
		itemsServices.create(items);
		Mockito.verify(itemsDao, Mockito.times(1)).create(items);
	}
	
	@Test
	public void itemsServicesRead() {
		itemsServices.readAll();
		Mockito.verify(itemsDao, Mockito.times(1)).readAll();
	}
	
	@Test
	public void itemsServicesUpdate() {
		Items items = new Items("mobile", 45.99);
		itemsServices.update(items);
		Mockito.verify(itemsDao, Mockito.times(1)).update(items);
	}
	
	@Test
	public void itemsServicesDelete() {
		itemsServices.delete(1L);;
		Mockito.verify(itemsDao, Mockito.times(1)).delete(1L);
	}
}

