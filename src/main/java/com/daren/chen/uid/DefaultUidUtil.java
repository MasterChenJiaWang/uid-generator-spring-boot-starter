package com.daren.chen.uid;// package com.daren.chen.uid.

//
// import com.daren.chen.uid.exception.UidGenerateException;
// import com.daren.chen.uid.impl.DefaultUidGenerator;
// import com.daren.chen.uid.impl.UidProperties;
//
/// **
// * @Description:
// * @author: chendaren
// * @CreateDate: 2020/3/2 13:11
// */
// public class DefaultUidUtil {
//
//
// /**
// *
// */
// private volatile static DefaultUidGenerator defaultUidGenerator;
//
//
// /**
// * @param uidProperties
// * @param workerId
// */
// public synchronized static boolean initUid(UidProperties uidProperties, long workerId) {
// if (defaultUidGenerator != null) {
// return true;
// }
// defaultUidGenerator = new DefaultUidGenerator(uidProperties, workerId);
// if (defaultUidGenerator != null) {
// return true;
// }
// return false;
// }
//
// /**
// * @return
// */
// public static long getUID() {
// if (null == defaultUidGenerator) {
// throw new UidGenerateException("defaultUidGenerator is null");
// }
// return defaultUidGenerator.getUID();
// }
//
// /**
// * @param l
// * @return
// */
// public static String parseUID(long l) {
// if (null == defaultUidGenerator) {
// throw new UidGenerateException("defaultUidGenerator is null");
// }
// return defaultUidGenerator.parseUID(l);
// }
// }
