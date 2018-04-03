/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.IDatabase;
import interfaces.IFileArchive;
import interfaces.IType;

/**
 *
 * @author vfgya_000
 */
public class Type implements IType{

    @Override
    public IDatabase database() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IFileArchive fileArchive() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
