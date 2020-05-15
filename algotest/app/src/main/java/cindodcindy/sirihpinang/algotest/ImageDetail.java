package cindodcindy.sirihpinang.algotest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ToggleButton;

import com.bumptech.glide.Glide;

public class ImageDetail extends AppCompatActivity {
    public ImageView imageView_get_data, imageView_get_galeri;
    public Button button_getGalery;
    public ToggleButton button_getEdittext;
    public EditText editText_edit;

    private static final int PICK_IMAGE = 100;
    Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_detail);
        imageView_get_data=findViewById(R.id.get_data);
        imageView_get_galeri=findViewById(R.id.get_galeri);
        button_getGalery=findViewById(R.id.btn_add_log);
        button_getEdittext=findViewById(R.id.btn_add_text);
        editText_edit=findViewById(R.id.et_add_text);

        button_getGalery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGallery();

            }
        });

        button_getEdittext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean checked = button_getEdittext.isChecked();

                if (checked) {
                   editText_edit.setVisibility(View.VISIBLE);

                } else {

                    editText_edit.setVisibility(View.INVISIBLE);
                    //Digunakan untuk menampilkan lagi  TextView dan ImageView
                }
            }
        });

       imaageSatu();
      // imaageDua();
      /* imaageDua();
       imaageTiga();
       imaageEmpat();
       imaagelima();
       imaageEnam();
       imaagetujuh();
       imaagedelapan();
       imaageSembilan();

       */


    }


    private void openGallery() {
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, PICK_IMAGE);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == PICK_IMAGE){
            imageUri = data.getData();
            imageView_get_galeri.setImageURI(imageUri);
        }
    }

    public void imaageSatu(){
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("resId");
            imageView_get_data.setImageResource(resId);

            Glide.with(this)
                    .load("https://i.imgflip.com/418vm9.jpg")
                    .into(imageView_get_data);

        }

    }


    public void imaageDua(){
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("resId2");
            imageView_get_data.setImageResource(resId);

            Glide.with(this)
                    .load("https://i.imgflip.com/41coog.jpg")
                    .into(imageView_get_data);

        }

    }

    public void imaageTiga(){
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("resId3");
            imageView_get_data.setImageResource(resId);

            Glide.with(this)
                    .load("https://i.imgflip.com/40vya7.jpg")
                    .into(imageView_get_data);

        }

    }
    public void imaageEmpat(){
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("resId4");
            imageView_get_data.setImageResource(resId);

            Glide.with(this)
                    .load("https://i.imgflip.com/41awfa.jpg")
                    .into(imageView_get_data);

        }

    }

    public void imaagelima(){
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("resId5");
            imageView_get_data.setImageResource(resId);

            Glide.with(this)
                    .load("https://i.imgflip.com/41e8j6.jpg")
                    .into(imageView_get_data);

        }

    }

    public void imaageEnam(){
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("resId6");
            imageView_get_data.setImageResource(resId);

            Glide.with(this)
                    .load("https://i.imgflip.com/41e920.jpg")
                    .into(imageView_get_data);

        }

    }

    public void imaagetujuh(){
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("resId7");
            imageView_get_data.setImageResource(resId);

            Glide.with(this)
                    .load("https://i.imgflip.com/415g3p.jpg")
                    .into(imageView_get_data);

        }

    }


    public void imaagedelapan(){
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("resId8");
            imageView_get_data.setImageResource(resId);

            Glide.with(this)
                    .load("https://i.imgflip.com/413zfp.jpg")
                    .into(imageView_get_data);

        }

    }

    public void imaageSembilan(){
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("resId9");
            imageView_get_data.setImageResource(resId);

            Glide.with(this)
                    .load("https://i.imgflip.com/40v69o.jpg")
                    .into(imageView_get_data);

        }

    }

}
