package cn.mldn.microcloud.rest;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.mldn.microcloud.config.InfoConfig;

@RestController
public class InfoClientRest {
	@Resource
	private InfoConfig infoConfig;
	@RequestMapping("/config")
	public String getConfig() {
		return "ApplicationName = " + this.infoConfig.getAppName()
				+ "、CompanyName = " + this.infoConfig.getCompanyName()
				+ "、ApplicationVersion = " + this.infoConfig.getAppVersion();
	}
}
