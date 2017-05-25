package com.cooking.info.cooking.Util;

import android.content.Context;

import com.cooking.info.cooking.Entities.Cooking;
import com.cooking.info.cooking.R;

import java.sql.Array;
import java.sql.Time;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Naser on 5/25/2017.
 */

public class Request {

    public List<Cooking> cookings;

    public Request(Context context) {
        cookings = new ArrayList<>();
        //starter
        cookings.add(new Cooking(1, "Starter 1", "Naser", "Starter for cooking lesson", "http://s.eatthis-cdn.com/media/images/ext/267153110/donuts-trans-fats-linked-memory-loss.jpg", "http://s.eatthis-cdn.com/media/images/ext/267153110/donuts-trans-fats-linked-memory-loss.mp4", 3, 1, 13.5, "1:3", "1392/12/12"));
        cookings.add(new Cooking(2, "Starter 2", "Naser", "Starter for cooking lesson", "http://www.contemporaryconnect.com/wp-content/uploads/2014/03/1r-fast-food-pictures-food-photos-images-fotos-300x173.jpg", "", 2, 1, 1.5, "0:30", "1392/12/12"));
        cookings.add(new Cooking(3, "Starter 3", "Naser", "Starter for cooking lesson", "http://s.eatthis-cdn.com/media/images/ext/267153110/donuts-trans-fats-linked-memory-loss.jpg", "", 10, 1, 0, "", "1392/12/12"));
        cookings.add(new Cooking(4, "Starter 4", "Naser", "Starter for cooking lesson", "http://www.contemporaryconnect.com/wp-content/uploads/2014/03/1r-fast-food-pictures-food-photos-images-fotos-300x173.jpg", "http://s.eatthis-cdn.com/media/images/ext/267153110/donuts-trans-fats-linked-memory-loss.mp4", 3, 1, 13.5, "1:3", "1392/12/12"));
        cookings.add(new Cooking(5, "Starter 5", "Naser", "Starter for cooking lesson", "http://s.eatthis-cdn.com/media/images/ext/267153110/donuts-trans-fats-linked-memory-loss.jpg", "", 3, 1, 13.5,  "1:3", "1392/12/12"));

        // main course
        cookings.add(new Cooking(6, "Mediterranean Meze", "Naser", context.getResources().getString( R.string.mediterranen), "https://d36ai2hkxl16us.cloudfront.net/thoughtindustries/image/upload/a_exif,c_fill,w_750,h_361/v1491518106/mghc2lour5xvtuzl0nrm.jpg", "", 120, 2, 13.5, "1:3", "1392/12/12"));
        cookings.add(new Cooking(7, "Focus on Fried Chicken", "Naser", context.getResources().getString(R.string.chicken), "https://d36ai2hkxl16us.cloudfront.net/thoughtindustries/image/upload/a_exif,c_fill,w_750,h_361/v1489411078/u5g0lt2wef7uumcbsnac.jpg", "", 200, 2, 1.5, "0:30", "1392/12/12"));
        cookings.add(new Cooking(8, "Essential Eggs", "Naser", context.getResources().getString(R.string.essential_eaggs), "https://d36ai2hkxl16us.cloudfront.net/thoughtindustries/image/upload/a_exif,c_fill,w_750,h_361/v1478118192/yoj9gkfdrmqg8ykhxslb.jpg", "", 100, 2, 0, "", "1392/12/12"));
        cookings.add(new Cooking(9, "Crème Brûlée and Other Custards", "Naser", context.getResources().getString(R.string.crem), "https://d36ai2hkxl16us.cloudfront.net/thoughtindustries/image/upload/a_exif,c_fill,w_750,h_361/v1481573217/llf2moivqqjiylv9slpd.jpg", "", 300, 2, 13.5, "1:3", "1392/12/12"));
        cookings.add(new Cooking(10, "Cook It In Cast Iron", "Naser", context.getResources().getString(R.string.cook), "https://d36ai2hkxl16us.cloudfront.net/thoughtindustries/image/upload/a_exif,c_fill,w_750,h_361/v1477421877/ohqjke20qn4mvor30lc3.jpg", "", 30, 2, 13.5,  "1:3", "1392/12/12"));

        // dessert
        cookings.add(new Cooking(11, "Icebox Pies", "Naser", context.getResources().getString(R.string.icebox), "https://d36ai2hkxl16us.cloudfront.net/thoughtindustries/image/upload/a_exif,c_fill,w_750,h_361/v1493312561/vrw3sjdmhhvkuxusslta.jpg", "https://d36ai2hkxl16us.cloudfront.net/thoughtindustries/image/upload/a_exif,c_fill,w_750,h_361/v1493312561/vrw3sjdmhhvkuxusslta.jpg", 3, 3, 13.5, "1:3", "1392/12/12"));
        cookings.add(new Cooking(12, "Dessert 1", "Naser", "Dessert learning 1", "http://www.contemporaryconnect.com/wp-content/uploads/2014/03/1r-fast-food-pictures-food-photos-images-fotos-300x173.jpg", "", 2, 3, 1.5, "0:30", "1392/12/12"));
        cookings.add(new Cooking(13, "Dessert 2", "Naser", "Dessert learning 2", "http://s.eatthis-cdn.com/media/images/ext/267153110/donuts-trans-fats-linked-memory-loss.jpg", "", 10, 3, 0, "", "1392/12/12"));
        cookings.add(new Cooking(14, "Dessert 3", "Naser", "Dessert learning 3", "http://www.contemporaryconnect.com/wp-content/uploads/2014/03/1r-fast-food-pictures-food-photos-images-fotos-300x173.jpg", "http://s.eatthis-cdn.com/media/images/ext/267153110/donuts-trans-fats-linked-memory-loss.mp4", 3, 3, 13.5, "1:3", "1392/12/12"));
        cookings.add(new Cooking(15, "Dessert 4", "Naser", "Dessert learning 4", "http://s.eatthis-cdn.com/media/images/ext/267153110/donuts-trans-fats-linked-memory-loss.jpg", "", 3, 3, 13.5,  "1:3", "1392/12/12"));

    }

    public List<Cooking> GetCookings() {
        return cookings;
    }

    public List<Cooking> GetCookings(int type) {
        List<Cooking> cookingList = new ArrayList<>();
        for (Cooking cooking : cookings) {
            if (cooking.getType() == type) {
                cookingList.add(cooking);
            }
        }
        return cookingList;
    }

    public Cooking GetCooking(int id) {
        for (Cooking cooking : cookings) {
            if (cooking.getId() == id) {
                return cooking;
            }
        }
        return new Cooking();
    }
}
