package com.apress.prospring3.ch8.dao;

import java.util.List;

import com.apress.prospring3.ch8.domain.Contact;

public interface ContactDao {
	public List<Contact> findAll();
	public List<Contact> findByFirstName(String firstName);
	public void insert(Contact contact);
	public void update(Contact contact);
	public void delete(Long contactId);
}
