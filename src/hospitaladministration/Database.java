/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitaladministration;

/**
 *
 * @author dougl
 */
public abstract class Database {

    protected static final String DB_BASE_URL = "jdbc:mysql://localhost"; // Database URL
    protected static final String USER = "ooc2023"; // Database username
    protected static final String PASSWORD = "ooc2023"; // Database password
    protected static final String DB_NAME = "hospital";
    protected static final String TABLE_NAME = "patientdata";
    protected static final String DB_URL = DB_BASE_URL + "/" + DB_NAME;

}
