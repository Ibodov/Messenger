package ibodov.smile.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //иниц
    EditText messageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Вызвать onSendMessage() при щелчке на кнопке.
    public void onSendMessage(View view) {

        //декла
        messageView = findViewById(R.id.message);
        //получаем в новую перем. инфор(текст)
        String messageText = messageView.getText().toString();
        //созд. намер и указываем новый активити
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        //выводим инфу с messageText
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);
        //Запускаем Интент
        startActivity(intent);
    }
}