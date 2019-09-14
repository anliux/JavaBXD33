class BoundedBuffer {
   final Lock lock = new ReentrantLock();//锁
   final Condition notFull  = lock.newCondition(); //生产
   final Condition notEmpty = lock.newCondition(); //消费

   final Object[] items = new Object[100];// 存储商品的容器
   int putptr/*生产者使用的角标*/, takeptr/*消费者使用的角标*/, count/*计数器*/;

	//生产者使用的方法，往数组中存储商品
   public void put(Object x) throws InterruptedException {
     lock.lock();
     try {
       while (count == items.length) //判断计数器是否已到数组长度。满了。
         notFull.await();//生产者就等待。
       items[putptr] = x; //按照角标将商品存储到数组中。
       if (++putptr == items.length) //如果存储的角标到了数组的长度，就将角标归零
		   putptr = 0;
       ++count;//计数器自增
       notEmpty.signal();//唤醒一个消费者
     } finally {
       lock.unlock();//释放锁
     }
   }

   public Object take() throws InterruptedException {
     lock.lock();
     try {
       while (count == 0) //计数器为0，说明没有商品，消费者等待
         notEmpty.await();
       Object x = items[takeptr]; //从数组中通过消费者角标获取商品
       if (++takeptr == items.length) //如果消费的角标等于的数组长度，将角标归零。
		   takeptr = 0;
       --count;//计数器自减
       notFull.signal();//唤醒生产者
       return x;
     } finally {
       lock.unlock();//释放锁
     }
   } 
 }
