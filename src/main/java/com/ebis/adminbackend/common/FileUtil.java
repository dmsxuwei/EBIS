package com.ebis.adminbackend.common;







import java.io.File;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;


/**
 * @Title 
 * @Description 
 * @CreateTime 2020年4月10日
 * @author David
 * @version 1.0
 */
public class FileUtil {

	
	protected static final Logger log = LoggerFactory.getLogger(FileUtil.class);
	
	public static String writeFile(MultipartFile file,String rootpath) throws Exception {
		if (file.isEmpty()) {
			throw new Exception( "文件为空");
		}
		// 获取文件名
		String fileName = file.getOriginalFilename();
		log.info("上传的文件名为：" + fileName);
		// 获取文件的后缀名
		String suffixName = fileName.substring(fileName.lastIndexOf("."));
		log.info("文件的后缀名为：" + suffixName);
		
		fileName=UUID.randomUUID().toString().replace("-", "")+suffixName;
		log.info("新的文件名为" + fileName);
		// 设置文件存储路径
		String filePath = rootpath;
		String path = filePath + fileName;
		
		log.info("PATH:"+path);
		File dest = new File(path);
		// 检测是否存在目录
		if (!dest.getParentFile().exists()) {
			dest.getParentFile().mkdirs();// 新建文件夹
		}
		file.transferTo(dest);// 文件写入
		return fileName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

