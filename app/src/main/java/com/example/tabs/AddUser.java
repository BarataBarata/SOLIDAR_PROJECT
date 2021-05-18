package com.example.tabs;

import java.util.ArrayList;
import java.util.List;

public  class AddUser {

    static List<User_Parturiente> userlist=new ArrayList<>();
    static List<User_Parturiente> userlist_aux=new ArrayList<>();

    public void inicializar(){
        if(userlist.size()==0) {
            userlist.add(new User_Parturiente(R.drawable.userwoman, "Sara", "25", "15:58pm", "", "7"));
            userlist.add(new User_Parturiente(R.drawable.userwoman, "Sara", "25", "15:58pm", "", "7"));
            userlist.add(new User_Parturiente(R.drawable.userwoman, "Sara", "25", "15:58pm", "", "7"));
            userlist.add(new User_Parturiente(R.drawable.userwoman, "Sara", "25", "15:58pm", "", "7"));
            userlist.add(new User_Parturiente(R.drawable.userwoman, "Sara", "25", "15:58pm", "", "7"));
            userlist.add(new User_Parturiente(R.drawable.userwoman, "Sara", "25", "15:58pm", "", "7"));
            userlist.add(new User_Parturiente(R.drawable.userwoman, "Sara", "25", "15:58pm", "", "7"));
            userlist.add(new User_Parturiente(R.drawable.userwoman, "Sara", "25", "15:58pm", "", "7"));
            userlist.add(new User_Parturiente(R.drawable.userwoman, "Sara", "25", "15:58pm", "", "7"));
            userlist.add(new User_Parturiente(R.drawable.userwoman, "Sara", "25", "15:58pm", "", "7"));
            userlist.add(new User_Parturiente(R.drawable.userwoman, "Sara", "25", "15:58pm", "", "7"));
            userlist.add(new User_Parturiente(R.drawable.userwoman, "Sara", "25", "15:58pm", "", "7"));
            userlist.add(new User_Parturiente(R.drawable.userwoman, "Sara", "25", "15:58pm", "", "7"));
            userlist.add(new User_Parturiente(R.drawable.userwoman, "Sara", "25", "15:58pm", "", "7"));
            userlist.add(new User_Parturiente(R.drawable.userwoman, "Sara", "25", "15:58pm", "", "7"));
            userlist.add(new User_Parturiente(R.drawable.userwoman, "Sara", "25", "15:58pm", "", "7"));
            userlist.add(new User_Parturiente(R.drawable.userwoman, "Sara", "25", "15:58pm", "", "7"));
        }
    }

    public  void reporLista(){

            if(userlist_aux.size()!=0){
                System.out.println(" a lista nao esta vazia..");
            userlist.removeAll(userlist);
            for(int i=0;i<userlist_aux.size();i++) {
                userlist.add(i, userlist_aux.get(i));
            }
             userlist_aux.removeAll(userlist_aux);
         }
    }
    public void procura(String string){

          for(int i=0;i<userlist.size();i++){
              userlist_aux.add(i,userlist.get(i));
          }
          userlist.removeAll(userlist);
          for(int i=0;i<userlist_aux.size();i++){
              if(userlist_aux.get(i).getTexto_nome().equals(string)){
                  userlist.add(userlist_aux.get(i));
              }
          }

    }



    public void addUser(User_Parturiente userParturiente){
        this.userlist.add(userParturiente);
    }


    public  List lista(){
        return this.userlist;
    }



    public void iniCializacao() {
     //   userlist.add(new ModelClass(R.drawable.foto1,"Sara","25","15:58pm","", "7"));
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
//       userlist.add(new User_Parturiente(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new User_Parturiente(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new User_Parturiente(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new User_Parturiente(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new User_Parturiente(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
//        userlist.add(new User_Parturiente(R.drawable.foto3,"Antonio","24","15:58pm","", "9"));
   }

}
