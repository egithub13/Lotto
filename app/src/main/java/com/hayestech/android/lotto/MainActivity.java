package com.hayestech.android.lotto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter mAdapter;
    LinearLayoutManager mLayoutManager;
    ArrayList<Lotto> lottoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lottoList = new ArrayList<>();
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);

        for(int i = 0;i < 5;i++){
            Lotto lotto = new Lotto(getNumbers(),getPowerBall());
            lottoList.add(lotto);
        }

        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new MyAdapter(lottoList,MainActivity.this);

        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);
    }

    public String getPowerBall(){
        int min = 1;
        int max = 25;
        Random random = new Random();
        String rand = String.valueOf(random.nextInt(max - min +1) + min);
        return rand;

    }

    public ArrayList<String> getNumbers(){
        int min = 1;
        int max = 69;
        ArrayList<String> tempString = new ArrayList<>();
        while(tempString.size() < 6){
            Random random = new Random();
            String rand = String.valueOf(random.nextInt(max - min +1) + min);
            if(!tempString.contains(rand)){
                tempString.add(rand);
            }
        }
        return tempString;
    }
}
