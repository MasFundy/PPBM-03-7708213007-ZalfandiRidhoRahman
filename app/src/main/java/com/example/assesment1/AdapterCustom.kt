import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.assesment1.R



class AdapterCustom (private val context: Activity,
                     private val title: Array<String>,
                     private val imgid: Array<Int>,
                     private val desc: Array<String>)
    : ArrayAdapter<String>(context, R.layout.cobalistview, title) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.cobalistview, null, true)

        var _image = rowView.findViewById<ImageView>(R.id.icon)
        _image.setImageResource(imgid[position])

        var _name = rowView.findViewById<TextView>(R.id.title)
        _name.setText(title[position])

        var _descr = rowView.findViewById<TextView>(R.id.descripti)
        _descr.setText(desc[position])

        return rowView
    }
}