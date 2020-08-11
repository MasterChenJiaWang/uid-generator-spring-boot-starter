package com.daren.chen.uid.impl;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.daren.chen.uid.buffer.RingBuffer;

/**
 * UID 的配置
 *
 * @author wujun
 * @date 2019.02.20 10:31
 */
@ConfigurationProperties(prefix = "uid.cache")
public class CacheUidProperties {

    /**
     * RingBuffer size扩容参数, 可提高UID生成的吞吐量, 默认:3
     */
    private int boostPower = 3;

    /**
     * 指定何时向RingBuffer中填充UID, 取值为百分比(0, 100), 默认为50
     */
    private int paddingFactor = RingBuffer.DEFAULT_PADDING_PERCENT;

    public int getBoostPower() {
        return boostPower;
    }

    public void setBoostPower(int boostPower) {
        this.boostPower = boostPower;
    }

    public int getPaddingFactor() {
        return paddingFactor;
    }

    public void setPaddingFactor(int paddingFactor) {
        this.paddingFactor = paddingFactor;
    }
}
