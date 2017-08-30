package com.bway.duanzidemo.net.retrofit;

import java.util.List;
/**
 * @类用途:
 * @author: likaihu
 * @date: 2017/8/30  9:23
 */
public class ResultBean {


    /**
     * code : 200
     * msg : success
     * total : 7
     * data : [{"stId":1,"typeName":"烟","originalIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/bao.png","checkIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/bao1.png","typeStatus":"0","createName":"波波","createTime":"2017-06-29"},{"stId":2,"typeName":"酒","originalIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/cha-.png","checkIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/cha_dj.png","typeStatus":"0","createName":"波波","createTime":"2017-06-30"},{"stId":22,"typeName":"珠宝","originalIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/jiu.png","checkIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/jiu_dj.png","typeStatus":"1","createName":"丹丹","createTime":"2017-07-03"},{"stId":24,"typeName":"食品","originalIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/xiezi.png","checkIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/xiezi1.png","typeStatus":"1","createName":"丹丹","createTime":"2017-07-03"},{"stId":25,"typeName":"食品","originalIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/yan.png","checkIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/yan_dj.png","typeStatus":"1","createName":"波波","createTime":"2017-07-07"},{"stId":26,"typeName":"服装","originalIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/yifu.png","checkIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/yifu1.png","typeStatus":"1","createName":"丹丹","createTime":"2017-07-16"},{"stId":27,"typeName":"奢侈品","originalIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/zhuabo_dj.png","checkIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/zhubao-.png","typeStatus":"1","createName":"丹丹","createTime":"2017-07-16"}]
     */

    private int code;
    private String msg;
    private int total;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * stId : 1
         * typeName : 烟
         * originalIcon : http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/bao.png
         * checkIcon : http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/bao1.png
         * typeStatus : 0
         * createName : 波波
         * createTime : 2017-06-29
         */

        private int stId;
        private String typeName;
        private String originalIcon;
        private String checkIcon;
        private String typeStatus;
        private String createName;
        private String createTime;

        public int getStId() {
            return stId;
        }

        public void setStId(int stId) {
            this.stId = stId;
        }

        public String getTypeName() {
            return typeName;
        }

        public void setTypeName(String typeName) {
            this.typeName = typeName;
        }

        public String getOriginalIcon() {
            return originalIcon;
        }

        public void setOriginalIcon(String originalIcon) {
            this.originalIcon = originalIcon;
        }

        public String getCheckIcon() {
            return checkIcon;
        }

        public void setCheckIcon(String checkIcon) {
            this.checkIcon = checkIcon;
        }

        public String getTypeStatus() {
            return typeStatus;
        }

        public void setTypeStatus(String typeStatus) {
            this.typeStatus = typeStatus;
        }

        public String getCreateName() {
            return createName;
        }

        public void setCreateName(String createName) {
            this.createName = createName;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }
    }
}
