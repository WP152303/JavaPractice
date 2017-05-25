package org.dimigo.interfaces;

/**
 * Created by daniel-kim on 25/05/2017.
 */
public interface IDBManager {
    String ORACLE_DATABSE = "ORACLE";
    String SYBASE_DATABASE = "SYBASE";

    void insert();
    void search();
    void update();
    void delete();


    static IDBManager getDBObject(String database) {
        IDBManager idbManager = null;
        if (database.equals(ORACLE_DATABSE)) {
            idbManager = new OracleDB();
        }
        else if (database.equals(SYBASE_DATABASE)) {
            idbManager = new SybaseDB();
        }
        return idbManager;
    }
}
