package com.example.tabs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<User_Parturiente> userlist;
    public Adapter(List<User_Parturiente> userlist){
        this.userlist=userlist;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        int resource=userlist.get(position).getImagem1();
        String texto_nome=userlist.get(position).getTexto_nome();
        String idade=userlist.get(position).getIdade();
        String texto_dividir=userlist.get(position).getTexto_Divisao_do_traco();
        String texto_hora=userlist.get(position).getTexto_hora();
        String texto_dilatacao=userlist.get(position).getDilatacao();

        holder.setDate(resource,texto_dilatacao,texto_nome,idade,texto_dividir,texto_hora);
    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
         private ImageView imageView;
         private TextView texo_nome1;
         private  TextView texo_idade1;
         private  TextView texto_hora1;
         private  TextView texto_dividir1;
         private  TextView texto_dilatacao1;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

              imageView=itemView.findViewById(R.id.imageview1);
              texo_nome1=itemView.findViewById(R.id.texto_nome);
              texo_idade1=itemView.findViewById(R.id.idade);
              texto_hora1=itemView.findViewById(R.id.texto_hora);
              texto_dividir1=itemView.findViewById(R.id.texto_traco);
              texto_dilatacao1=itemView.findViewById(R.id.dilatacao);

        }


        public void setDate(int resource, String dilatacao, String texto_nome, String idade, String texto_dividir, String texto_hora) {
                 imageView.setImageResource(resource);
                 texo_nome1.setText(texto_nome);
                 texo_idade1.setText(idade);
                 texto_dividir1.setText(texto_dividir);
                 texto_hora1.setText(texto_hora);
                 texto_dilatacao1.setText(dilatacao);
        }
    }
}
