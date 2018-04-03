/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author vfgya_000
 */
public interface ICRUD {

    void create(Object<T> o);

    void read(Object<T> o);

    void update(Object<T> o);

    void delete(Object<T> o);
}
