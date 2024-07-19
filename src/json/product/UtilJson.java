/*
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.text.ParseException;
import json.product.Item;
import netscape.javascript.JSObject;

public class UtilJson {

  public static JsonObject createJsonData() {
    */
/**
     * 모든 데이터를 담을 JSONObject 생성
     *//*


    JsonObject productInfo = new JsonObject();
    Gson gson = new Gson();
    */
/**
     * value로 단순 값(string, int)를 가지는 프로퍼티 처리.
     * product_no
     * product_name
     *//*

    int product_no = gson.fromJson("1",Integer.class);
    String product_name = gson.fromJson("이경민",String.class);

    productInfo

    */
/**
     * value로 Json을 가지는 프로퍼티 처리.
     * extra_product_info JSONObject 생성
     *//*



    */
/**
     * value로 Array를 가지는 프로퍼티 처리.
     * item_list JSONArray 생성
     *//*


    */
/**
     * value로 Json을 가지는 프로퍼티 처리.
     * item_list.* JSONObject 생성하세요
     *//*


    return productInfo;
  }

  public static void parseJsonData(JsonObject jsonObject) {

    */
/**
     * String 형태로 만들어져있는 JSON 데이터를 파싱해줄 객체 생성.
     *//*


    */
/**
     * JSON 데이터가 String 형태로 들어왔음을 가정하기 위해
     * Json 데이터를 생성하고 String 형태로 바꿔주었다.
     *//*


    */
/**
     * value로 단순 값(string, int)를 가지는 프로퍼티 조회.
     * product_no, product_name
     *//*


    */
/**
     * value로 Json을 가지는 프로퍼티 조회.
     * extra_product_info를 꺼낼 때, JSONObject로 캐스팅.
     *//*


    */
/**
     * value로 Array를 가지는 프로퍼티 조회.
     * item_list를 꺼낼 때, JSONArray로 캐스팅.
     *//*



  }

  public static void parseJsonDataUseIterator(JsonObject jsonObject) {
    */
/**
     * String 형태로 만들어져있는 JSON 데이터를 파싱해줄 객체 생성.
     *//*



    */
/**
     * JSON 데이터가 String 형태로 들어왔음을 가정하기 위해
     * Json 데이터를 생성하고 String 형태로 바꿔주었다.
     *//*



    */
/**
     * value로 단순 값(string, int)를 가지는 프로퍼티 조회.
     * product_no, product_name
     *//*



    */
/**
     * value로 Json을 가지는 프로퍼티 조회.
     * extra_product_info를 꺼낼 때, JSONObject로 캐스팅.
     *//*



    */
/**
     * value로 Array를 가지는 프로퍼티 조회.
     * item_list를 꺼낼 때, JSONArray로 캐스팅.
     *//*


    */
/**
     * item_list의 각 원소를 JSONObject로 캐스팅 후, 변수의 키셋을 가져온다.
     * [참고] 각 원소의 키가 다를 경우 유용하다.
     *//*


  }


  public static String jsonToString(JsonObject jsonObject) {
    return jsonObject.toString();
  }


}*/
