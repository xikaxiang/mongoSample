package org.xika.demo.mongodb;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

public class DBUtil {

	public static Mongo mg = null;
	public static DB db = null;
	public static DBCollection collection;
	private static Object object = new Object();

	/**
	 * 获得DBCollection集合的工具类
	 * 
	 * @param dbName
	 * @param colName
	 * @return
	 */
	public static DBCollection getDBCollection(String dbName, String colName) {

		if (mg == null) {
			synchronized (object) {
				if (mg == null) {
					try {
						mg = new Mongo();
					} catch (UnknownHostException e) {
						e.printStackTrace();
					}
				}

			}

		}
		db = mg.getDB(dbName);

		return db.getCollection(colName);

	}
}
