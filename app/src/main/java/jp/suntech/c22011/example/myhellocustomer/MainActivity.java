package jp.suntech.c22011.example.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //ボタンの用意
        Button btClick = findViewById(R.id.btClick);
        //名前クリアボタンであるボタンオブジェクトを表示
        Button btClearN = findViewById(R.id.btClearN);
        //住まいクリアボタンであるボタンオブジェクトを表示
        Button btClearR = findViewById(R.id.btClearR);

        //リスナオブジェクトの用意
        HelloListener listener = new HelloListener();

        //表示ボタンにリスナを設定
        btClick.setOnClickListener(listener);
        //名前クリアボタンにリスナを設定
        btClearN.setOnClickListener(listener);
        //住まいクリアボタンにリスナを設定
        btClearR.setOnClickListener(listener);


    }

    //ボタンをクリックしたときのリスナクラス
    private class HelloListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            //名前入力欄であるEditTextオブジェクトを取得
            EditText inputN = findViewById(R.id.etName);
            //住所入力欄であるEditTextオブジェクトを取得
            EditText inputR = findViewById(R.id.etAdress);


            //タップされた画面部品のidのＲ値を取得
            int id = v.getId();

            //表示ボタンの時
            if (id == R.id.btClick) {
                //入力された名前、住まい文字列を取得
                String inputStrN = inputN.getText().toString();
                String inputStrR = inputR.getText().toString();
                String show = inputStrR+"にお住いの"+inputStrN+"さんこんにちは！！";
                Toast.makeText(MainActivity.this,show,Toast.LENGTH_LONG).show();

            }

            //名前クリアボタンの時
            if (id == R.id.btClearN) {
                //名前入力欄に空文字を設定
                inputN.setText("");

            }

            //住まいクリアボタンの時
            if (id == R.id.btClearR) {
                //名前入力欄に空文字を設定
                inputR.setText("");


            }

        }
    }
}