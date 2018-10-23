package com.example.sonia.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String number1 = editText.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String number2 = editText2.getText().toString();
        // Instantiate the RequestQueue.
        final TextView resultView = (TextView) findViewById(R.id.textView);
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://192.168.0.10:8000/add/" + number1 + "/" + number2 + "/";

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        resultView.setText(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                resultView.setText("error");
            }
        });
        // Add the request to the RequestQueue.

        queue.add(stringRequest);
//      resultView.setText(Integer.toString(Integer.parseInt(number1) + Integer.parseInt(number2)));
    }

    public void Subtract(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String number1 = editText.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String number2 = editText2.getText().toString();
        // Instantiate the RequestQueue.
        final TextView resultView = (TextView) findViewById(R.id.textView);
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://192.168.0.10:8000/subtract/" + number1 + "/" + number2 + "/";

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        resultView.setText(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                resultView.setText("error");
            }
        });
        // Add the request to the RequestQueue.

        queue.add(stringRequest);
//      resultView.setText(Integer.toString(Integer.parseInt(number1) + Integer.parseInt(number2)));
    }

    public void Multiplication(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String number1 = editText.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String number2 = editText2.getText().toString();
        // Instantiate the RequestQueue.
        final TextView resultView = (TextView) findViewById(R.id.textView);
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://192.168.0.10:8000/mul/" + number1 + "/" + number2 + "/";

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        resultView.setText(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                resultView.setText("error");
            }
        });
        // Add the request to the RequestQueue.

        queue.add(stringRequest);
//      resultView.setText(Integer.toString(Integer.parseInt(number1) + Integer.parseInt(number2)));
    }

    public void division(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String number1 = editText.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String number2 = editText2.getText().toString();
        // Instantiate the RequestQueue.
        final TextView resultView = (TextView) findViewById(R.id.textView);
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://192.168.0.10:8000/div/" + number1 + "/" + number2 + "/";

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        resultView.setText(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                resultView.setText("error");
            }
        });
        // Add the request to the RequestQueue.

        queue.add(stringRequest);
//      resultView.setText(Integer.toString(Integer.parseInt(number1) + Integer.parseInt(number2)));
    }

}
