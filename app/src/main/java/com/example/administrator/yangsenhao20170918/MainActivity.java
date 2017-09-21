package com.example.administrator.yangsenhao20170918;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;

import static com.example.administrator.yangsenhao20170918.R.id.recyclerview;

public class MainActivity extends AppCompatActivity implements Http.NetDataCallback {
    private RecyclerView mrv;
    private String url="https://news-at.zhihu.com/api/4/news/latest";
    private MyAdapter md;
    private Http http;
    private ArrayList<My_Bean.StoriesBean> mlist=new ArrayList<>();
    public Handler hand=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            Gson gson=new Gson();
            super.handleMessage(msg);
            if (msg.what==1){
                My_Bean news = gson.fromJson(msg.obj.toString(), My_Bean.class);
                // mlist=(ArrayList<NewsData.DataBean>) newsData.getData();
                mlist=(ArrayList<My_Bean.StoriesBean>) news.stories;
                md.setdata((ArrayList<My_Bean.StoriesBean>) mlist);
                md.notifyDataSetChanged();

            }
        }
    };
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrv=(RecyclerView)findViewById(recyclerview);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Object o = null;
                System.out.println(o.toString());
            }
        });
        initdata();
        mrv.setLayoutManager(new LinearLayoutManager(this));
        md=new MyAdapter(this,mlist);
        mrv.setAdapter(md);

        //RecyclerView条目的点击事件
        md.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int postion) {
                Toast.makeText(MainActivity.this, mlist.get(postion).title, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

    }

    private void initdata() {
        Http http=new Http();
        http.getdata(url,this);
    }


    @Override
    public void callback(String str) {
        Message msg = Message.obtain();
        msg.what=1;
        msg.obj=str;
        hand.sendMessage(msg);

    }

    @Override
    public void err(int code, String s) {

    }
}