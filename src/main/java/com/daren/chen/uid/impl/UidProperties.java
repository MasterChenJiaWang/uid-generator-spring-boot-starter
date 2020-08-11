package com.daren.chen.uid.impl;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;

import com.daren.chen.uid.utils.DateUtils;

/**
 * UID 的配置
 *
 * @author wujun
 * @date 2019.02.20 10:31
 */
@ConfigurationProperties(prefix = "uid")
public class UidProperties {

    /**
     * 时间增量值占用位数。当前时间相对于时间基点的增量值，单位为秒
     */
    private int timeBits = 31;

    /**
     * 工作机器ID占用的位数
     */
    private int workerBits = 23;

    /**
     * 序列号占用的位数
     */
    private int seqBits = 9;

    /**
     * 时间基点. 例如 2019-02-20 (毫秒: 1550592000000)
     */
    private String epochStr = "2020-02-29";

    /**
     * 时间基点对应的毫秒数
     */
    private long epochSeconds = TimeUnit.MILLISECONDS.toSeconds(1550592000000L);

    /**
     * 是否容忍时钟回拨, 默认:true
     */
    private boolean enableBackward = true;

    /**
     * 时钟回拨最长容忍时间（秒）
     */
    private long maxBackwardSeconds = 1L;

    public int getTimeBits() {
        return timeBits;
    }

    public void setTimeBits(int timeBits) {
        if (timeBits > 0) {
            this.timeBits = timeBits;
        }
    }

    public int getWorkerBits() {
        return workerBits;
    }

    public void setWorkerBits(int workerBits) {
        if (workerBits > 0) {
            this.workerBits = workerBits;
        }
    }

    public int getSeqBits() {
        return seqBits;
    }

    public void setSeqBits(int seqBits) {
        if (seqBits > 0) {
            this.seqBits = seqBits;
        }
    }

    public String getEpochStr() {
        return epochStr;
    }

    public void setEpochStr(String epochStr) {
        if (StringUtils.isNotBlank(epochStr)) {
            this.epochStr = epochStr;
            this.epochSeconds = TimeUnit.MILLISECONDS.toSeconds(DateUtils.parseByDayPattern(epochStr).getTime());
        }
    }

    public long getEpochSeconds() {
        return epochSeconds;
    }

    public boolean isEnableBackward() {
        return enableBackward;
    }

    public void setEnableBackward(boolean enableBackward) {
        this.enableBackward = enableBackward;
    }

    public long getMaxBackwardSeconds() {
        return maxBackwardSeconds;
    }

    public void setMaxBackwardSeconds(long maxBackwardSeconds) {
        this.maxBackwardSeconds = maxBackwardSeconds;
    }

}