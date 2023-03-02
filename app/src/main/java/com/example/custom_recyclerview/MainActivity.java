package com.example.custom_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<FTeam> teamList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamList = new ArrayList<>();
        teamList.add(new FTeam("https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Flag_of_the_Netherlands.svg/255px-Flag_of_the_Netherlands.svg.png","Netherlands","A"));
        teamList.add(new FTeam("https://media.istockphoto.com/id/1285110602/vector/senegal-national-flag-in-exact-proportions-vector.jpg?s=612x612&w=0&k=20&c=uhVZ-8FNpjG8g1bfedXFjSW0JDpzXwrRw8xBvGJF6Tc=","Senegal","A"));
        teamList.add(new FTeam("https://media.istockphoto.com/id/1309831149/photo/highly-detailed-flag-of-qatar-qatar-flag-high-detail-national-flag-qatar-large-size-flag-jpeg.jpg?s=612x612&w=0&k=20&c=w253yvHL9ilalj79rEMEBAKfncBhJjWwWj64LRbvPZ0=","Qatar","A"));
        teamList.add(new FTeam("data:image/jpeg;base64,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","Ecuador","A"));
        teamList.add(new FTeam("data:image/jpeg;base64,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","England","B"));
        teamList.add(new FTeam("https://cdn.pixabay.com/photo/2017/02/06/15/09/american-flag-2043285__340.png","USA","B"));
        teamList.add(new FTeam("https://cdn.shopify.com/s/files/1/0065/0661/0770/products/iran_1024x1024@2x.jpg?v=1558054656","Iran","B"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/7151091.jpg","Wales","B"));
        teamList.add(new FTeam("https://cdn.pixabay.com/photo/2016/06/16/01/20/argentina-1460299_960_720.jpg","Argentina","C"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/881331.jpg","Saudi Arabia","C"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/1410623.jpg","Poland","C"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/283449.jpg","Mexico","C"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/2781056.jpg","Denmark","D"));
        teamList.add(new FTeam("https://media.istockphoto.com/id/985068254/vector/tunisia-flag-background.jpg?s=612x612&w=0&k=20&c=N3NIaCqQbmrZUn10MOaIZpefjELDqj3798VXKGBPpkk=","Tunisia","D"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/397845.jpg","France","D"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/111662.jpg","Australia","D"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/1299687.jpg","Germany","E"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/385.jpg","Japan","E"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/1099383.jpg","Spain","E"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/3899799.jpg","Costa Rica","E"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/3840659.jpg","Morocco","F"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/1458596.jpg","Croatia","F"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/1410989.jpg","Belgium","F"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/121219.jpg","Canada","F"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/1303345.jpg","Switzerland","G"));
        teamList.add(new FTeam("https://i.pinimg.com/originals/e1/28/eb/e128eb40d305d196b6db056c2e080c16.png","Cameroon","G"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/4212345.jpg","Brazil","G"));
        teamList.add(new FTeam("https://media.istockphoto.com/id/1399771389/vector/flag-of-serbia.jpg?s=612x612&w=0&k=20&c=-ul4NuQdBSrLM1EvtuhAqoVdtD7uwOMPE1Jbm6xOsWk=","Serbia","G"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/1075169.jpg","Portugal","H"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/1410995.jpg","Ghana","H"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/1410867.jpg","Uruguay","H"));
        teamList.add(new FTeam("https://wallpaperaccess.com/full/22460.jpg","South Korea","H"));

        RecyclerView rec = findViewById(R.id.worldcupteams);
        TeamAdapter adp = new TeamAdapter(MainActivity.this, teamList);

        rec.setAdapter(adp);




    }
}