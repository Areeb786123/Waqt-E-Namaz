package com.example.waqt_e_namaz.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.waqt_e_namaz.Adapter.Timming_adapter
import com.example.waqt_e_namaz.Model.Timming
import com.example.waqt_e_namaz.R
import com.example.waqt_e_namaz.retrofit.Common
import com.example.waqt_e_namaz.retrofit.Retrofit_Service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit


class home_Fragment : Fragment() {

    private lateinit var mAdapter : Timming_adapter
    lateinit var mService: Retrofit_Service
    lateinit var layoutManager: LinearLayoutManager
    lateinit var recyclerView: RecyclerView






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




    }

    private fun getNamaz() {
        mService.get_namaz_timming().enqueue(object : Callback<MutableList<Timming>> {
            override fun onResponse(
                call: Call<MutableList<Timming>>,
                response: Response<MutableList<Timming>>
            ) {
                mAdapter = Timming_adapter(response.body() as MutableList<Timming>)
                mAdapter.notifyDataSetChanged()
                recyclerView.adapter = mAdapter


            }

            override fun onFailure(call: Call<MutableList<Timming>>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_home_, container, false)
        recyclerView=root.findViewById(R.id.recycler_view)
        mService=Common.retrofitService

        recyclerView.setHasFixedSize(true)
        layoutManager=LinearLayoutManager(activity)
        recyclerView.layoutManager=layoutManager
        getNamaz()




        return root


        //getNamaz_waqt()

    }



        }