package com.aashay.disablegridviewscrolling

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.BaseAdapter
import android.widget.ImageView

private val myImages = arrayOf(
    R.drawable.logo,
    R.drawable.logo,
    R.drawable.logo,
    R.drawable.logo,
    R.drawable.logo,
    R.drawable.logo,
    R.drawable.logo,
)

class MyGridViewAdapter constructor(c:Context): BaseAdapter() {
    private val context: Context = c
    override fun getCount(): Int {
        return myImages.size
    }
    override fun getItem(position: Int): Any? {
        return null
    }
    override fun getItemId(position: Int): Long {
        return 0
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageView: ImageView
        if (convertView == null) {
            imageView = ImageView(context)
            imageView.layoutParams = AbsListView.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            imageView.scaleType = ImageView.ScaleType.CENTER_CROP
            imageView.setPadding(30, 30, 30, 30)
        }
        else {
            imageView = convertView as ImageView
        }
        imageView.setImageResource(myImages[position])
        return imageView
    }
}