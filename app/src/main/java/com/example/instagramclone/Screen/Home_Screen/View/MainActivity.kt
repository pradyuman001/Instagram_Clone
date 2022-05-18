package com.example.instagramclone.Screen.Home_Screen.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.viewpager.widget.ViewPager
import com.example.instagramclone.R
import com.example.instagramclone.Screen.Home_Screen.Controller.MyViewPager_Adapter

class MainActivity : AppCompatActivity() {

    lateinit var activity_btn: Button
    lateinit var reels_btn: Button
    lateinit var search_btn: Button
    lateinit var home_btn: Button
    lateinit var frame_layout: FrameLayout
    lateinit var viewpager: ViewPager

    var img = arrayOf(R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding()


        var adapter_view = MyViewPager_Adapter(this,img);
        viewpager.adapter  = adapter_view;























//        loadfragment(Home_Fragment())
//
//        home_btn.setOnClickListener {
//
//            loadfragment(Home_Fragment())
//
//            var toast = Toast.makeText(this, "Home", Toast.LENGTH_LONG)
//            toast.show()
//
//        }
//
//        search_btn.setOnClickListener {
//
//            loadfragment(Search_Fragment())
//
//            var toast = Toast.makeText(this, "Search", Toast.LENGTH_LONG)
//            toast.show()
//
//        }
//
//        reels_btn.setOnClickListener {
//
//            var toast = Toast.makeText(this, "Reels", Toast.LENGTH_LONG)
//            toast.show()
//
//            loadfragment(Reels_Fragment())
//        }
//
//        activity_btn.setOnClickListener {
//
//            var toast = Toast.makeText(this, "Activity", Toast.LENGTH_LONG)
//            toast.show()
//
//            loadfragment(Activity_Fragment())
//
//        }


    }

    fun binding() {


        viewpager=findViewById<ViewPager>(R.id.viewpager);

//        frame_layout = findViewById<FrameLayout>(R.id.frame_layout)
//        home_btn = findViewById<Button>(R.id.home_btn)
//        search_btn = findViewById<Button>(R.id.search_btn)
//        reels_btn = findViewById<Button>(R.id.reels_btn)
//        activity_btn = findViewById<Button>(R.id.activity_btn)

    }

//    fun loadfragment(fragment : Fragment){
//
//        var fragmentTransient = supportFragmentManager.beginTransaction()
//        fragmentTransient.replace(R.id.frame_layout,fragment)
//        fragmentTransient.commit()
//
//    }

}