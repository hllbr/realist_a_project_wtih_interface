/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 90552
 */
public class ComlexUserCheckServise implements IUserCheckService{

    @Override
    public boolean checkUser(User user) {
         
        if(user.getAge()>=18 && user.getName().startsWith("@")){
            return true ;
        }
        return false;
    }
    }

