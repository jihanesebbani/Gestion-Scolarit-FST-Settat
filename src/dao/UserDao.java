/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.User;

/**
 *
 * @author lenovo
 */
public class UserDao extends AbstractDao<User>{

    public UserDao() {
        super(User.class);
    }
      public int seConnecter(User user) throws Exception {

        User loadedUser = findById(user.getId());
         
       
        if (loadedUser.getId().equals(user.getId())) {
            if (loadedUser.getPassword().equals(user.getPassword())) {
                
                return loadedUser.getType();
            }
            return -1;
        }
        return -2;
        
        
        
        
        
        

    }






}

