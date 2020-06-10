package com.plumelog.core.constant;

import java.util.Arrays;
import java.util.List;

/**
 * className：LogMessageConstant
 * description：
 * time：2020-05-12.10:10
 *
 * @author Tank
 * @version 1.0.0
 */
public class LogMessageConstant {

    /**
     * 链路日志前缀
     */
    public final static String TRACE_PRE = "TRACE:";


    /**
     * 当前链路开始标志
     */
    public final static String TRACE_START = "<";

    /**
     * 当前链路结束标志
     */
    public final static String TRACE_END = ">";


    public final static String LOG_KEY = "plume_log_list";

    /**
     * 链路日志存入ES的索引后缀
     */
    public final static String LOG_KEY_TRACE = "plume_trace_list";

    public final static String ES_INDEX = "plume_log_";

    public final static String ES_TYPE = "plume_log";

    public final static String LOG_TYPE_RUN = "run";

    public final static String LOG_TYPE_TRACE = "trace";

    public final static String DELIM_STR = "{}";

    public final static String TRACE_ID = "traceId";

    /**
     * 1 高性能模式，2 全信息模式
     */
    public static int RUN_MODEL = 1;

    /**
     * 默认扩展 可变参数
     */
    public static String EXPAND = "Plumelog";

    /**
     * 默认扩展
     */
    public final static String DEFAULT_EXPAND = "Plumelog";

    /**
     * Sleuth 扩展
     */
    public final static String SLEUTH_EXPAND = "Sleuth";

    /**
     * 所有支持的扩展
     */
    public final static List<String> EXPANDS = Arrays.asList("Plumelog", "Sleuth");


}
