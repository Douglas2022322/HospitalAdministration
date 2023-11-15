/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitaladministration;

/**
 *
 * @author dougl
 */
public class HospitalAdministration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Patient p1 = new Patient("Douglas", "15/11/23", "O+");
        Patient p2 = new Patient("Evelin", "16/07/2001", "A+");
        
        System.out.println(p1.getPatientID());
        System.out.println(p2.getPatientID());
    }
    
}
