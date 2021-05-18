package com.example.tabs;

import java.util.ArrayList;
import java.util.List;

public  class Notificacao {

    static List<User_Parturiente> userlist_Notificacao=new ArrayList<>();
    static List<User_Parturiente> getUserlist_Notificacao_aux=new ArrayList<>();

    public  void reporLista_Notificacao(){

            if(getUserlist_Notificacao_aux.size()!=0){

                userlist_Notificacao.removeAll(userlist_Notificacao);
                    for(int i=0;i<getUserlist_Notificacao_aux.size();i++) {
                           userlist_Notificacao.add(i, getUserlist_Notificacao_aux.get(i));
            }
             getUserlist_Notificacao_aux.removeAll(getUserlist_Notificacao_aux);
         }
    }
    public void procura_Notificacao(String string){

          for(int i=0;i<userlist_Notificacao.size();i++){
              getUserlist_Notificacao_aux.add(i,userlist_Notificacao.get(i));
          }
          userlist_Notificacao.removeAll(userlist_Notificacao);
          for(int i=0;i<getUserlist_Notificacao_aux.size();i++){
              if(getUserlist_Notificacao_aux.get(i).getTexto_nome().equals(string)){
                  userlist_Notificacao.add(getUserlist_Notificacao_aux.get(i));
              }
          }

    }

    public void addNotificacao(User_Parturiente userParturiente){
        this.userlist_Notificacao.add(userParturiente);
    }
    public  List lista_Notificacao(){
        return this.userlist_Notificacao;
    }







    public void iniCializacao() {
//        userlist.add(new ModelClass(R.drawable.foto1,"Sara","25","15:58pm","", "7"));
//        userlist.add(new ModelClass(R.drawable.foto2,"Carlos","28","15:58pm","", "4"));
//        userlist.add(new ModelClass(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new ModelClass(R.drawable.foto1,"Sara","25","15:58pm","", "7"));
//        userlist.add(new ModelClass(R.drawable.foto2,"Carlos","28","15:58pm","", "4"));
//        userlist.add(new ModelClass(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new ModelClass(R.drawable.foto1,"Sara","25","15:58pm","", "7"));
//        userlist.add(new ModelClass(R.drawable.foto2,"Carlos","28","15:58pm","", "4"));
//        userlist.add(new ModelClass(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new ModelClass(R.drawable.foto1,"Sara","25","15:58pm","", "7"));
//        userlist.add(new ModelClass(R.drawable.foto2,"Carlos","28","15:58pm","", "4"));
//        userlist.add(new ModelClass(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new ModelClass(R.drawable.foto1,"Sara","25","15:58pm","", "7"));
//        userlist.add(new ModelClass(R.drawable.foto2,"Carlos","28","15:58pm","", "4"));
//        userlist.add(new ModelClass(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new ModelClass(R.drawable.foto1,"Sara","25","15:58pm","", "7"));
//        userlist.add(new ModelClass(R.drawable.foto2,"Carlos","28","15:58pm","", "4"));
//        userlist.add(new ModelClass(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new ModelClass(R.drawable.foto1,"Sara","25","15:58pm","", "7"));
//        userlist.add(new ModelClass(R.drawable.foto2,"Carlos","28","15:58pm","", "4"));
//        userlist.add(new ModelClass(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new ModelClass(R.drawable.foto1,"Sara","25","15:58pm","", "7"));
//        userlist.add(new ModelClass(R.drawable.foto2,"Carlos","28","15:58pm","", "4"));
//        userlist.add(new ModelClass(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new ModelClass(R.drawable.foto1,"Sara","25","15:58pm","", "7"));
//        userlist.add(new ModelClass(R.drawable.foto2,"Carlos","28","15:58pm","", "4"));
//        userlist.add(new ModelClass(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new ModelClass(R.drawable.foto1,"Sara","25","15:58pm","", "7"));
//        userlist.add(new ModelClass(R.drawable.foto2,"Carlos","28","15:58pm","", "4"));
//        userlist.add(new ModelClass(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new ModelClass(R.drawable.foto1,"Sara","25","15:58pm","", "7"));
//        userlist.add(new ModelClass(R.drawable.foto2,"Carlos","28","15:58pm","", "4"));
//        userlist.add(new ModelClass(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new ModelClass(R.drawable.foto1,"Sara","25","15:58pm","", "7"));
//        userlist.add(new ModelClass(R.drawable.foto2,"Carlos","28","15:58pm","", "4"));
//        userlist.add(new ModelClass(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new ModelClass(R.drawable.foto1,"Sara","25","15:58pm","", "7"));
//        userlist.add(new ModelClass(R.drawable.foto2,"Carlos","28","15:58pm","", "4"));
//        userlist.add(new ModelClass(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new ModelClass(R.drawable.foto1,"Sara","25","15:58pm","", "7"));
//
//        userlist.add(new ModelClass(R.drawable.foto2,"Carlos","28","15:58pm","", "4"));
//        userlist.add(new ModelClass(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));

    }

}
