package com.hayestech.android.lotto;

import java.util.ArrayList;

/**
 * Created by Eric on 8/2/2017.
 */

public class Lotto {
    private ArrayList<String> numbers;
    private String powerBall;

    public Lotto(ArrayList<String> numbers, String powerBall) {
        this.numbers = numbers;
        this.powerBall = powerBall;
    }

    public String getOne(){
        return numbers.get(0);
    }
    public String getTwo(){
        return numbers.get(1);
    }
    public String getThree(){
        return numbers.get(2);
    }
    public String getFour(){
        return numbers.get(3);
    }
    public String getFive(){
        return numbers.get(4);
    }



    public String getPowerBall() {
        return powerBall;
    }


}
