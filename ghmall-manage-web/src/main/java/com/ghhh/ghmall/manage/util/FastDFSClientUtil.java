package com.ghhh.ghmall.manage.util;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.domain.fdfs.ThumbImageConfig;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author galaxy
 * @date 19-10-26 - 下午7:38
 */
@Component
public class FastDFSClientUtil {

    private String reqHost = "192.168.3.215";

    private String reqPort = "80";

    @Autowired
    private FastFileStorageClient storageClient;

    @Autowired
    private ThumbImageConfig thumbImageConfig;

    public String uploadFile(MultipartFile file) throws IOException {
        StorePath storePath = storageClient.uploadFile(file.getInputStream(),file.getSize(),
                FilenameUtils.getExtension(file.getOriginalFilename()),null);
        return getAccessUrl(storePath);
    }

    private String getAccessUrl(StorePath storePath)
    {
        return "http://"+reqHost+":"+reqPort+"/"+storePath.getFullPath();
    }
}
