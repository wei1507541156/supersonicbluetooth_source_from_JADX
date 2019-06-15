package com.google.appinventor.components.runtime.view;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.util.ViewUtil;
import org.osmdroid.views.MapView;

public class ZoomControlView extends LinearLayout {
    private float density;
    private final MapView parent;
    private final Button zoomIn;
    private final Button zoomOut;

    /* renamed from: com.google.appinventor.components.runtime.view.ZoomControlView$1 */
    class C04261 implements OnClickListener {
        C04261() {
        }

        public void onClick(View view) {
            ZoomControlView.this.parent.getController().zoomIn();
        }
    }

    /* renamed from: com.google.appinventor.components.runtime.view.ZoomControlView$2 */
    class C04272 implements OnClickListener {
        C04272() {
        }

        public void onClick(View view) {
            ZoomControlView.this.parent.getController().zoomOut();
        }
    }

    public ZoomControlView(MapView parent) {
        super(parent.getContext());
        this.density = parent.getContext().getResources().getDisplayMetrics().density;
        this.parent = parent;
        setOrientation(1);
        this.zoomIn = new Button(parent.getContext());
        this.zoomOut = new Button(parent.getContext());
        initButton(this.zoomIn, "+");
        initButton(this.zoomOut, "−");
        this.zoomIn.setOnClickListener(new C04261());
        this.zoomOut.setOnClickListener(new C04272());
        ViewUtil.setBackgroundDrawable(this.zoomIn, getZoomInDrawable(this.density));
        ViewUtil.setBackgroundDrawable(this.zoomOut, getZoomOutDrawable(this.density));
        states = new int[2][];
        states[0] = new int[]{-16842910};
        states[1] = new int[]{16842910};
        int[] colors = new int[]{Component.COLOR_LTGRAY, -16777216};
        this.zoomIn.setTextColor(new ColorStateList(states, colors));
        this.zoomOut.setTextColor(new ColorStateList(states, colors));
        addView(this.zoomIn);
        addView(this.zoomOut);
        setPadding((int) (this.density * 12.0f), (int) (this.density * 12.0f), 0, 0);
        updateButtons();
    }

    public final void updateButtons() {
        this.zoomIn.setEnabled(this.parent.canZoomIn());
        this.zoomOut.setEnabled(this.parent.canZoomOut());
    }

    private void initButton(Button button, String text) {
        button.setText(text);
        button.setTextSize(22.0f);
        button.setPadding(0, 0, 0, 0);
        button.setWidth((int) (this.density * 30.0f));
        button.setHeight((int) (this.density * 30.0f));
        button.setSingleLine();
        button.setGravity(17);
    }

    private static Drawable getZoomInDrawable(float density) {
        int R = (int) (4.0f * density);
        ShapeDrawable drawable = new ShapeDrawable(new RoundRectShape(new float[]{(float) R, (float) R, (float) R, (float) R, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
        drawable.getPaint().setColor(-1);
        return drawable;
    }

    private static Drawable getZoomOutDrawable(float density) {
        int R = (int) (4.0f * density);
        ShapeDrawable drawable = new ShapeDrawable(new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, (float) R, (float) R, (float) R, (float) R}, null, null));
        drawable.getPaint().setColor(-1);
        return drawable;
    }
}
