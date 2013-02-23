package de.programmierung.dresden.tasker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class ButtonView extends ImageButton {

	private ImageButton imgButton;
	private String AudioText;
	
	public ButtonView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}

	public ButtonView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public ButtonView(Context context) {
		super(context);
		init();
	}

	private void init(){
		LayoutInflater inflater = LayoutInflater.from(getContext());
		View root = inflater.inflate(R.layout.view_picture, (ViewGroup) getRootView(),true);
		imgButton=(ImageButton) root.findViewById(R.id.imageButton);
	}
	
	public void setAudioText(String text){
		AudioText=text;
	}
	
}
