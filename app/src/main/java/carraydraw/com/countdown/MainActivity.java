package carraydraw.com.countdown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import carraydraw.com.coutdowntimelibrary.countdown.CountDownUtil;
import carraydraw.com.coutdowntimelibrary.countdown.CountDownView;

public class MainActivity extends AppCompatActivity {
    CountDownView countdownhour,coutdownmillysecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countdownhour= (CountDownView) findViewById(R.id.countdownhour);
        coutdownmillysecond= (CountDownView) findViewById(R.id.coutdownmillysecond);
        //分秒毫秒倒计时
        countdownhour.setTime(200 * 1000l);
        countdownhour.finshTime(new CountDownUtil.CallTimeFinshBack() {
            @Override
            public void finshTime() {
                /**
                 * 倒计时结束监听
                 */
            }
        });

        //时分秒倒计时
        coutdownmillysecond.setHourtMinuteAddsSecond(4000*1000l);
        coutdownmillysecond.finshTime(new CountDownUtil.CallTimeFinshBack() {
            @Override
            public void finshTime() {
                /**
                 * 倒计时结束监听
                 */
            }
        });
        /**
         * 如果再listview中加入倒计时   listview复用布局会发生错乱   解决错乱需再settime前加上cancel  如下：
         *
         *
         * countdownhour.cancelTime();
         *  countdownhour.setTime(200 * 1000l);
         *    countdownhour.finshTime(callback);
         */
    }
}
