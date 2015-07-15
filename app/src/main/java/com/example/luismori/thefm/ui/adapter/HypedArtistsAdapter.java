package com.example.luismori.thefm.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.luismori.thefm.R;
import com.example.luismori.thefm.domain.Artist;

import java.util.ArrayList;

/**
 * Created by luismori on 7/13/15.
 */
public class HypedArtistsAdapter  extends RecyclerView.Adapter<HypedArtistsAdapter.HypedArtistViewHolder>{

    ArrayList<Artist> artists;


    Context context;
    // para tener acceso al context de la actividad
    // cuando se cree el adaptador se tendra una instanacia del contexto
    public HypedArtistsAdapter(Context context) {
        this.context = context;
        // inicializamos para eviartar null point exceptions
        this.artists = new ArrayList<Artist>();
    }

    // por cada item se ejecta este
    @Override
    public HypedArtistViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // inflamos el item view con el xml
        // le pasamos el archivo que va a inflar
        // luego lo coloca en el parent que es un view group
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.item_hyped_artists, parent, false);

        return new HypedArtistViewHolder(itemView);
    }

    // este metodo cambia los datos
    @Override
    public void onBindViewHolder(HypedArtistViewHolder holder, int position) {
        // obtenemos instancias
        Artist currentArtist = artists.get(position);
        holder.setArtistName(currentArtist.getName());

    }

    //primero metodo que se ejecuta automaticamente
    // para saber cuantos items va a pintar el recycler view
    @Override
    public int getItemCount() {
        // si lo dejamos en 0 no mostrara nada
        return artists.size();
    }

    public void addAll(@NonNull ArrayList<Artist> artists){
        if(artists == null) {
            throw new NullPointerException("The item cannot be null");
        }

        this.artists.addAll(artists);
        // notificar cuando haya mas items
        notifyItemRangeInserted(getItemCount(), artists.size());

    }

    // el view holder tiene los datos de cada item del layout
    //para ser usados
    public class HypedArtistViewHolder extends RecyclerView.ViewHolder {
        // agregamos todos los datos que vamos a llenar en el item layout
        TextView artistName;
        ImageView artistImage;

        // constructor
        public HypedArtistViewHolder(View itemView) {
            super(itemView);

            artistName = (TextView) itemView.findViewById(R.id.txt_name);
            artistImage = (ImageView) itemView.findViewById(R.id.img_artist);

        }

        public void setArtistName (String name) {
            artistName.setText(name);
        }

    }

}
