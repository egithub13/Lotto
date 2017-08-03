package com.hayestech.android.lotto;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Eric on 8/2/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    ArrayList<Lotto> numbers;
    Context context;


    public MyAdapter(ArrayList<Lotto> numbers, Context context) {
        this.numbers = numbers;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_row,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
        Lotto lotto = numbers.get(position);
        holder.tv1.setText(lotto.getOne());
        holder.tv2.setText(lotto.getTwo());
        holder.tv3.setText(lotto.getThree());
        holder.tv4.setText(lotto.getFour());
        holder.tv5.setText(lotto.getFive());
        holder.tv6.setText(lotto.getPowerBall());

    }

    @Override
    public int getItemCount() {
        return numbers.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv1,tv2,tv3,tv4,tv5,tv6;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv1 = (TextView)itemView.findViewById(R.id.tv1);
            tv2 = (TextView)itemView.findViewById(R.id.tv2);
            tv3 = (TextView)itemView.findViewById(R.id.tv3);
            tv4 = (TextView)itemView.findViewById(R.id.tv4);
            tv5 = (TextView)itemView.findViewById(R.id.tv5);
            tv6 = (TextView)itemView.findViewById(R.id.tv6);

        }
    }
}
