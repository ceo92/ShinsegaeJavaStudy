package json.product;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class CreateJsonApp {
  public static void main(String[] args) {
    //Gson : JSON => String(파싱) , String => JSON(생성) 위한 구글 오픈 소스

    Gson gson = new Gson();
    Item item = new Item();
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("name" , "hello"); //addProperty : name:hello라는 Entry 꼴로 매핑
    jsonObject.addProperty("id" , 1234);

    String mapJson = gson.toJson(jsonObject);
    System.out.println("mapJson = " + mapJson);

    Item parseJson = gson.fromJson(mapJson, Item.class);
    System.out.println("parseJson = " + parseJson);




    /*JSONObject jsonObject = UtilJson.createJsonData();
    System.out.println(jsonObject);*/
  }
}
