/*package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        OkHttpClient client = new OkHttpClient();
//        String url = "https://jsonplaceholder.typicode.com/posts";
//
//        Request request = new Request.Builder()
//                .url(url)
//                .build();
//
//        try (Response response = client.newCall(request).execute()) {
//            if (response.isSuccessful() && response.body() != null) {
//                System.out.println(response.body().string());
//            } else {
//                System.out.println("Request failed: " + response.code());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        }
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/posts")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TodoService todoservice = retrofit.create(TodoService.class);

        Todo t = todoservice.getTodoById("1").execute().body();

        System.out.println("to do object downloaded is : ," + t.toString());
    }
}*/

package org.example;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Response;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TodoService todoService = retrofit.create(TodoService.class);

        try {
            Response<TodoItem> response = todoService.getTodoById(1).execute();

            if (response.isSuccessful() && response.body() != null) {
                TodoItem todo = response.body();
                System.out.println("ID: " + todo.getId());
                System.out.println("Title: " + todo.getTitle());
                System.out.println("Body: " + todo.getBody());
            } else {
                System.out.println("Request failed: " + response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


