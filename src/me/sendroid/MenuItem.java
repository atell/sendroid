package me.sendroid;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MenuItem extends RelativeLayout {

	public MenuItem(Context context, Drawable drawable, String bigText,
			String smallText) {

		super(context);

//		LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT,
//				LayoutParams.WRAP_CONTENT);
//		this.setLayoutParams(params);
		// params.setMargins(5, 3, 5, 0);
		LayoutParams imageViewLayoutParams = new LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.FILL_PARENT);
//		imageViewLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
//		imageViewLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		// imageViewLayoutParams.rightMargin = 6;
		ImageView imageView = new ImageView(context);
		imageView.setImageDrawable(drawable);
		imageView.setLayoutParams(imageViewLayoutParams);
		this.addView(imageView);
		LayoutParams textView1LayoutParams = new LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		textView1LayoutParams.addRule(RIGHT_OF, imageView.getId());
		textView1LayoutParams.addRule(BELOW, imageView.getId());
		//textView1LayoutParams.addRule(ALIGN_PARENT_TOP);
		TextView bigTextView = new TextView(context);
		bigTextView.setText(bigText);
		bigTextView.setTextSize(16f);
		bigTextView.setTextColor(Color.WHITE);
		bigTextView.setLayoutParams(textView1LayoutParams);
		this.addView(bigTextView);

		LayoutParams textView2LayoutParams = new LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		textView2LayoutParams.addRule(ALIGN_PARENT_RIGHT);
		textView2LayoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		
		TextView smallTextView = new TextView(context);
		smallTextView.setText(bigText);
		smallTextView.setTextSize(12f);
		smallTextView.setTextColor(Color.GRAY);
		smallTextView.setLayoutParams(textView2LayoutParams);
		this.addView(smallTextView);

	}
}
