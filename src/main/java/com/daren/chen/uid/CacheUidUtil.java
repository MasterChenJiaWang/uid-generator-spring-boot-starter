package com.daren.chen.uid;// package com.daren.chen.uid.

//
// import com.daren.chen.uid.exception.UidGenerateException;
// import com.daren.chen.uid.impl.CacheUidProperties;
// import com.daren.chen.uid.impl.CachedUidGenerator;
// import com.daren.chen.uid.impl.UidProperties;
//
/// **
// * @Description:
// * @author: chendaren
// * @CreateDate: 2020/3/2 13:11
// */
// public class CacheUidUtil {
//
// /**
// *
// */
// private volatile static CachedUidGenerator cachedUidGenerator;
//
//
// /**
// * @param uidProperties
// * @param workerId
// * @param cacheUidProperties
// */
// public synchronized static boolean initUid(UidProperties uidProperties, CacheUidProperties cacheUidProperties, long
// workerId) {
// if (cachedUidGenerator != null) {
// return true;
// }
// cachedUidGenerator = new CachedUidGenerator(uidProperties, cacheUidProperties, workerId);
// if (cachedUidGenerator != null) {
// return true;
// }
// return false;
// }
//
// /**
// * @return
// */
// public static long getUID() {
// if (null == cachedUidGenerator) {
// throw new UidGenerateException("CachedUidGenerator is null");
// }
// return cachedUidGenerator.getUID();
// }
//
// /**
// * @param l
// * @return
// */
// public static String parseUID(long l) {
// if (null == cachedUidGenerator) {
// throw new UidGenerateException("CachedUidGenerator is null");
// }
// return cachedUidGenerator.parseUID(l);
// }
// }
