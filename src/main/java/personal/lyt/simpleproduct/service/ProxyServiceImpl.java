package personal.lyt.simpleproduct.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import personal.lyt.simpleproduct.domain.Param;

import javax.annotation.Resource;

@Service
@Slf4j
public class ProxyServiceImpl implements ProxyService {

    @Resource
    private SimpleService simpleService;

    @Override
    public int process(Param param) {
        return simpleService.process(param);
    }

    @Override
    public int asyncProcess(Param param) {
        simpleService.asyncProcess(param);
        return 1;
    }

}
