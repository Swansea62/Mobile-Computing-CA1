package com.example.my_ca

import androidx.recyclerview.widget.RecyclerView

class PokemonListAdapter(private val pokemonList: List<PokemonEntity>)
    :
    RecyclerView.Adapter<PokemonListAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val binding = ListItemBinding.bind(itemView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = pokemonList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pokemon = pokemonList[position]
        with(holder.binding) {
            pokemonName.text = pokemon.name
        }
    }
}