package binar.andlima.challengechaptertiga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_screen_dua.*
import kotlinx.android.synthetic.main.fragment_screen_empat.*
import kotlinx.android.synthetic.main.fragment_screen_satu.*


class ScreenEmpatFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen_empat, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       btn_backtoscreentiga.setOnClickListener{

          //  val serializ = Person(20, "JL" , "MAHASISWA")
          //   val data  = bundleOf("DATASEMUA", serializ)


                val datanama = arguments?.getString("NAMA")
                val usia = et_usia.text.toString().toInt()
                val alamat = et_alamat.text.toString()
                val pekerjaan = et_pekerjaan.text.toString()
                val data = bundleOf("USIA" to usia, "JL" to alamat, "mahasiswa" to pekerjaan, "NAMA" to datanama)



            Navigation.findNavController(view).navigate(R.id.screenEmpatFragment2_back_screenTigaFragment, data
            )
        }
    }




}