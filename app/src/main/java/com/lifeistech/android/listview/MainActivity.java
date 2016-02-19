package com.lifeistech.android.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // ListViewのインスタンスを取得
    ListView list = (ListView)findViewById(R.id.listView);

    // リストアイテムのラベルを格納するArrayListをインスタンス化
    ArrayList<String> labelList = new ArrayList<String>();

    // "List Item + ??"を20個リストに追加
    for(int i=1; i<=20; i++){
        labelList.add("List Item "+i);
    }

    // Adapterのインスタンス化
    // 第三引数にlabelListを渡す
    CustomAdapter mAdapter = new CustomAdapter(this, 0, labelList);

    // リストにAdapterをセット
    list.setAdapter(mAdapter);

    // リストアイテムの間の区切り線を非表示にする
    list.setDivider(null);
}
