package org.xika.demo.mongodb;

import org.xika.demo.mongodb.entity.Employee;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

public class MongoDBCrud {

	public static void main(String[] args) {
		/*
		 * query("dbtest", "testData"); //add DBObject dbo = new
		 * BasicDBObject(); student s = new student(); s.setAge("20");
		 * s.setBrithdayDate(new Date()); s.setClazz("909"); s.setGrade(9);
		 * s.setName("LiMing"); s.setSex("male"); dbo.put("emp","test emp");
		 * //dbo.put("student",s); addObject("dbtest", "testData",dbo);
		 * query("dbtest", "testData"); DBObject ndbo = new BasicDBObject();
		 * ndbo.put("emp","test new Emp"); modifyObject("dbtest",
		 * "testData",dbo,ndbo);
		 */
		/*
		 * DBObject ndbo = new BasicDBObject(); ndbo.put("emp","test emp");
		 * delete("dbtest", "testData",ndbo); query("dbtest", "testData");
		 */
		/**
		 * DBObject dbo = new BasicDBObject(); student s = new student();
		 * s.setAge("20"); s.setBrithdayDate(new Date()); s.setClazz("909");
		 * s.setGrade(9); s.setName("LiMing"); s.setSex("male"); //
		 * dbo.put("emp",s); dbo.putAll(dbo); addObject("dbtest", "testData",
		 * dbo); query("dbtest", "testData");
		 */
		Employee employee = new Employee();
		employee.setNo(1L);
		employee.setName("yogesh");

		addObject("dbtest", Employee.COLLECTION_NAME, employee);

		query("dbtest", Employee.COLLECTION_NAME);
	}

	public static boolean addObject(String dbName, String colName, DBObject dbo) {
		WriteResult ws = DBUtil.getDBCollection(dbName, colName).insert(dbo);
		int n = ws.getN();
		return n > 0;

	}

	public static int saveObject(String dbName, String colName, DBObject dbo) {
		WriteResult ws = DBUtil.getDBCollection(dbName, colName).save(dbo);
		int n = ws.getN();
		return n;
	}

	public static void delete(String dbName, String colName, DBObject dbo) {
		DBUtil.getDBCollection(dbName, colName).remove(dbo);
	}

	public static void query(String dbName, String colName) {
		DBCollection coll = DBUtil.getDBCollection(dbName, colName);
		// 查询集合中所有的数据
		DBCursor cur = coll.find();
		System.out.println("Record Count:" + cur.count());
		while (cur.hasNext()) {
			DBObject object = cur.next();

			for (String key : object.keySet()) {
				System.out.print(key + " = " + object.get(key) + " ");
			}
			System.out.println();
			/*
			 * System.out.println(object); // 取出对象中列表为'uname'和'upwd'的数据
			 * System.out.println("uname:" + object.get("uname") + "\tupwd:" +
			 * object.get("upwd")+"\t_id:"+object.get("_id"));
			 */
		}
	}

	public static void modifyObject(String dbName, String colName,
			DBObject orig, DBObject update) {
		DBUtil.getDBCollection(dbName, colName).update(orig, update);
	}

}
