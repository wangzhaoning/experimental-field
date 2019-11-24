package com.wzn.realtime.exercise;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) {
        int i=2;
        while (i > 0) {
            createInstnaceTimeOut();
            i--;
        }
    }

    private static void createInstnaceTimeOut() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("task  run:" + new Date());
                this.cancel();
                System.exit(0);
            }
        };
        Timer times = new Timer();
        //安排指定的任务在指定的时间开始进行重复的固定延迟执行。这里是每3秒执行一次
        times.schedule(timerTask, 3000, 1);
    }
}
