package com.example.recyclerteste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerteste.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var animeAdapter: AnimeAdapter
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
        initDataSourceMock()

        binding.switch1.setOnCheckedChangeListener { buttonView, isChecked -> isChecked
            if (isChecked){
                binding.textView.text="Dark"
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

                binding.textView.text="Light"

            }
        }

    }

    private fun initDataSourceMock() {
        val datasrc=DataSourceMock.dataSourceMock()
        this.animeAdapter.dataSource(datasrc)
    }

    private fun initRecyclerView() {
        this.animeAdapter= AnimeAdapter()
        binding.recyclerView.layoutManager=LinearLayoutManager(this@MainActivity)
        binding.recyclerView.adapter=this.animeAdapter


    }
}