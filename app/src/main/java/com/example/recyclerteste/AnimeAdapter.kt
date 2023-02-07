package com.example.recyclerteste

import android.provider.ContactsContract.Data
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.recyclerteste.databinding.CatalogoRoomBinding
import com.example.recyclerteste.models.Anime

class AnimeAdapter(): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var items= ArrayList<Anime>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var list = CatalogoRoomBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return AnimeViewHolder(list)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
        is AnimeViewHolder ->{
            holder.bind(items[position])
        }
        }

    }
    fun dataSource(anime:ArrayList<Anime>){
        this.items=anime
    }

    class AnimeViewHolder constructor(binding: CatalogoRoomBinding):RecyclerView.ViewHolder(binding.root) {
        var nomeAnime= binding.nomeDoAnime
        var capaAnime= binding.capaDoAnime

        fun bind(anime: Anime){
            nomeAnime.text=anime.nome

            var requestOptions=RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(anime.capaUrl)
                .into(capaAnime)
        }





    }

}