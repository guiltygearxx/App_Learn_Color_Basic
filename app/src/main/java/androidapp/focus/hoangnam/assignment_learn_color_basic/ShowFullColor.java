package androidapp.focus.hoangnam.assignment_learn_color_basic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by HoangNam on 12/22/2017.
 */

public class ShowFullColor extends Activity {

    private int[] arrayColor = {
            R.color.red, R.color.pink, R.color.purple, R.color.black, R.color.blue, R.color.green,
            R.color.yellow, R.color.orange, R.color.brown, R.color.grey, R.color.white};

    ImageView imgColor;
    TextView txtColorEN;
    TextView txtColorVN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_color);

        // get dữ liệu từ gridview
        Intent intent = this.getIntent();
        String nameOfColorEN = intent.getStringExtra("nameOfColorEN");
        String nameOfColorVN = intent.getStringExtra("nameOfColorVN");

        // khởi tạo các component
        imgColor = (ImageView) findViewById(R.id.img_color);
        txtColorEN = (TextView) findViewById(R.id.txt_en_color);
        txtColorVN = (TextView) findViewById(R.id.txt_vn_color);


        txtColorEN.setText("Color: " + nameOfColorEN);
        txtColorVN.setText("Màu  : " + nameOfColorVN);

        switch (nameOfColorEN) {
            case "Red":
                imgColor.setImageResource(arrayColor[0]);
                break;
            case "Pink":
                imgColor.setImageResource(arrayColor[1]);
                break;
            case "Purple":
                imgColor.setImageResource(arrayColor[2]);
                break;
            case "Black":
                imgColor.setImageResource(arrayColor[3]);
                break;
            case "Blue":
                imgColor.setImageResource(arrayColor[4]);
                break;
            case "Green":
                imgColor.setImageResource(arrayColor[5]);
                break;
            case "Yellow":
                imgColor.setImageResource(arrayColor[6]);
                break;
            case "Orange":
                imgColor.setImageResource(arrayColor[7]);
                break;
            case "Brown":
                imgColor.setImageResource(arrayColor[8]);
                break;
            case "Grey":
                imgColor.setImageResource(arrayColor[9]);
                break;
            case "White":
                imgColor.setImageResource(arrayColor[10]);
                break;

        }
    }
}
