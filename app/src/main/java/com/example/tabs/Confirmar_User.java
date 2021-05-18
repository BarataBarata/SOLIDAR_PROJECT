package com.example.tabs;

import java.util.ArrayList;

public class Confirmar_User {
    ArrayList<User> lista_user=new ArrayList<>();

    public Confirmar_User() {
        lista_user.add(new User("barata","barata"));
    }

   public void adduser(User user){
         lista_user.add(user);
    }

    public boolean verificar(String email, String password){
          for(int i=0;i<lista_user.size();i++){
              if(lista_user.get(i).getPassword().equals(password) && lista_user.get(i).getEmail().equals(email)){
                  return true;
              }
          }
        return false;
    }
}
