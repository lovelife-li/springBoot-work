//package com.springboot.demo.common;
//
//import com.alibaba.druid.filter.config.ConfigTools;
//
//import static com.alibaba.druid.filter.config.ConfigTools.genKeyPair;
//
///**
// * @author ldb
// * @date 2020-03-19 11:09
// * @description druid加解密
// */
//public class ConfigTool {
//
//    public static void main(String[] args) throws Exception {
//        String[] arr = genKeyPair(512);
//        System.out.println("privateKey:" + arr[0]);
//        System.out.println("publicKey:" + arr[1]);
//        System.out.println("password:" + ConfigTools.encrypt(arr[0], "root"));
//    }
//
//}
