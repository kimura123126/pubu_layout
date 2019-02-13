package com.example.dell1.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
       // StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(3,
             //   StaggeredGridLayoutManager.VERTICAL);
       LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter=new FruitAdapter(fruitList);

        recyclerView.setAdapter(adapter);

    }
    private void initFruits(){
        for(int i=0;i<2;i++){
            Fruit adao1=new Fruit("adao1",R.drawable.adao1);
            fruitList.add(adao1);
            Fruit adao2=new Fruit("adao2",R.drawable.adao2);
            fruitList.add(adao2);
            Fruit dahu=new Fruit("Dahu",R.drawable.dahu);
            fruitList.add(dahu);
            Fruit dahu01=new Fruit("Dahu01",R.drawable.dahu01);
            fruitList.add(dahu01);
            Fruit dahu02=new Fruit("Dahu02",R.drawable.dahu02);
            fruitList.add(dahu02);
            Fruit dao=new Fruit("Dao",R.drawable.dao);
            fruitList.add(dao);
            Fruit dao01=new Fruit("Dao01",R.drawable.dao01);
            fruitList.add(dao01);
            Fruit dao02=new Fruit("Dao02",R.drawable.dao02);
            fruitList.add(dao02);
            Fruit tutu=new Fruit("Tutu",R.drawable.tutu);
            fruitList.add(tutu);
            Fruit tutu01=new Fruit("Tutu01",R.drawable.tutu01);
            fruitList.add(tutu01);
            Fruit tutu02=new Fruit("Tutu02",R.drawable.tutu02);
            fruitList.add(tutu02);
        }
    }
}
