//package com.hfi.web01;
//
//import com.hfi.web01.bean.Product;
//import com.hfi.web01.bean.User;
//import com.hfi.web01.mapper.ProductMapper;
//import com.hfi.web01.mapper.UserMapper;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.math.BigDecimal;
//import java.util.concurrent.CountDownLatch;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.atomic.AtomicInteger;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class Web01ApplicationTests {
//
//    @Test
//    public void contextLoads() {
//
//    }
//
//    @Autowired
//    UserMapper userMapper;
//    @Autowired
//    ProductMapper productMapper;
//
//    @Test
//    public void sqlTest() {
//        User user01 = userMapper.selectByPrimaryKey("u01");
//        System.out.println(user01.toString());
//    }
//
//    @Test
//    public void concurrenceTest() {
//        /**
//         * 模拟高并发情况代码
//         */
//        final int MAX_COUNT = 100;
//        int j = 0;
//
//        final AtomicInteger atomicInteger = new AtomicInteger(0);
//        final CountDownLatch countDownLatch = new CountDownLatch(MAX_COUNT); // 相当于计数器，当所有都准备好了，再一起执行，模仿多并发，保证并发量
//        final CountDownLatch countDownLatch2 = new CountDownLatch(MAX_COUNT); // 保证所有线程执行完了再打印atomicInteger的值
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        try {
//            for (int i = 0; i < MAX_COUNT; i++) {
//                executorService.submit(new Runnable() {
//                    @Override
//                    public void run() {
//                        try {
//                            countDownLatch.await(); //一直阻塞当前线程，直到计时器的值为0,保证同时并发
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        //每个线程增加10次，每次加1
////                        for (int j = 0; j < MAX_COUNT; j++) {
//                        atomicInteger.incrementAndGet();
//                        User user = userMapper.selectByPrimaryKey("u01");
////                        System.out.println("第" + j + "次" + "账户余额：" + user.getAccount());
//                        user.setAccount(user.getAccount().subtract(new BigDecimal(1)));
//                        user.setVersion(user.getVersion() + 1);
//                        if (user.getVersion() > userMapper.selectByPrimaryKey("u01").getVersion())
//                        {
//                            userMapper.updateByPrimaryKey(user);
//                            System.out.println("更新成功，账户余额：" + user.getAccount() + "版本为：" + userMapper.selectByPrimaryKey("u01").getVersion());
//                        }
//                        else {
//                            System.out.println("更新失败，账户余额：" + user.getAccount() + "版本为：" + userMapper.selectByPrimaryKey("u01").getVersion());
//                            try {
//                                countDownLatch.await();
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                        }
////                        }
////                        Product product = productMapper.selectByPrimaryKey("p03");
////                        product.setpAmount(product.getpAmount()-1);
////                        productMapper.updateByPrimaryKey(product);
//
//                        countDownLatch2.countDown();
//                    }
//                });
//                countDownLatch.countDown();
//            }
//
//            countDownLatch2.await();// 保证所有线程执行完
//            System.out.println(atomicInteger);
//            executorService.shutdown();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
