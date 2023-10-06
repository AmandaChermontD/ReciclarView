package com.example.reciclarview;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {
    List <Filme> listFilmes;

    public adapter (List<Filme> filmes){
    this.listFilmes= filmes;

}
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView titulo, ano, genero;
        public MyViewHolder(View itemView) {
            super(itemView);
            titulo= itemView.findViewById(R.id.TextViewIdTitulo);
            ano= itemView.findViewById(R.id.TextViewIdAno);
            genero= itemView.findViewById(R.id.TextViewIdGenero);
        }
    }




}
