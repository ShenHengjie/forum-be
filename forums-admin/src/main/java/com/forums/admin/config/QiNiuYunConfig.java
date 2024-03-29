package com.forums.admin.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
@Data
@Configuration
public class QiNiuYunConfig {
    @Value("${oss.qiniu.url}")
    private String url;

    @Value("${oss.qiniu.accessKey}")
    private String AccessKey;

    @Value("${oss.qiniu.secretKey}")
    private String SecretKey;

    @Value("${oss.qiniu.bucketName}")
    private String BucketName;

}
