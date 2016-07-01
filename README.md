# CountDown
git@github.com:CarryDaw/CoutDownTimeView.git
商城倒计时
1、时分秒倒计时
//开始倒计时
  CountDownView.setHourtMinuteAddsSecond(long)
  //倒计时结束监听
  CountDownView.finshTime(callback)
  //取消倒计时
  CountDownView.cancelHourtMinuteAddsSecondTime();
  
 2、 分秒毫秒倒计时
 //开始倒计时
  CountDownView.setTime(long)
  //倒计时结束监听
  CountDownView.finshTime(callback)
  //取消倒计时
  CountDownView.cancelTime();
  3、避免listview时间复用错乱
   /**
         * 如果再listview中加入倒计时   listview复用布局会发生错乱   解决错乱需再settime前加上cancel  如下：
         *
         *
         * countdownhour.cancelTime();
         *  countdownhour.setTime(200 * 1000l);
         *    countdownhour.finshTime(callback);
         */
