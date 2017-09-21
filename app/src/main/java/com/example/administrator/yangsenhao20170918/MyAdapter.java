package com.example.administrator.yangsenhao20170918;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017-9-18.
 */

public class MyAdapter extends   RecyclerView.Adapter{
private View view;
private Context mcontext;
private ArrayList<My_Bean.StoriesBean> mlist=new ArrayList<>();
private OnItemClickListener mClickListener;

public MyAdapter(Context mcontext,ArrayList<My_Bean.StoriesBean> list) {
        this.mcontext = mcontext;
        this.mlist=list;
        }

@Override
public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.item, null);
        return new ViewHolder(view,mClickListener);

        }

@Override
public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        ViewHolder viewholder= (ViewHolder)holder;
        viewholder.textview.setText(""+mlist.get(position).title);
        Glide.with(mcontext).load(getItem(position).images.get(0)).into(viewholder.ima);
        //只给标题设置的点击事件
     /*   viewholder.textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mcontext, mlist.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });*/

        }
//手写的重置数据的方法
public void setdata(ArrayList<My_Bean.StoriesBean> list){
        if (list!=null&&list.size()>0){
        mlist.addAll(list);
        }

        }
//手写的获得视图的方法
public My_Bean.StoriesBean getItem(int position){
        return mlist.get(position);

        };

@Override
public int getItemCount() {
        return mlist.size();
        }
//自定义的方法
public void setOnItemClickListener(OnItemClickListener listener){
        this.mClickListener=listener;
        }
public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    private OnItemClickListener mListener;// 声明自定义的接口

    private TextView textview;
    private ImageView ima;
    //把定义的接口作为参数放到方法内
    public ViewHolder(View itemView,OnItemClickListener  listener) {
        super(itemView);

        mListener=listener;
        //给item设置点击事件
        itemView.setOnClickListener(this);

        textview=(TextView)itemView.findViewById(R.id.textview);
        ima=(ImageView)itemView.findViewById(R.id.imageview);
    }

    @Override
    public void onClick(View v) {
        // getpostion()为Viewholder自带的一个方法，用来获取RecyclerView当前的位置，将此作为参数，传出去
        mListener.onItemClick(v,getPosition());

    }
}
//手写的一个接口
public interface OnItemClickListener {
    public void onItemClick(View view, int postion);
}
}