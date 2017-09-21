package com.example.administrator.yangsenhao20170918;

import java.util.List;

/**
 * Created by Administrator on 2017-9-18.
 */

public class My_Bean {

    /**
     * date : 20170918
     * stories : [{"images":["https://pic2.zhimg.com/v2-0f9d7960d946b7f83a93921caee888e5.jpg"],"type":0,"id":9616037,"ga_prefix":"091809","title":"「你期望的薪资是多少？」如果 HR 问起，你怎么回？"},{"images":["https://pic2.zhimg.com/v2-c685b99f69dc97a1fe160f7c64262e59.jpg"],"type":0,"id":9617425,"ga_prefix":"091808","title":"为什么天上的星星除了月球外，肉眼看大小都差不多？"},{"images":["https://pic2.zhimg.com/v2-b39a819f760373dae8857e512fcecb25.jpg"],"type":0,"id":9614949,"ga_prefix":"091807","title":"查套餐，自动接电话，新夜间模式\u2026\u2026即将开放更新的 iOS 11，有史以来最贴心"},{"images":["https://pic2.zhimg.com/v2-6b9ed2a911069afee7e174a693752071.jpg"],"type":0,"id":9620744,"ga_prefix":"091807","title":"WePhone 创始人被逼自杀后，世纪佳缘们的新危机"},{"images":["https://pic2.zhimg.com/v2-d9f81acc91b7bce6f59a3ea71887a5c5.jpg"],"type":0,"id":9617927,"ga_prefix":"091807","title":"流传在表情包界的神图「黑人问号」，究竟神在哪？"},{"images":["https://pic1.zhimg.com/v2-7fbd72986cffa1beb0049aa9562cf518.jpg"],"type":0,"id":9620861,"ga_prefix":"091806","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic4.zhimg.com/v2-ca70fe05b0e9e27b0bb70af895b33987.jpg","type":0,"id":9616037,"ga_prefix":"091809","title":"「你期望的薪资是多少？」如果 HR 问起，你怎么回？"},{"image":"https://pic4.zhimg.com/v2-18e6ed53a0b19d2a6542aeba497ea927.jpg","type":0,"id":9614949,"ga_prefix":"091807","title":"查套餐，自动接电话，新夜间模式\u2026\u2026即将开放更新的 iOS 11，有史以来最贴心"},{"image":"https://pic3.zhimg.com/v2-66e62906ce18af9f16306071fceb2036.jpg","type":0,"id":9620744,"ga_prefix":"091807","title":"WePhone 创始人被逼自杀后，世纪佳缘们的新危机"},{"image":"https://pic2.zhimg.com/v2-6daf5f56f84bdbc027ce27a236b10f89.jpg","type":0,"id":9620104,"ga_prefix":"091717","title":"如果你在暴雪上班，你的宠物支持部落还是联盟？"},{"image":"https://pic2.zhimg.com/v2-7f41fd9b4ed66395a9e25cf753d076fd.jpg","type":0,"id":9613249,"ga_prefix":"091707","title":"我是《看不见的客人》的导演，解释下电影里出现的  Bug"}]
     */

    public String date;
    public List<StoriesBean> stories;
    public List<TopStoriesBean> top_stories;



    public static class StoriesBean {
        /**
         * images : ["https://pic2.zhimg.com/v2-0f9d7960d946b7f83a93921caee888e5.jpg"]
         * type : 0
         * id : 9616037
         * ga_prefix : 091809
         * title : 「你期望的薪资是多少？」如果 HR 问起，你怎么回？
         */

        public int type;
        public int id;
        public String ga_prefix;
        public String title;
        public List<String> images;


    }

    public static class TopStoriesBean {
        /**
         * image : https://pic4.zhimg.com/v2-ca70fe05b0e9e27b0bb70af895b33987.jpg
         * type : 0
         * id : 9616037
         * ga_prefix : 091809
         * title : 「你期望的薪资是多少？」如果 HR 问起，你怎么回？
         */

        public String image;
        public int type;
        public int id;
        public String ga_prefix;
        public String title;
    }
}
