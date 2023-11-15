/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitaladministration;

import java.sql.SQLException;

/**
 *
 * @author dougl
 */
public class HospitalAdministration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        // TODO code application logic here
        
        Patient p1 = new Patient("Douglas", "1997-07-25", "O+");
        Patient p2 = new Patient("Evelin", "2001-07-16", "A+");
        
        System.out.println(p1.getPatientID());
        System.out.println(p2.getPatientID());
        
        System.out.println(Patient.getCurrentID());
        
        if(DatabaseSetup.setupDB()){
            System.out.println("Database and table created");
        }else{
            System.out.println("Error to create the database");
        }
        
        DatabaseWriter dbw = new DatabaseWriter();
        if(dbw.addPatient(p1)){
            System.out.println("p1 added");
        }
        
        
    }
    
}
