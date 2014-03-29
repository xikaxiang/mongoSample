package org.xika.demo.mongodb;

import java.util.Set;

import com.mongodb.DB;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

public class TestMongo {

	public static void main(String[] args) throws Exception {

		/**
		 * Mongo实例代表了一个数据库连接池 Mongo mg = new Mongo("localhost"); Mongo mg = new
		 * Mongo("localhost", 27017);
		 */
		Mongo mg = new Mongo();
		DB db = mg.getDB("dbtest");

		// 查询该库中所有的集合 (相当于表)
		for (String table : db.getCollectionNames()) {
			System.out.println(table);
		}
		DBCursor crusor = db.getCollection("users").find();
		System.out.println(crusor.count());
		while (crusor.hasNext()) {
			DBObject dbo = crusor.next();
			System.out.println(dbo);
			System.out.println(dbo.get("name")+"  "+ dbo.get("upwd"));
		}
	}
/*
 * function insertData(dbName, colName, num) {

  var col = db.getSiblingDB(dbName).getCollection(colName);

  for (i = 0; i < num; i++) {
    col.insert({x:i});
  }

  print(col.count());

}

insertData("test", "testData", 400)
 * 
 */
}
