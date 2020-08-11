package com.daren.chen.uid;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.daren.chen.uid.impl.CacheUidProperties;
import com.daren.chen.uid.impl.CachedUidGenerator;
import com.daren.chen.uid.impl.DefaultUidGenerator;
import com.daren.chen.uid.impl.UidProperties;

/**
 * UID 的自动配置
 */
@Configuration
@ConditionalOnClass({DefaultUidGenerator.class, CachedUidGenerator.class})
@EnableConfigurationProperties({UidProperties.class, CacheUidProperties.class})
public class UidAutoConfigure {

}
