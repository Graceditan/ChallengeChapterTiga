package binar.andlima.challengechaptertiga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_screen_tiga.*
import binar.andlima.challengechaptertiga.R
import kotlinx.android.synthetic.main.fragment_screen_satu.*


class ScreenTigaFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Inflate the layout for this fragment
         return inflater.inflate(R.layout.fragment_screen_tiga, container, false)
       // val dataperson = intent.getSerializableExtra("ANSATU") as Person
        // tv_usia.text = dataperson.usia
        // tv_alamat.text = dataperson.alamat
        // tv_pekerjaan.text = dataperson.pekerjaan
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val datanama = arguments?.getString("NAMA")
        tv_nama.text = datanama

        btn_gotoscreenempat.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.screenTigaFragment_to_screenEmpatFragment2)
        }
        val usia = arguments?.getInt("USIA")
        val ganjilgenap = if(usia?.div(2)  == 0) {
            "Genap"
        }else{
            "Ganjil"
        }
        val alamat = arguments?.getString("JL")
        val pekerjaan = arguments?.getString("MAHASISWA")

        tv_usia.text = usia.toString()
        tv_alamat.text = alamat
        tv_pekerjaan.text = pekerjaan
        tv_ganjilgenap.text = ganjilgenap



    }




}