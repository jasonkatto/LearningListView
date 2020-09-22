package csi5230.jkatto.com.learninglistview;

import android.content.Context;
import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {
	ArrayList<Product> products = new ArrayList<>();
	Context context = null;

	public ProductAdapter(Context context){
		this.context = context;
		products.add(new Product(R.drawable.nikon1, "Nikon", 989f));
		products.add(new Product(R.drawable.smartphone, "Iphone", 1300f));
		products.add(new Product(R.drawable.suit, "Suite", 400f));

	}

	@Override
	public int getCount() {
		return products.size();
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
		if (convertView == null){
			ConstraintLayout item =
					(ConstraintLayout) layoutInflater.inflate(R.layout.product_item, null);

			ImageView imageView = item.findViewById(R.id.img);
			TextView name = item.findViewById(R.id.txt1);
			TextView price = item.findViewById(R.id.txt2);

			name.setText (products.get(position).getName());
			price.setText (String .format("price %.2f", products.get(position).getName()));
			imageView.setImageResource (products .get(position).getImage());

			imageView.setTag(products.get(position).getImage());

			imageView.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new Intent(v.getContext(),ImageView.class);
					int id= (int)((ImageView)v).getTag();
					intent.putExtra("id", id);
					v.getContext().startActivity(intent);

				}
			});
			return item;


		}
		return convertView;
	}
}
