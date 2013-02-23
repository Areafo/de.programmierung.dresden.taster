package de.programmierung.dresden.tasker;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class PictureFragment extends Fragment implements OnClickListener{
	
	private ImageButton imgButton;
	View root;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		root = inflater.inflate(R.layout.fragment_picture, container);
		
		imgButton=(ImageButton) root.findViewById(R.id.fragmentImageButton);
		
		imgButton.setOnClickListener(this);
		
		return root;
	}
	
	public void setImg(){
		//imgButton.setBackgroundDrawable();
	}

	@Override
	public void onClick(View view) {
		switch(view.getId()){
		case R.id.fragmentImageButton:
			playSound();
			break;
		
		}
		
	}
	
	private void playSound(){
		
	}
	
}
