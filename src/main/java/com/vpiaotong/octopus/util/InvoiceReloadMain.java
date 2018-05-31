package com.vpiaotong.octopus.util;

import com.vpiaotong.grape.util.http.HttpUtil;

import java.io.IOException;

/**
 * 描述:
 * 发票查漏补缺main方法
 *
 * @outhor qinhaochun
 * @create 2018-05-31 10:52
 */
public class InvoiceReloadMain {
    public static void main(String[] args) {
        //3个参数，第一个url，第二个日期起，第三个日期止
        if (args.length != 3){
            System.out.println("parameter error!");
            return;
        }
        StringBuilder sb = new StringBuilder();

        String get = sb.append(args[0]).append("?dateStart=").append(args[1]).append("&dateEnd=").append(args[2]).toString();
        System.out.println("--------------------------------------------------------------");
        System.out.println("request URL:"+get);
        System.out.println("--------------------------------------------------------------");
        try {
            String s = HttpUtil.get(get);
            System.out.println("--------------------------------------------------------------");
            System.out.println("result:");
            System.out.println("--------------------------------------------------------------");
            System.out.println(s);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}