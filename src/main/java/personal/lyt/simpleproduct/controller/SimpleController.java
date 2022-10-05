package personal.lyt.simpleproduct.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import personal.lyt.simpleproduct.domain.Param;
import personal.lyt.simpleproduct.service.ProxyService;
import personal.lyt.simpleproduct.service.SimpleService;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/simple")
public class SimpleController {

	@Resource
	private ProxyService proxyService;
	
	@GetMapping(value = "/req1")
	public int req1(Param param) {
		log.info("SimpleController：" + param.toString());
		return proxyService.process(param);
	}

	@GetMapping(value = "/req2")
	public int req2(Param param) {
		log.info("SimpleController：" + param.toString());
		return proxyService.asyncProcess(param);
	}
}
