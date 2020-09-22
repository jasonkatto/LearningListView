package csi5230.jkatto.com.learninglistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TwoStringAdapter extends BaseAdapter {

	Context context = null;
	String [] list = {"Jason Katto",
			"john smith",
			"mike mike",
			"Nilesh Patal"};

	@Override
	public int getCount() {
		return list.length/2;
	}

	public TwoStringAdapter(Context context){
		this.context = context;
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater layoutInflater = LayoutInflater.from(context);

		if(convertView == null){
			convertView = (View) layoutInflater.inflate(android.R.layout.simple_list_item_2, null);
			TextView tv1 = convertView.findViewById(android.R.id.text1);
			TextView tv2 = convertView.findViewById(android.R.id.text2);

			tv1.setText(list[position*2]);
			tv2.setText(list[position*2+1]);


		}
		return convertView;
	}
}
