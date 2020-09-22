package csi5230.jkatto.com.learninglistview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;



public class MainActivity extends AppCompatActivity {
	  String []list= {"Jason Katto",
			  "john smith",
			  "mike mike",
	  "Nilesh Patal"};

	  ListView listView= null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		listView = findViewById(R.id.list);


		//the list view require adapter
		ProductAdapter  arrayAdapter = new ProductAdapter(this);

		//set the adapter with the list view
		listView.setAdapter(arrayAdapter);

	}
}
