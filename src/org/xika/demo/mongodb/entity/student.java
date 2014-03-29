package org.xika.demo.mongodb.entity;

import java.util.Map;
import java.util.Set;

import org.bson.BSONObject;

import com.mongodb.DBObject;

/**
 * 1 Inserting Java Object to MongoDB Collection Using Java
 * 2 mongodb  Exception in thread "main" java.lang.IllegalArgumentException: can't serialize
 * @author Administrator
 *
 */
public class student implements DBObject {

	public static final String COLLECTION_NAME = "student";

	private String name = "name";
	private String age = "age";
	private String brithdayDate = "brithdayDate";
	private String grade = "grade";
	private String sex = "sex";
	private String clazz = "clazz";

	
	
	@Override
	public Set<String> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void markAsPartialObject() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPartialObject() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object put(String key, Object v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(BSONObject o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void putAll(Map m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object get(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map toMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeField(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsKey(String s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsField(String s) {
		// TODO Auto-generated method stub
		return false;
	}

}
