package cindodcindy.sirihpinang.algotest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    public ImageView imageView_1, imageView_2, imageView_3, imageView_4,
    imageView_5, imageView_6, imageView_7, imageView_8, imageView_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView_1=findViewById(R.id.pic_1);
        imageView_2=findViewById(R.id.pic_2);
        imageView_3=findViewById(R.id.pic_3);
        imageView_4=findViewById(R.id.pic_4);
        imageView_5=findViewById(R.id.pic_5);
        imageView_6=findViewById(R.id.pic_6);
        imageView_7=findViewById(R.id.pic_7);
        imageView_8=findViewById(R.id.pic_8);
        imageView_9=findViewById(R.id.pic_9);






     btnSAtu();
    // btnDua();


        getImage();
    }


    public void getImage(){
        Glide.with(this)
                .load("https://i.imgflip.com/418vm9.jpg")
                .into(imageView_1);

        Glide.with(this)
                .load("https://i.imgflip.com/41coog.jpg")
                .into(imageView_2);

        Glide.with(this)
                .load("https://i.imgflip.com/40vya7.jpg")
                .into(imageView_3);

        Glide.with(this)
                .load("https://i.imgflip.com/41awfa.jpg")
                .into(imageView_4);
        Glide.with(this)
                .load("https://i.imgflip.com/41e8j6.jpg")
                .into(imageView_5);
        Glide.with(this)
                .load("https://i.imgflip.com/41e920.jpg")
                .into(imageView_6);
        Glide.with(this)
                .load("https://i.imgflip.com/415g3p.jpg")
                .into(imageView_7);
        Glide.with(this)
                .load("https://i.imgflip.com/413zfp.jpg")
                .into(imageView_8);
        Glide.with(this)
                .load("https://i.imgflip.com/40v69o.jpg")
                .into(imageView_9);




    }

   public void btnSAtu(){
       imageView_1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, ImageDetail.class);
               intent.putExtra("resId","https://i.imgflip.com/418vm9.jpg" );
               startActivity(intent);
           }
       });


   }

   public void btnDua(){
       imageView_2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, ImageDetail.class);
               intent.putExtra("resId2","https://i.imgflip.com/41coog.jpg" );
               startActivity(intent);
               finish();


           }
       });


   }

   public void butonTiga(){
       imageView_3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, ImageDetail.class);
               intent.putExtra("resId3","https://i.imgflip.com/40vya7.jpg" );
               startActivity(intent);
               finish();


           }
       });


   }
    public void butonempat(){
        imageView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageDetail.class);
                intent.putExtra("resId4","https://i.imgflip.com/41awfa.jpg" );
                startActivity(intent);


            }
        });


    }
    public void butonlima(){
        imageView_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageDetail.class);
                intent.putExtra("resId5","https://i.imgflip.com/41e8j6.jpg" );
                startActivity(intent);


            }
        });


    }
    public void butonenam(){
        imageView_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageDetail.class);
                intent.putExtra("resId6","https://i.imgflip.com/41e920.jpg" );
                startActivity(intent);


            }
        });


    }
    public void butontujuh(){
        imageView_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageDetail.class);
                intent.putExtra("resId7","https://i.imgflip.com/415g3p.jpg" );
                startActivity(intent);


            }
        });


    }
    public void butondelapan(){
        imageView_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageDetail.class);
                intent.putExtra("resId8","https://i.imgflip.com/413zfp.jpg" );
                startActivity(intent);

            }
        });


    }
    public void butonsembilan(){
        imageView_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageDetail.class);
                intent.putExtra("resId9","https://i.imgflip.com/40v69o.jpg" );
                startActivity(intent);


            }
        });


    }


}
