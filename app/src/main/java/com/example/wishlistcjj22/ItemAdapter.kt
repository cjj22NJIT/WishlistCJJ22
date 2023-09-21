package com.example.wishlistcjj22
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.*
import com.example.wishlistcjj22.R

class ItemAdapter(private val items: List<Item>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>()  {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val nameTextView: TextView
        val priceTextView: TextView
        val urlTextView: TextView

        init {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            nameTextView = itemView.findViewById(R.id.nameTextView)
            priceTextView = itemView.findViewById(R.id.priceTextView)
            urlTextView = itemView.findViewById(R.id.urlTextView)
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.wishlistitem_item, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val item = items.get(position)
        // Set item views based on views and data model
        holder.nameTextView.text = item.name
        holder.priceTextView.text = item.price
        holder.urlTextView.text = item.url
    }

    override fun getItemCount(): Int {
        return items.size
    }
}