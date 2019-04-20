//package com.hfi.web01.factory;
//
//import com.hfi.web01.bean.Merchant;
//
///**
// * @ClassName MerchantFactory
// * @Auther VCC
// * @Date 2019/3/30 14:44
// * @Description
// * @Version
// */
//public class MerchantFactory {
//    private static MerchantFactory instance;
//    private Merchant merchant;
//
//    //单例
//    public static MerchantFactory getInstance() {
//        if (instance == null) {
//            synchronized (MerchantFactory.class) {
//                if (instance == null) {
//                    instance = new MerchantFactory();
//                }
//            }
//        }
//        return instance;
//    }
//
//    public Merchant getMerchant() {
//        return merchant;
//    }
//
//    public void setMerchant(Merchant merchant) {
//        this.merchant = merchant;
//    }
//}
