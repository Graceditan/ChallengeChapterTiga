package binar.andlima.challengechaptertiga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_screen_dua.*
import kotlinx.android.synthetic.main.fragment_screen_satu.*


class ScreenDuaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen_dua, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_gotoscreentiga.setOnClickListener{
            val nama = et_masukkannama.text.toString()
            val data = bundleOf("NAMA" to nama)
            Navigation.findNavController(view).navigate(R.id.screenDuaFragment_to_screenTigaFragment)
        }
    }


}