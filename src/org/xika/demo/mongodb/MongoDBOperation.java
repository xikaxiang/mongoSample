/**
 * MongoOptions
 */
package org.xika.demo.mongodb;

import java.util.ArrayList;
import java.util.Date;

import com.mongodb.BasicDBObject;

/**
 * 
 * @author Administrator
 * 
 */
public class MongoDBOperation {

	public static void main(String[] args) {
		operationDate();

	}

	public static void operationArrays() {
		ArrayList x = new ArrayList();
		x.add(1);
		x.add(2);
		x.add(new BasicDBObject("foo", "bar"));
		x.add(4);
		BasicDBObject doc = new BasicDBObject("x", x);

		System.out.println(MongoDBCrud.saveObject("dbtest", "tarrays", doc));
		MongoDBCrud.query("dbtest", "tarrays");

	}

	public static void operationDate() {
		Date now = new Date();
		BasicDBObject time = new BasicDBObject("ts", now);
		System.out.println(MongoDBCrud.saveObject("dbtest", "tarrays", time));
		MongoDBCrud.query("dbtest", "tarrays");
	}

}
