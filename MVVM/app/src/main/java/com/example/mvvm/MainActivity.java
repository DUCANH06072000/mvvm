package com.example.mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewFlipper ViewBaner,ViewFood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        ActionViewBaner();

    }

    private void ActionViewBaner() {
        ArrayList<String> qc= new ArrayList<>();
        qc.add("https://scontent.fhan3-1.fna.fbcdn.net/v/t1.15752-9/245114200_462827761748246_7734323081955370556_n.png?_nc_cat=111&ccb=1-5&_nc_sid=ae9488&_nc_ohc=JmaLhZDbgRwAX-MD2_a&_nc_ht=scontent.fhan3-1.fna&oh=4d2d7451dc55956475df68b9318d6df4&oe=6191EE89");
        qc.add("https://scontent.fhan3-1.fna.fbcdn.net/v/t1.15752-9/246476938_423088109391135_2900628906764097115_n.png?_nc_cat=102&ccb=1-5&_nc_sid=ae9488&_nc_ohc=nbI3oKEf-4MAX-jZWLt&tn=KI54-TLov7FcceE1&_nc_ht=scontent.fhan3-1.fna&oh=fb09e67c8971a93fe502d5ece5371ca4&oe=6194E7FB");
        qc.add("https://scontent.fhan3-1.fna.fbcdn.net/v/t1.15752-9/244713449_467828294473007_1132244305791229972_n.png?_nc_cat=111&ccb=1-5&_nc_sid=ae9488&_nc_ohc=7YI4glXd4WoAX8Kymdy&_nc_ht=scontent.fhan3-1.fna&oh=cd38f72bbb6a62c0d49003c9ff7cf846&oe=6192BEF3");
        qc.add("https://scontent.fhan3-3.fna.fbcdn.net/v/t1.15752-9/245530556_611368106562083_2090226476167467017_n.png?_nc_cat=101&ccb=1-5&_nc_sid=ae9488&_nc_ohc=W8wBQEIaBk4AX-lfMHS&_nc_oc=AQm5Nxx6W4nHH2CJxq8vTgbpEmsbiXHETvBFD1LEz2v2op5aL1Oax0U5NMnJYLqhq5g&tn=KI54-TLov7FcceE1&_nc_ht=scontent.fhan3-3.fna&oh=4cb535709d365d61d21c8745960d1eb6&oe=61924ACA");
    }

    private void Anhxa() {
        ViewBaner=findViewById(R.id.ViewBaner);
        ViewFood=findViewById(R.id.ViewFood);
    }
}