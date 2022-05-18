package com.example.instagramclone.Screen.Home_Screen.Controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.example.instagramclone.R
import com.example.instagramclone.Screen.Home_Screen.View.MainActivity

class MyViewPager_Adapter(val mainActivity: MainActivity, val img: Array<Int>) : PagerAdapter() {
    override fun getCount(): Int {
        return img.size;
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var view =
            LayoutInflater.from(mainActivity).inflate(R.layout.viewpager_item, container, false);
        var view_item_img = view.findViewById<ImageView>(R.id.view_item_img);
        view_item_img.setImageResource(img[position])
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }
}