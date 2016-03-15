package com.gejiahui.kanzhihu.model;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;

/**
 * Created by gejiahui on 2016/3/15.
 */
public class UserDetail {

    private String name;
    private String avatar;
    private String signature;
    private String description;
    private JSONArray detail;
    private JSONArray  star;
    private JSONArray trend;
    private JSONArray topanswers;


    public class Detail{
        //提问数
        private String ask;
        //回答数
        private String answer;
        //专栏文章数
        private String post;
        // 赞同数
        private String agree;
        //1日赞同数增加
        private String agreei;
        // 1日赞同数增幅
        private String agreeiratio;
        // 7日赞同数增加
        private String agreeiw;
        // 7日赞同数增幅
        private String agreeiratiow;
        //平均赞同（总赞同数/(回答+专栏)）
        private String ratio;
        // 关注数
        private String followee;
        // 被关注数（粉丝）
        private String follower;
        //  1日被关注数增加
        private String followeri;
        //  1日被关注数增幅
        private String followiratio;
        //  7日被关注数增加
        private String followeriw;
        //  7日被关注数增幅
        private String followiratiow;
        //  感谢数
        private String thanks;
        //  感谢/赞同比
        private String tratio;
        //  收藏数
        private String fav;
        //  收藏/赞同比
        private String fratio;
        //  公共编辑数
        private String logs;
        //  最高赞同
        private String mostvote;
        //  最高赞同占比
        private String mostvotepercent;
        //  前5赞同
        private String mostvote5;
        //  前5赞同占比
        private String mostvote5percent;
        //  前10赞同
        private String mostvote10;
        //  前10赞同占比
        private String mostvote10percent;
        //   赞同≥10000答案数
        private String count10000;
        //   赞同≥5000答案数
        private String count5000;
        //   赞同≥2000答案数
        private String count2000;
        //   赞同≥1000答案数
        private String count1000;
        //   赞同≥500答案数
        private String count500;
        //   赞同≥200答案数
        private String count200;
        //   赞同≥100答案数
        private String count100;
        
    }



}
