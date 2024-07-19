package json.product;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class CreateJsonApp {
  public static void main(String[] args) {
    //Gson : JSON => String(파싱) , String => JSON(생성) 위한 구글 오픈 소스
    String jsonObject = UtilJson.createJsonData();
    UtilJson.parseJsonData(jsonObject);
    /*JSONObject jsonObject = UtilJson.createJsonData();
    System.out.println(jsonObject);*/
  }
}
