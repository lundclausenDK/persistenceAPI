/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenceapi;

import classes.Type;
import interfaces.IType;
import java.io.File;

/**
 *
 * @author vfgya_000
 */
public class PersistenceAPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person p = new Person("Jack");
        File f;
                
        IType t = new Type();
        t.database().getConnection().create(p);
        t.fileArchive().getConnection().create(f);
        
        // TODO code application logic here
    }
    
}
