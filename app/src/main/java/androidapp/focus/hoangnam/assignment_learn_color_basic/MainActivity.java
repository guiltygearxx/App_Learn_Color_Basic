package androidapp.focus.hoangnam.assignment_learn_color_basic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private int[] arrayColor = {
            R.color.red, R.color.pink, R.color.purple, R.color.black, R.color.blue, R.color.green,
            R.color.yellow, R.color.orange, R.color.brown, R.color.grey, R.color.white};

    private String[] arrayNameColorEN = {
            "Red", "Pink", "Purple", "Black", "Blue", "Green", "Yellow", "Orange",
            "Brown", "Grey", "White"
    };

    private String[] arrayNameColorVN = {
            "Đỏ", "Hồng", "Tím", "Đen", "Xanh dương", "Xanh lá cây", "Vàng", "Cam",
            "Nâu", "Xám", "Trắng"
    };

    GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomAdapter adapter = new CustomAdapter(this, arrayNameColorEN, arrayColor);
        gv = (GridView) findViewById(R.id.grid_list_color);
        gv.setAdapter(adapter);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, ShowFullColor.class);
                intent.putExtra("nameOfColorEN", arrayNameColorEN[position]);
                intent.putExtra("nameOfColorVN", arrayNameColorVN[position]);
                intent.putExtra("positionOfColor", arrayColor[position]);

                startActivity(intent);
            }
        });

    }
}
