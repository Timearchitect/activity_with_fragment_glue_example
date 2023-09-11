package se.gritacademy.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import se.gritacademy.myapplication.MainActivity.Companion.staticTv

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var v = inflater.inflate(R.layout.fragment_blank, container, false)

        var tv = v.findViewById<TextView>(R.id.fragText)
        tv.text = "FUNKAR JA!!!!"

        (activity as MainActivity).findViewById<TextView>(R.id.textView2).text="YESYES "
        (activity as MainActivity).tv.text = "YOYUOYOYOYOYOY"
        staticTv.text = "STATIC"

        return v
    }

    override fun onStart() {
        super.onStart()

        /*var tv = view?.findViewById<TextView>(R.id.fragText)

        (activity as MainActivity).fragmentDoneLoading(tv!!)*/
    }
}