import ShowListDirections.ShowListDirections
import com.example.soup.R

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ShowList : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.show_list_view,
            container,
            false,
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val showList = createSeriesList()

        view.findViewById<RecyclerView>(R.id.shows_list).apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = ListAdapter(showList, object : OnItemClickListener {
                override fun onItemClicked(showData: ShowData) {
                    // TODO
                     findNavController().navigate(
                        ShowListDirections.actionShowListToShowDetail(show = showData)
                     )
                }
            })
        }
    }
}

class ListAdapter(private val data: List<ShowData>, val listener: OnItemClickListener) :
    RecyclerView.Adapter<ListItem>() {

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItem {
        return ListItem(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.show_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ListItem, position: Int) {
        val show = data[position]
        holder.bindItem(show, position + 1)
        holder.itemView.setOnClickListener {
            listener.onItemClicked(show)
        }
    }
}

class ListItem(v: View) : RecyclerView.ViewHolder(v) {

    val ranking: TextView = v.findViewById(R.id.item_ranking)
    val title: TextView = v.findViewById(R.id.item_title)
    val episodes: TextView = v.findViewById(R.id.item_episodes)
    val producer: TextView = v.findViewById(R.id.item_producer)
    val date: TextView = v.findViewById(R.id.item_date)
    val image: ImageView = v.findViewById(R.id.item_image)

    fun bindItem(showData: ShowData, ranking: Int) {
        this.ranking.text = "#$ranking"
        title.text = showData.title
        episodes.text = "${showData.episodes.size} épisodes"
        producer.text = showData.producer
        date.text = showData.year.toString()

        Glide.with(itemView).load(showData.pictureUrl).into(image)
    }
}

interface OnItemClickListener {
    fun onItemClicked(showData: ShowData)
}