package com.example.imagegrid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    GridView gridview;

    String[] names={"d","e","f","g","i","o","p","q","r","s","t","u","w","y"};
    int[] images={R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.i,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r,R.drawable.s,R.drawable.t,R.drawable.u,R.drawable.w,R.drawable.y};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridview=findViewById(R.id.grid);
        CustomAdapter customAdapter=new CustomAdapter(names,images,this);
        gridview.setAdapter(customAdapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedName=names[i];
                int selectedImage=images[i];
                startActivity(new Intent(MainActivity.this,ClickedItemActivity.class).putExtra("name",selectedName).putExtra("image",selectedImage));
               

            }
        });
    }
    public class CustomAdapter extends BaseAdapter{
        private String[] ImageNames;
        private int[] ImagesPhoto;
        private Context context;
        private LayoutInflater layoutInflater;

        public CustomAdapter(String[] imageNames, int[] imagesPhoto, Context context) {
            this.ImageNames = imageNames;
            this.ImagesPhoto = imagesPhoto;
            this.context = context;
            this.layoutInflater=(LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return ImagesPhoto.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if(view==null){
                view=layoutInflater.inflate(R.layout.rowdata,viewGroup,false);
            }
            TextView tvname=view.findViewById(R.id.tvname);
            ImageView imageview=view.findViewById(R.id.apple);

            tvname.setText(ImageNames[i]);
            imageview.setImageResource(ImagesPhoto[i]);
            return view;
        }
    }
}
