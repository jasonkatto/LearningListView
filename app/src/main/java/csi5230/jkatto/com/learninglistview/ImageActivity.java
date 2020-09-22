package csi5230.jkatto.com.learninglistview;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image);

		ImageView imageView = findViewById(R.id.imageView);
		Intent intent =getIntent();
		int id ;
		if (intent.hasExtra(id)){
			{
				id=intent.getIntExtra("id", -1);
				if (id !=-1)
					imageView.setImageResource(id);
			}
		}
	}
		@Override
				protected void onPause(){
			super.onPause();
			finish();
		}


}
