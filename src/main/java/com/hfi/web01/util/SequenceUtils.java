package com.hfi.web01.util;

/**
 * @ClassName SequenceUtils
 * @Auther XiaoHua
 * @Date 2019/5/9 22:43
 * @Description
 * @Version 0.0.1
 */
public class SequenceUtils {
    static final int DEFAULT_LENGTH = 4;

    public static String getSequence(long seq) {
        String str = String.valueOf(seq);
        int len = str.length();
        if (len >= DEFAULT_LENGTH) {// 取决于业务规模,应该不会到达4
            return str;
        }
        int rest = DEFAULT_LENGTH - len;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rest; i++) {
            sb.append('0');
        }
        sb.append(str);
        return sb.toString();
    }

}
