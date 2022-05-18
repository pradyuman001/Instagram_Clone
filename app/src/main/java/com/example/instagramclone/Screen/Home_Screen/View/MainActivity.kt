package com.example.instagramclone.Screen.Home_Screen.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.instagramclone.Fragments.*
import com.example.instagramclone.R
import com.example.instagramclone.Screen.Home_Screen.Controller.MyViewPager_Adapter

class MainActivity : AppCompatActivity() {

    lateinit var profile_img: ImageView
    lateinit var activity_img: ImageView
    lateinit var reels_img: ImageView
    lateinit var search_img: ImageView
    lateinit var home_img: ImageView
    lateinit var frame_layout: FrameLayout
    lateinit var viewpager: ViewPager

    var img = arrayOf(R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding()

/*

        var adapter_view = MyViewPager_Adapter(this,img);
        viewpager.adapter  = adapter_view;
*/

        loadfragment(Home_Fragment())

        home_img.setOnClickListener {

            loadfragment(Home_Fragment())

            var toast = Toast.makeText(this, "Home", Toast.LENGTH_LONG)
            toast.show()

        }

        search_img.setOnClickListener {

            loadfragment(Search_Fragment())

            var toast = Toast.makeText(this, "Search", Toast.LENGTH_LONG)
            toast.show()

        }

        reels_img.setOnClickListener {

            var toast = Toast.makeText(this, "Reels", Toast.LENGTH_LONG)
            toast.show()

            loadfragment(Reels_Fragment())
        }

        activity_img.setOnClickListener {

            var toast = Toast.makeText(this, "Activity", Toast.LENGTH_LONG)
            toast.show()

            loadfragment(Activity_Fragment())

        }
        profile_img.setOnClickListener {

            var toast = Toast.makeText(this, "Profile", Toast.LENGTH_LONG)
            toast.show()

            loadfragment(Profile_Fragment())

        }


    }

    fun binding() {


/*
        viewpager=findViewById<ViewPager>(R.id.viewpager);
*/

        frame_layout = findViewById<FrameLayout>(R.id.frame_layout)
        home_img = findViewById<ImageView>(R.id.home_img)
        search_img = findViewById<ImageView>(R.id.search_img)
        reels_img = findViewById<ImageView>(R.id.reels_img)
        activity_img = findViewById<ImageView>(R.id.activity_img)
        profile_img = findViewById<ImageView>(R.id.profile_img)

    }

    fun loadfragment(fragment : Fragment){

        var fragmentTransient = supportFragmentManager.beginTransaction()
        fragmentTransient.replace(R.id.frame_layout,fragment)
        fragmentTransient.commit()

    }

}