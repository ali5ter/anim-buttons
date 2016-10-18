package org.wisner.arlington.arlington;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class BlueActivity extends Activity {

    private Button iSpinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue);

        iSpinButton = (Button) findViewById(R.id.i_spin);
        initISpin();
    }


    private void initISpin() {
        final Animation quickSpin = AnimationUtils.loadAnimation(this, R.anim.spin);

        iSpinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(quickSpin);
            }
        });
    }
}
