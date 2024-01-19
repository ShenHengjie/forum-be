package com.forums.admin.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface UploadImageService {

    /**
     * 上传文件
     * @param file
     * @return
     */
    String uploadQNImg(MultipartFile file);
    String getPrivateFile(String fileKey);
}
