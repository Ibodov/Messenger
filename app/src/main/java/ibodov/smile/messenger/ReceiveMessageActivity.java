package ibodov.smile.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    //Константа для передачи текста с другого активити.
    public static final String EXTRA_MESSAGE = "message";
    //дикл.
    String messageText;
    TextView messageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        //получаем интент
        Intent intent = getIntent();
        //получаем инфо с первого интента
        messageText = intent.getStringExtra(EXTRA_MESSAGE);
        //вывод инф. на втор. активити
        messageView = findViewById(R.id.message);
        //вывод как текст
        messageView.setText(messageText);


    }

}