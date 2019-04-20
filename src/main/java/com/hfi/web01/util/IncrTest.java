package com.hfi.web01.util;

/**
 * @ClassName IncrTest
 * @Auther VCC
 * @Date 2019/3/24 12:24
 * @Description
 * @Version
 */
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class IncrTest {
    public static void concurrenceTest() {
        /**
         * 模拟高并发情况代码
         */
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final CountDownLatch countDownLatch = new CountDownLatch(100); // 相当于计数器，当所有都准备好了，再一起执行，模仿多并发，保证并发量
        final CountDownLatch countDownLatch2 = new CountDownLatch(100); // 保证所有线程执行完了再打印atomicInteger的值
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        try {
            for (int i = 0; i < 100; i++) {
                executorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            countDownLatch.await(); //一直阻塞当前线程，直到计时器的值为0,保证同时并发
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //每个线程增加100次，每次加1
//                        for (int j = 0; j < 100; j++) {
//                            atomicInteger.incrementAndGet();
//                        }
                        countDownLatch2.countDown();
                    }
                });
                countDownLatch.countDown();
            }

            countDownLatch2.await();// 保证所有线程执行完
            System.out.println(atomicInteger);
            executorService.shutdown();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        concurrenceTest();
    }
}
