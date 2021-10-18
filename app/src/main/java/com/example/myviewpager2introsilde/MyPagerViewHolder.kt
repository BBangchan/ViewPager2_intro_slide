package com.example.myviewpager2introsilde

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_intro_pager_item.view.*


class MyPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    // layout_intro_pager_item.xml 파일에 있는 textview와 ImageView, Background 컬러를 바꾸기 위해서
    // 값을 받아 준다.
    private val itemImage : ImageView = itemView.pager_item_image
    private val itemContent : TextView= itemView.pager_item_text
    private val itemBg : LinearLayout = itemView.pager_item_bg

    fun bindWithView(pageItem: PageItem) {
        itemImage.setImageResource(pageItem.imageSrc)
        itemContent.text = pageItem.content

        if(pageItem.bgcolor != R.color.colorWhite){
            itemContent.setTextColor(Color.WHITE)
        }

        itemBg.setBackgroundResource(pageItem.bgcolor)



    }


}