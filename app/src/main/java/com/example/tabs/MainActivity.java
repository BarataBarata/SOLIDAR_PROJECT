package com.example.tabs;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button addUser;
    TextView nome;
    TextView apelido;
    TextView idade;
    TextView dilatacao;
//------------------------------
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    public AddUser user;
    Adapter adapter;
    List<User_Parturiente> userlist;
    //...............................
     DrawerLayout drawerLayout;
     ActionBarDrawerToggle toggle;
     NavigationView navigationView;
    //...............................
     ViewPager pager;
     TabLayout mTablayout;
     TabItem firstitem, seconditem,thirditem;
//.........................................
     @Override
       protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(!new ConfirmarLogin().getConfirmacao()) {
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
        }

         pager=findViewById(R.id.viewpager);
         mTablayout=findViewById(R.id.mtablayout);
         firstitem=findViewById(R.id.firstitem);
         seconditem=findViewById(R.id.seconditem);
         thirditem=findViewById(R.id.thirditem);
         PagerAdapter adapte;
         Toolbar toolbar=findViewById(R.id.toolbar);
         setSupportActionBar(toolbar);

         drawerLayout=findViewById(R.id.drawer);
         navigationView=findViewById(R.id.nav_view);

         toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
         drawerLayout.addDrawerListener(toggle);
         toggle.setDrawerIndicatorEnabled(true);
         toggle.syncState();

         adapte=new PageAdapder(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,mTablayout.getTabCount());
         pager.setAdapter(adapte);

         mTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
             @Override
             public void onTabSelected(TabLayout.Tab tab) {
                 pager.setCurrentItem(tab.getPosition());
                  if(tab.getPosition()==0){
                      initRecycliViewNotificacao();
                  }
                 if(tab.getPosition()==2 || tab.getPosition()==1) {
                      onclickButton();
                      geral_inicializar();
                  }
                 // getActivity
             }

             @Override
             public void onTabUnselected(TabLayout.Tab tab) {

             }

             @Override
             public void onTabReselected(TabLayout.Tab tab) {

             }
         });
         pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTablayout));

    }

    public void geral_inicializar(){
        new AddUser().inicializar();
        initRecycliView();
    }

    public void initRecycliView(){
        recyclerView=findViewById(R.id.recicle);
        linearLayoutManager =new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter=new Adapter(new AddUser().lista());
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initRecycliViewNotificacao() {
        recyclerView=findViewById(R.id.recicle_notificacao);
        linearLayoutManager =new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter=new Adapter(new Notificacao().lista_Notificacao());
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    public void onclickButton(){

        addUser=findViewById(R.id.id_button_adduser);
        addUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //new AddUser().addUser(new ModelClass(R.drawable.foto2,"Carlos","28","15:58pm","", "4"));
                iniRegisto();
            }
        });
    }


    public static void logout(Activity mainActivity) {
        AlertDialog.Builder builder=new AlertDialog.Builder(mainActivity);
        //builder.setMessage("Logout");
        builder.setMessage(" Os Dados Foram Adicionados com sucesso ...");
        builder.setPositiveButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                mainActivity.finishAffinity();
                System.exit(0);
            }
        });
        builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }


    public void iniRegisto(){

        nome=(TextView)findViewById(R.id.id_nome);
        apelido=(TextView)findViewById(R.id.id_apelido);
        idade=(TextView)findViewById(R.id.id_idade_registo);
        dilatacao=(TextView)findViewById(R.id.id_dilatacao);


        if(new Alerta_Dilatacao().alerta_Dilatacao(Integer.parseInt(dilatacao.getText().toString())).equals("verde")){
            new Notificacao().addNotificacao(new User_Parturiente(R.drawable.alerta_verde,nome.getText().toString(),idade.getText().toString(),"15:58pm","", dilatacao.getText().toString()));
        }else {
            if(new Alerta_Dilatacao().alerta_Dilatacao(Integer.parseInt(dilatacao.getText().toString())).equals("vermelho")){
                new Notificacao().addNotificacao(new User_Parturiente(R.drawable.alerta_vermelha,nome.getText().toString(),idade.getText().toString(),"15:58pm","", dilatacao.getText().toString()));
            }else {
                new AddUser().addUser(new User_Parturiente(R.drawable.userwoman,nome.getText().toString(),idade.getText().toString(),"15:58pm","", dilatacao.getText().toString()));
            }
        }
        logout(this);
    }
}